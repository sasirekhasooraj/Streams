//package arraylist;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.ToString;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestTransaction {
        public static void main(String[] args) {

                Trader raoul = new Trader("Raoul", "Cambridge");
                Trader mario = new Trader("Mario", "Milan");
                Trader alan = new Trader("Alan", "Cambridge");
                Trader brain = new Trader("Brain", "Cambridge");


                List<Transaction> transactions = Arrays.asList(
                        new Transaction(brain, 2011, 300),
                        new Transaction(raoul, 2012, 1000),
                        new Transaction(raoul, 2011, 400),
                        new Transaction(mario, 2012, 710),
                        new Transaction(mario, 2012, 700),
                        new Transaction(alan, 2012, 950));
                //Find all the transactions that occurred in 2012 and sort them by transaction amount (from low to high)
                transactions.stream()
                           .filter((t) -> t.getYear() == 2012)
                          .sorted((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()))
                        .forEach(System.out::println);
                //Traders have worked in different cities?
                transactions.stream()
                                .map((t) -> t.getTrader().getCity())
                                .distinct()
                                .forEach(System.out::println);
                transactions.stream()
                        .filter((t) -> t.getTrader().getCity().equals("Cambridge"))
                        .sorted((t1, t2) -> t1.getTrader().getName().compareTo(t2.getTrader().getName()))
                        .forEach(System.out::println);
                // 4. Return the name strings of all traders, sorted alphabetically
                transactions.stream()
                                .map((t) -> t.getTrader().getName())
                                .distinct()
                                .sorted()
                                .forEach(System.out::println);

                // 5. Do any traders work in Milan?
               boolean b = transactions.stream()
                                .anyMatch((t) -> t.getTrader().getCity().equals("Milan"));
                        System.out.println(b);

                // 6. Among all transactions, what is the maximum transaction amount?
                 Optional<Integer> first = transactions.stream()
                                .map(Transaction::getValue)
                                .max(Integer::compareTo);
                        System.out.println(first.get());

                        Optional<Integer> max = transactions.stream()
                                .map(Transaction::getValue)
                                .collect(Collectors.maxBy(Integer::compareTo));
                        System.out.println(max.get());


                // 7. Print the total turnover of traders living in Cambridge
                Optional<Integer> sum = transactions.stream()
                                .filter((t) -> t.getTrader().getCity().equals("Cambridge"))
                                .map(Transaction::getValue)
                                .reduce(Integer::sum);
                        System.out.println(sum.get());

                // 8. Find the transaction with the smallest transaction amount.
                Optional<Transaction> min = transactions.stream()
                                .min((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()));

                        System.out.println(min.get());

        }
}


        @Data
        @ToString
        @AllArgsConstructor
        class Trader {

                private final String name;

                private final String city;
        }



        @Data
        @AllArgsConstructor
        @ToString
        class Transaction {

                private final Trader trader;

                private final int year;

                private final int value;
        }

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class predicate {
    public static void main(String[] args) {
        IntPredicate isOdd = argument -> argument % 2 == 1;

        //1. Use predicate directly

        System.out.println(isOdd.test(9));    //true
        System.out.println(isOdd.test(10));   //false

        //2. Use predicate in filters

        IntStream stream = IntStream.range(1, 10);

        List<Integer> oddNumbers = stream.filter(isOdd)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(oddNumbers);
    }
}
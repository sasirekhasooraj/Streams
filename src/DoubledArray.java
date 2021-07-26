import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubledArray {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3,4,5,6,7,8,9,10);

        List <Integer> doubled = new ArrayList<>();

        for(int i=0; i< numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0)
            {
                doubled.add(numbers.get(i) * 2);
            }
        }
        System.out.println(doubled);

        }
        //parameter -> expression


  }

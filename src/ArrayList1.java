import java.util.ArrayList;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Sekar");
        list.add("Ajay");
        System.out.println("/////////Standard Loop/////////");
 //Iterate arraylist with standard for loop
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

System.out.println("/////////Iterator/////////");
//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
System.out.println("/////////For loop/////////");
        //Traversing list through for-each loop
        for(String name:list)
            System.out.println(name);

        System.out.println("/////////For each/////////");
        list.forEach(name -> System.out.println(name));

}
}

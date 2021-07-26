package customArrayList;
import java.util.ArrayList;
public class AddingData
    {
        // Create a ArrayList method of generic type 'Student'.
        ArrayList<Student> studentData()
        {
// Create three objects of the class Student and pass arguments to the constructor.
            Student s1 = new Student("Deep", 1234, 04);
            Student s2 = new Student("Shubh", 4321, 20 );
            Student s3 = new Student("Riddhi", 1212, 02);

// Create the object of ArrayList of generic type 'Student'.
            ArrayList<Student> studentlist = new ArrayList<Student>();

// Now add Student objects in the ArrayList using reference variable studentlist.
            studentlist.add(s1);
            studentlist.add(s2);
            studentlist.add(s3);

// Return object reference variable 'studentlist' of the array list to the method 'studentValue'.
            return studentlist;
        }

}

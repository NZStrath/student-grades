
package assignment1;
import java.util.*;

public class gradeExercise {
    
    public static void main (String[] args) {
       
   Scanner input1=new Scanner(System.in);
   System.out.println("Enter Student Name: ");
   String name;
   name = input1.next();
   
   Scanner input2=new Scanner(System.in);
   System.out.println("Enter Student Grade: ");
   String grade;
   grade = input2.next();
   
   Scanner input3=new Scanner(System.in);
   System.out.println("Enter Student Mark: ");
   double mark;
   mark = input3.nextDouble();
   
   System.out.println("Student name = "+name+ "Student Grade: "+grade+"Student Mark: "+mark);
        
}

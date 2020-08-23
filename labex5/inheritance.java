package labex5;

import java.util.*;

/**
 *
 * @author Desktop Pc
 */
public class inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student1 obj=new student1();
        staff obj1=new staff();
        obj.getstudent1details();
        obj.display1();
        obj1.getstaffdetails();
        obj1.display2();
       
        
    }
    
}
class book
{
    String name;
    int accessno;
    String author;
    Scanner obj=new Scanner(System.in);
    public void getbookdetails()
    {
        System.out.println("Enter the name of the book:");
        name=obj.next();
        System.out.println("Enter the access no::");
        accessno=obj.nextInt();
        System.out.println("Enter the author name:");
        author=obj.next();
    }
    public void display()
    {
        System.out.println("BOOK DETAILS");
        System.out.println("Name of the book:"+name);
        System.out.println("Access no of the book:"+accessno);
        System.out.println("Author name:"+author);
         
    }
}
class student1 extends book
{
    String name;
    String rollno;
    String dept;
    public void getstudent1details()
    {
        super.getbookdetails();
        System.out.println("Enter the name of the student:");
        name=obj.next();
        System.out.println("Enter the roll number of the student:");
         rollno=obj.next();
        System.out.println("Enter the department of the student:");
         dept=obj.next();
    }
    public void display1()
    {
        super.display();
           System.out.println("STUDENT DETAILS");
           System.out.println("Name of the student:"+name);
           System.out.println("Rollno of the student"+rollno);
           System.out.println("Department of the student:"+dept);
    }
}
class staff extends book
{
    String name;
    String id;
    String dept;
    public void getstaffdetails()
    {
        super.getbookdetails();
        System.out.println("Enter the name of the staff:");
        name=obj.next();
        System.out.println("Enter the ID of the staff:");
        id=obj.next();
        System.out.println("Enter the department of the staff:");
        dept=obj.next();
    }
        public void display2()
        {
            super.display();
          System.out.println("STAFF DETAILS");
          System.out.println("Name of the staff:"+name);
          System.out.println("ID of the staff:"+id);
          System.out.println("Department of the staff:"+dept);
        }              
}
// java program to use Abstract method
//abstract class
abstract class Student{
public String fname="john";
public int age=24;
public abstract void study();//abstract method 
}
//Subclass (inherit from main)
class Stud extends Student{
    public int graduationyear=2010;
    public void study()
    {//the body of the abstract methode is providing here
        System.out.println("Studying all day long");
    }
}
//End code from filename : Student.java
 
//code from filename :Second.java
class Second{
    public static void main(String[]args)
    {
        /*create an object of the student class (which inherits attributesand methodes from main*/
    Stud myobj=new Stud();
    System.out.println("Name : " + myobj.fname);
    System.out.println("age :" + myobj.age);
    System.out.println("Graduataion year :" + myobj.graduationyear);
    myobj.study();//call abstract method
    }
}


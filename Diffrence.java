//Diffrence between static and public methods
public class Diffrence {
  //static method
    static void mystaticmethod()
    {
        System.out.println("static method can be called without creating object");
    }
    //public method
    public void mypublicmethod()
    {
        System.out.println("public methods must be called by creating objects ");
    }
    //main method
    public static void main(String[]args)
    {
        mystaticmethod();//call the static method
        //mypublicmethod();this would output an error
        Diffrence myobj=new Diffrence();//Create an object of main
        myobj.mypublicmethod();//callthe public method
    }
}

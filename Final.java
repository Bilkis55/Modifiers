//use of Final key word
public class Final {
    final int x=50;
    final double PI=3.14;
    public static void main(String[]args)
    {
        Final myobj=new Final();
     //   myobj.x=10;/*will generate an error : cannot assign a value to a final varible*/
       // myobj.PI=25;//same error display here
        System.out.println(myobj.x);
         
        
    }
}

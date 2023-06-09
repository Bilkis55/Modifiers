
public class Override {
    void run(){System.out.println("Vehical is running");}
}
//create child class
class byke extends Override
{
public static void main(String[]args)
{
Bike obj=new Bike();
//calling the method with child class instance
obj.run();
}
}

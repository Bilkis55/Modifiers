class OuterClass{
    int x=10;

public class Innerclass {
    int y=20;
    
}}
public class Main
{
    public static void main(String[]args)
    {
        OuterClass myout=new OuterClass();
       OuterClass.Innerclass myinner=myout.new Innerclass();
        System.out.println(myinner.y+myout.x);
       
        
                
                
       
    }

             
}
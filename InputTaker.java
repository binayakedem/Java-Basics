
import java.util.Scanner;

// this class is maily i declare for input taker in overall my program 
public class InputTaker {
    Scanner sc=new Scanner(System.in);
   public float firstNumber(){
System.out.println("Enter first number:");
float var=sc.nextInt();
    return var;
   }
   public float secondNumber(){
    System.out.println("Enter Second number:");
    float var=sc.nextInt();
        return var;
       }
    // this is  input for pattern

    public int myRow(){
      int var;
      System.out.println("Enter the row size:");
      var=sc.nextInt();
        return  var;
    }
    public int myCol(){
        int var;
        System.out.println("Enter the col size:");
        var=sc.nextInt();
          return  var;
      }
   
}

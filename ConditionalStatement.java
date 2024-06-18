
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        // this is for if, else and else if

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the your age:");
        int age=sc.nextInt();
        if(age<15){
            System.out.println("You are too youg to apply visa");
        }else if(age<20){
            System.out.println("You are eligible to apply visa");
        }else if (age<30){
         System.out.println("You are perfect to appply");
        }else{
            System.out.println("You are too old to apply");
        }


        // now this line of code start for the switch case


        // simple calculator using while loop and switch case
        
        myCal obj=new myCal();
        InputTaker inp=new InputTaker();
        int var=1;  
        while(var!=0){
            System.out.println("Enter your choice");
            obj.Menu();
            var=sc.nextInt();
            switch (var) {
                case 1:
                 obj.Sum(inp.firstNumber(), inp.secondNumber());
                    break;
                case 2:
                    obj.Subtract(inp.firstNumber(), inp.secondNumber());
                    break;
                case 3:
                     obj.Div(inp.firstNumber(), inp.secondNumber());
                    break;
                 case 4:
                    obj.Mult(inp.firstNumber(), inp.secondNumber());
                   break;
                default:
                    System.out.println("Invalid choice!!");
            }

        }
        


    }
}

class myCal{
    public void Sum(float var1, float var2){
        float mySum=var1+var2;
        System.out.println("Total sum is:"+mySum);
    }
    public void Mult(float var1, float var2){
        float mySum=var1*var2;
        System.out.println("Multiplication is:"+mySum);
    }
    public void Div(float var1, float var2){
        float mySum=var1/var2;
        System.out.println("Division is:"+mySum);
    }
    public void Subtract(float var1, float var2){
        float mySum=var1-var2;
        System.out.println("Subtraction is:"+mySum);
    }
    public void Menu(){
        System.out.println("0. Exit");
        System.out.println("1. Add");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
    }
}
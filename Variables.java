import java.util.Scanner;
public class Variables {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);

        // this line prints the integer type to display the sum   of two numbers
        System.out.println("Enter the first number to sum:");
        int var1=sc.nextInt();
        System.out.println("Enter the second number to sum:");
        int var2=sc.nextInt();
        mySum obj=new mySum();
        obj.sum(var1, var2);

        // this line of codes divides the two numbers

        System.out.println("Enter the first number to division:");
        float var3=sc.nextFloat();
        System.out.println("Enter the second number to division:");
        float var4=sc.nextFloat();
        obj.division(var3, var4);
        

    }
}

class mySum{
    public void sum(int var1, int var2){
     int var=var1+var2;
     System.out.println("Total sum is given by:"+var);
    }
    public void division(float var1, float var2){
        float mydiv=var1/var2;
        System.out.println("Division value is :"+mydiv);
    }
}

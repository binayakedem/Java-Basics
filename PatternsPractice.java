
import java.util.Scanner;

public class PatternsPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 PatternsPractice obj=new PatternsPractice();
 InputTaker inp =new InputTaker();
int choice=9;
while (choice!=0) { 
    obj.Menu();
    System.out.println("Enter your choice");
    choice=sc.nextInt();
    switch (choice) {
        case 1:
        obj.solidRectangle(inp.myCol(), inp.myCol());
            break;
        default:
            System.out.println("Invalid choice");
    }
    
}



    }


    public void solidRectangle(int r, int c){
    for(int i=0; i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    public void Menu(){
        System.out.println("0. Exit");
        System.out.println("1. Again Print");
    }
}

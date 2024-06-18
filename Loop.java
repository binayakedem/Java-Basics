public class Loop {
    public static void main(String[] args) {
        // loop

        // there are mainly three types of loops in java
        // while loop, do while loop and for loop


        // for loop
        // this simply prints the 1 to 20
        System.out.println("Printing 1 to 20");
        for(int i=0;i<20;i++){
          System.out.println(i);
        }

        // while loop
        System.out.println("Printing reverse of number");
        int var=20;
        while(var!=-1){
            System.out.println(var);
            var--;
        }

        // do while loop
        int i=40;

        System.out.println("printing 40 to 60 using do while loop ");
        do { 
            System.out.println(i);
            i++;
        } while (i<61);

    }
}

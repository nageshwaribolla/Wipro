import java.util.Scanner;

public class BiggestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
         int b=sc.nextInt();
        if(a>b){
            System.out.println(" A is Biggest Number");
        }else{
            System.out.println( "B is Biggest Number");
        }
        sc.close();
    }
    
}

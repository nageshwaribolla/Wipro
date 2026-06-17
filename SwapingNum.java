import java.util.Scanner;

public class SwapingNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swaping: a = "+a+",b="+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swaping: a = "+a+",b="+b);
        sc.close();
    }
    
}

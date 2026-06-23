import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("Pasitive Number"+n);
		}
		else if(n<0) {
			System.out.println("Negative Number"+n);
		}
		else {
			System.out.println("Zero");
		}
		sc.close();
    }
    
}

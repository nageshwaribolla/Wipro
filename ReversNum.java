import java.util.Scanner;

public class ReversNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int res=n%10;
            sum=sum*10+res;
            n=n/10;
            System.out.println(sum);
        }
        sc.close();
    }
    
}

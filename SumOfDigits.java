public class SumOfDigits {
    public static void main(String[] args) {
        int d,n=123;
         int sum=0;
        while(n!=0){
           
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println("sum of digits : "+sum);
    }
    
}

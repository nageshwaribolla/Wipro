import java.util.Scanner;

public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
      return a-b;//display the values
    }
    int mul(int a,int b){
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }
    int mod(int a,int b){
        return a%b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("Enter the number");
        int b=sc.nextInt();
        Calculator c=new Calculator();
        System.out.println("Addition: "+c.add(a,b));
        System.out.println("Subtraction: "+c.sub(a,b));
        System.out.println("Multiplication: "+c.mul(a,b));
        System.out.println("Division: "+c.div(a,b));
        System.out.println("Modulas:"+c.mod(a,b));
        sc.close();
    }
    }


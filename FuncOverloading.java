import java.util.Scanner;

public class FuncOverloading {
   int add(int a,int b){
     return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        FuncOverloading obj=new FuncOverloading();
        System.out.println("Adding Two values :"+obj.add(a,b)); //give the values in a,b places
        System.out.println("Adding three values: "+obj.add(a,b,c));
        sc.close();
    }
    
}

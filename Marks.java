import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int m1=sc.nextInt();
         int m2=sc.nextInt();
         int m3=sc.nextInt();
         int m4=sc.nextInt();
         int m5=sc.nextInt();
         int m6=sc.nextInt();
        int total=m1+m2+m3+m4+m5+m6;
        float avg=total/6;
         System.out.println("Total:"+total);
          System.out.println("Avg:"+avg);
          if(m1<35 || m2<35 || m3<35 || m4<35 || m5<35 || m6<35 ){
             System.out.println("fail");
          }
        if(avg>70){
            System.out.println("Distinction");
        } else if(avg>70 && avg<60){
            System.out.println("1st ");
        }else if (avg>60 && avg<50){
            System.out.println("2nd");
        }
        else{
            System.out.println("fail");

        }
        sc.close();
    }
    
}

//write a java program to find the area of a rectangle
import java.util.Scanner;
class Rectangle
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int b=sc.nextInt();
int area=l*b;
System.out.println("Area of rectangle is:" + area);
sc.close();
}
}


import java.util.Scanner;

public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
     char ch=sc.next().charAt(0);
     if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')){
    	 System.out.println("Alphabets :"+ch);
     }
     else if(ch>='0'&& ch<='9') {
    	 System.out.println("digits"+ch);
     }
     else {
    	 System.out.println("Special Character :"+ch);

     }
     sc.close();
    }
    
}

public class Arith {
    Arith(int a,int b){
        System.out.println("Add "+(a+b));
        System.out.println("Sub "+(a-b));
        System.out.println("mul "+(a*b));
    }
    
    public static void main(String[] args) {
      Arith obj=new Arith(10, 20);
    }
}


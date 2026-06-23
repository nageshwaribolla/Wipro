public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println("defaultcons");
    }
    ConstructorOverloading(String s){
        System.out.println("My name is "+s);
    }
    public static void main(String[] args) {
        ConstructorOverloading obj1=new ConstructorOverloading();
        ConstructorOverloading obj2=new ConstructorOverloading("Nagi");
        
    }
    
}

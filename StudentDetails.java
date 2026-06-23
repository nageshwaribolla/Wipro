public class StudentDetails{
    int rollnum;
    String name;
    String branch; 
    StudentDetails(int r,String n,String b){
     rollnum=r;
     name=n;
     branch=b;
    }
    void display() {
    
         System.out.println(rollnum +"  "+name+"  "+branch);
    }
    

    public static void main(String[] args) {
        StudentDetails s1=new StudentDetails(101,"sachin","EcE");
        StudentDetails s2=new StudentDetails(102,"David","EEE");
        StudentDetails s3=new StudentDetails(103,"Dhanush","civil");
        s1.display();
        s2.display();
        s3.display();
     
    }

}

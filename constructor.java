class Student{
    
    int roll_no;
    String address;
    String name;

    Student(int roll_no,String address, String name){
        this.roll_no=roll_no;
        this.address=address;
        this.name=name;
        System.out.println("Hello");
    }

} 
public class constructor {
    public static void main(String[] args) {
        Student s1=new Student(1,"Pune","Ankita");

    }
    
}

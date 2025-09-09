class Student {
    int rollNo;
    String name; 
 
    Student(int rollNo, String name) { 
        this.rollNo = rollNo;
        this.name = name; 
    }
    Student(Student s) {
        this.rollNo = s.rollNo; 
        this.name = s.name; 
    } 
    void display() { 
        System.out.println("Roll No: " + rollNo + ", Name: " + name); 
    } 
} 
 
public class p8_CopyAndParameterizedConstructor {     
    public static void main(String[] args) { 
        Student s1 = new Student(21, "Aniruddha"); 
        Student s2 = new Student(s1); 
 
        s1.display();
        s2.display(); 
    } 
}
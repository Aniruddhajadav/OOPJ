class Student {
    int rollNo;
    String name; 
 
    Student() { 
        rollNo = 0;
        name = "Unknown"; 
    }
    void display() { 
        System.out.println("Roll No: " + rollNo + ", Name: " + name); 
    } 
} 
public class p7_Constructor { 
    public static void main(String[] args) { 
        Student s1 = new Student(); 
        s1.display();
    } 
} 

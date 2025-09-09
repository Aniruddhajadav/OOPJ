class Student {
    String name;
    int marks; 
 
    Student(String n, int m) { 
        this.name = n; 
        this.marks = m; 
    } 

    void display() { 
        System.out.println("Name: " + name + ", Marks: " + marks); 
    } 
} 

public class p10_4_ReturnObject {
    static Student getStudent() { 
        Student s = new Student("Aniruddha", 95);
        return s; 
    } 
    public static void main(String[] args) {
        Student result = getStudent(); 
        result.display(); 
    }
}
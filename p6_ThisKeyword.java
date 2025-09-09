class Student {
    int rollNo;
    String name;
    Student(int rollNo, String name) { 
        this.rollNo = rollNo; 
        this.name = name; 
    } 
    void display() {
        this.show(); 
    } 
    void show() {
        System.out.println("Roll No: " + this.rollNo); 
        System.out.println("Name: " + this.name);
    }
}
public class p6_ThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student(121, "Aniruddha");
        s1.display(); 
    }
}
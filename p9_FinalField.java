class Circle { 
    final double PI = 3.14159;
    double radius;
 
    Circle(double r) {
        radius = r; 
    } 
 
    void displayArea() {
        double area = PI * radius * radius;
        System.out.println("Radius: " + radius); 
        System.out.println("Area: " + area); 
    } 
} 
public class p9_FinalField { 
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        c1.displayArea(); 
        System.out.println("Accessing final field PI: " + c1.PI);
    } 
} 

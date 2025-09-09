class Grandfather {
    void showGrandfather() {
        System.out.println("I am Grandfather"); 
    } 
} 
 
class Father extends Grandfather {
    void showFather() {
        System.out.println("I am Father"); 
    } 
} 
 
class Son extends Father {
    void showSon() {
        System.out.println("I am Son"); 
    } 
} 
 
public class p11_2_MultilevelInheritance {
    public static void main(String[] args) {
        Son s = new Son(); 
        s.showGrandfather(); 
        s.showFather(); 
        s.showSon(); 
    } 
}
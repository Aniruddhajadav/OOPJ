class Number { 
    int value; 
}  
public class p10_2_PassByReference {
    static void modify(Number num) { 
        num.value = num.value + 10; 
    } 
    public static void main(String[] args) {
        Number n = new Number();
        n.value = 20; 
        modify(n); 
        System.out.println("Modified value: " + n.value); 
    }
}
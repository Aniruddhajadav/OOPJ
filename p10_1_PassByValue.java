public class p10_1_PassByValue {
    static void modify(int x) {
        x = x + 10; 
        System.out.println("Inside method: x = " + x); 
    } 
    public static void main(String[] args) {
        int x = 20;
        modify(x); 
        System.out.println("Outside method: x = " + x); 
    } 
}
public class p10_3_ReturnValue {
    static int square(int x) {
        return x * x; 
    } 
    public static void main(String[] args) { 
        int num = 5; 
        int result = square(num); 
        System.out.println("Square of " + num + " is: " + result); 
    } 
}
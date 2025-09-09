public class p13_MultipleTryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30}; 
            System.out.println("Element at index 2: " + arr[2]);
            try { 
                int result = 10 / 0; // ArithmeticException 
                System.out.println("Result: " + result); 
            } catch (ArithmeticException e) { 
                System.out.println("Inner Catch - ArithmeticException: " + e.getMessage()); 
            } 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Outer Catch - ArrayIndexOutOfBoundsException: " + e.getMessage()); 
        } catch (Exception e) { 
            System.out.println("Outer Catch - General Exception: " + e.getMessage()); 
        }
        System.out.println("Program continues after exception handling..."); 
    }
}
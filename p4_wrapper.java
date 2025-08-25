public class p4_wrapper {
    public static void main(String[] args) {
        byte b = 10;
        Byte byteObj = Byte.valueOf(b);
        System.out.println("Byte object: " + byteObj);

        short s = 100;
        Short shortObj = Short.valueOf(s);
        System.out.println("Short object: " + shortObj);
 
        int i = 200;
        Integer intObj = Integer.valueOf(i);
        System.out.println("Integer object: " + intObj);
 
        long l = 30000L;
        Long longObj = Long.valueOf(l);
        System.out.println("Long object: " + longObj);
 
        float f = 10.5f;
        Float floatObj = Float.valueOf(f);
        System.out.println("Float object: " + floatObj);
 
        double d = 99.99;
        Double doubleObj = Double.valueOf(d);
        System.out.println("Double object: " + doubleObj);
 
        char c = 'A';
        Character charObj = Character.valueOf(c);
        System.out.println("Character object: " + charObj);
 
        boolean bool = true;
        Boolean boolObj = Boolean.valueOf(bool);
        System.out.println("Boolean object: " + boolObj);
    }
}
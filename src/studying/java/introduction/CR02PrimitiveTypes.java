package studying.java.introduction;
// Understanding Primitive Types

public class CR02PrimitiveTypes {
    public static void main(String[] args) {
        // int, double, float, char , byte, short, long , boolean

        String text = "One big text";
        String name = "Rael";
        int age = 7;
        long bigNumber = 1000000L;
        double wearDouble = 2000D;
        float wearFloat = 2500.0F;
        byte ageByte = 127;
        short ageShort = 10;
        boolean correct = true;
        boolean untrue = false;
        char character = 'N';

        System.out.println(bigNumber);
        System.out.println(wearDouble);
        System.out.println(wearFloat);
        System.out.println(ageByte);
        System.out.println(ageShort);
        System.out.println(correct);
        System.out.println("The age is " +age+ " years old");
        System.out.println(untrue);
        System.out.println("Char "+character);
        System.out.println(text);
        System.out.println("Hello, my name is "+name+", great pleasure!");
    }
}

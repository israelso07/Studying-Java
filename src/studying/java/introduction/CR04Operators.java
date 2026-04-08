package studying.java.introduction;
// Understanding Operators Base

public class CR04Operadores {
    public static void main(String[] args) {
        // + - / *\
        int number01 = 10;
        int number02 = 20;
        int result = number01*number02;

        System.out.println(number01+number02+" Value "+number01+number02);
        System.out.println(result);

        // %
        System.out.println("-------------------");

        int rest = 20 % 2;
        System.out.println(rest);

        // < > == <= >= =!
        System.out.println("-------------------");

        boolean isTenBiggerTwenty = 10 > 20;
        boolean isTenSmallerTwenty = 10 < 20;
        boolean isTenEqualTwenty = 10 == 20.0;
        boolean isTenSmallerOrEqualTwenty = 10 <= 20;
        boolean isTenBiggerOrEqualTwenty = 10 >= 20;
        boolean isTenEqualOrDifferentTwenty = 10 != 20;

        System.out.println("isTenBiggerTwenty "+isTenBiggerTwenty);
        System.out.println("isTenSmallerTwenty "+isTenSmallerTwenty);
        System.out.println("isTenEqualTwenty "+isTenEqualTwenty);
        System.out.println("isTenSmallerOrEqualTwenty "+ isTenSmallerOrEqualTwenty);
        System.out.println("isTenBiggerOrEqualTwenty "+ isTenBiggerOrEqualTwenty);
        System.out.println("isTenEqualOrDifferentTwenty "+ isTenEqualOrDifferentTwenty);

        // && (And) || (Or) !
        System.out.println("-------------------");

        byte age = 35;
        float wear = 3792F;
        boolean isInsideLaw = age >= 30 && wear >= 2423;
        boolean isOutSideLaw = age <= 30 && wear <= 2423;
        boolean isEnteringLaw = age >= 30 || wear <= 2423;
        boolean isLaw = age >= 30 || wear >= 3792;

        System.out.println("Is Inside Law? "+isInsideLaw);
        System.out.println("Is Outside Law? "+isOutSideLaw);
        System.out.println("Is Entering Law? "+isEnteringLaw);
        System.out.println("By law, you must be over 30 years old or earn more than 3792. Do you fit this profile? "+isLaw);

    }
}

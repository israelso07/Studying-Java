package studying.java.introduction;
// Understanding Operators Base

public class CR04Operators {
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

        System.out.println("-------------------");

        double valueTotalAccCurrent = 200;
        double valueTotalAccSaving = 10000;
        boolean buyPS5 = valueTotalAccCurrent >= 3579.56 || valueTotalAccSaving >= 5000;
        boolean lander2026 = valueTotalAccCurrent >= 30000 || valueTotalAccSaving >= 30000;

        System.out.println("I can buy PS5? "+buyPS5);
        System.out.println("I can buy Lander 2026? "+lander2026);

        byte isAgeLicense = 18;
        double isValueToBuyLicense = 500;
        boolean BuyLicense = isAgeLicense >= 18 && isValueToBuyLicense >= 500;

        System.out.println("I can buy license? "+BuyLicense);

        // == += -= *= /= %=
        System.out.println("-------------------");

        double bonus = 1700; // 1700
        bonus += 1000; // 2700
        bonus -= 1000; // 1700
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int counter = 0; // 0
        counter += 1; // 1
        counter++; // 2
        counter--; // 1
        System.out.println(counter);

    }
}

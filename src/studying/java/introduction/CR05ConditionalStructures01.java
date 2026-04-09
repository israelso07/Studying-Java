package studying.java.introduction;
// Initializing IF and ELSE
public class CR05ConditionalStructures {
    public static void main(String[] args) {
        byte age = 28;
        boolean isAuthorizedCanBuyDrink = age >= 18;

        if (isAuthorizedCanBuyDrink) {
            System.out.println("Authorized, can buy drink!");
        }else{
            System.out.println("No authorized.");
        }
        // ! different true
        if (!isAuthorizedCanBuyDrink) {
            System.out.println("No authorized.");
        }
    }
}

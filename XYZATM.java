import java.util.ArrayList;
import java.util.*;

public class XYZATM{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        ArrayList<Card> cardList = new ArrayList<>();
        ATM atm=new ATM();
        while (condition) {
displayMenu();
            switch (input.nextInt()) {
                case 1:
                    Bank bank=new Bank();
                  bank.creatingCard();
                  System.out.println("Card is created successfully");
                    break;
                case 2:

                   atm.depositAmount();
                    break;
                case 3:
                    atm.withdrawAmount();
                    break;
                case 4:
                    atm.swiping();
                    break;
                case 5:
                    Card card=new Card();
                    System.out.println("Enter the card Number");
                    int cardNumber=input.nextInt();
                    System.out.println("Enter the pin ");
                    int pin=input.nextInt();
                    System.out.println(card.getBalance(cardNumber,pin));
            case 6:condition=false;
                System.out.println("Thankyou");
                    break;
            }
        }
    }
public static void displayMenu()
{
    System.out.println("Enter the action to be performed");
    System.out.println("1.Create Account");
    System.out.println("2.Deposit Amount");
    System.out.println("3.Withdraw Amount");
    System.out.println("4.swipe for shopping");
    System.out.println("5.Get balance");
    System.out.println("6.Exit");
}

}
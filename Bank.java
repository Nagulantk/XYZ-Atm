import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    Scanner input=new Scanner(System.in);
    public void creatingCard() {
        System.out.println("Enter the card number");
       int cardNumber = input.nextInt();
        System.out.println("Enter the pin");
       int pin = input.nextInt();
        System.out.println("Enter the balance");
      int balance = input.nextInt();
        if (balance < 101) {
            System.out.println("Please provide balance more than 100");
            balance = input.nextInt();
        }
        Card card = new Card(cardNumber, balance, pin);
   Card.cardList.add(card);


    }
    public Card accountVerification(ArrayList<Card> cardList)
    {
        System.out.println("Enter the Customer ID");
        int customerID=input.nextInt();
        System.out.println("Enter pin");
        int pin=input.nextInt();
        for(Card card:cardList)
        {
            if(card.getCardNumber()==customerID&& card.getPin()==pin)
            {
                return card;
            }
        }
        return null;
    }
    public void displayDetails(ArrayList<Card> cardList)
    {
        for(Card card:cardList)
        {
            System.out.println("Account Number:" +card.getCardNumber()+" Balance:USD "+card.getBalance(card.getCardNumber(),card.getPin()));
        }
    }

}
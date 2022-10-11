import java.util.ArrayList;
import java.util.Scanner;

public class Card {
    private int cardNumber;
    private  int balance;
    private int pin;
    static ArrayList<Card> cardList = new ArrayList<>();
    Scanner input=new Scanner(System.in);
    public Card()
    {}

    public Card(int cardNumber, int balance, int pin)
    {
        this.cardNumber=cardNumber;
        this.balance=balance;
        this.pin=pin;
    }
    public int getBalance(int cardNumber,int pin) {
        for(Card card:cardList)
        {
            if(card.cardNumber==cardNumber&&card.pin==pin)
            {
                return card.balance;
            }

        }
        return 0;
    }

    public int getPin() {
        return pin;
    }

    public int getCardNumber() {
        return cardNumber;
    }public void setBalance(int cardNumber,int pin,int amount) {
        for(Card card:cardList)
        {
            if(card.cardNumber==cardNumber&&card.pin==pin)
            {
                card.balance+=amount;
            }
        }

    }
    public void deductBalance(int cardNumber,int pin,int amount) {
        for(Card card:cardList)
        {
            if(card.cardNumber==cardNumber&&card.pin==pin)
            {
                card.balance-=amount;
            }
        }

    }







}

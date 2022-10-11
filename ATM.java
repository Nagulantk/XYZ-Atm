import java.util.Scanner;

public class ATM extends Card{
    Bank bank=new Bank();

    public ATM()
    {}

    public ATM(int cardNumber,int balance,int pin) {
        super(cardNumber, balance, pin);
    }

    public  void withdrawAmount() {

        Card card = bank.accountVerification(cardList);
        if (card != null) {
            System.out.println("Enter the amount to be withdrawn");
           int  amount = input.nextInt();
            if(amount<=100) {
                taxCalculation(card,amount,0.02f);
                System.out.println("Tax:"+amount*0.02);
            }
            else {
                taxCalculation(card,amount,0.04f);
                System.out.println("Tax:"+amount*0.04);
            }
        }
        else
        {
            System.out.println("Invalid CustomerID and details");
        }
      bank.displayDetails(cardList);
    }
    public static void taxCalculation(Card card,int amount,float tax)
    {
        if (amount < (card.getBalance(card.getCardNumber(), card.getPin()) - amount *tax)) {
            amount=(int)(amount+amount*tax);
            card.deductBalance(card.getCardNumber(), card.getPin(),amount);
            System.out.println("Amount is withdrawn Successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }


    public  void depositAmount() {
        Card card = bank.accountVerification(cardList);
        if (card != null) {
            System.out.println("Enter the amount to be deposited");
          int  amount = input.nextInt();
            card.setBalance(card.getCardNumber(), card.getPin(),amount) ;
            System.out.println("Amount is deposited successfully");

        }
        else
        {
            System.out.println("Invalid CustomerID and details");
        }
        bank.displayDetails(cardList);
    }
    public  void swiping()
    {
        Card card=bank.accountVerification(cardList);
        if(card!=null)
        {
            System.out.println("Enter the shopping amount");
            Scanner input=new Scanner(System.in);
           int amount=input.nextInt();
            if(amount< card.getBalance(card.getCardNumber(), card.getPin())){
                amount=(int)(amount-amount*0.01);
              card.deductBalance(card.getCardNumber(), card.getPin(), amount);
                System.out.println("Amount is swiped Successfully");
                System.out.println("CashBack:"+amount*0.01);
            }
            else {
                System.out.println("Insufficient Balance");}
        }
        else
        {
            System.out.println("Invalid customer id and details");
        }
        bank.displayDetails(cardList);
    }
}

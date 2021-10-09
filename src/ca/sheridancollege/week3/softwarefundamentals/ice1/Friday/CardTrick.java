// student ID: 991602158
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Samuel Ijeli
 */
public class CardTrick {
    private int cardNumber; 
    
    public static void main(String[] args)
    {
     Card.print = new Card();
     
        System.out.print("Suit is " + print.getSuit() + "and value is" + print.getValue());      
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    
}

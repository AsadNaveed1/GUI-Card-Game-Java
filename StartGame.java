import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * 
 * @author Muhammad Asad Naveed
 * UID: 3035957848
 * COMP 2396
 * Assignment 3
 * 
 * This is the StartGame class it shuffles the cards and gives the player his initial cards
 * 
 */


public class StartGame  {


    // this is a start game method it disables the start button
    // enables all the replace button and the result button


    public void startgame(JButton startbtn, JButton resultbtn, JButton replacebtn1, JButton replacebtn2, JButton replacebtn3, JLabel info1, int betamount)
    
    {


        startbtn.setEnabled(false);

        
        resultbtn.setEnabled(true);
        replacebtn1.setEnabled(true);
        replacebtn2.setEnabled(true);
        replacebtn3.setEnabled(true);


        info1.setText("Your current bet is: $"+betamount);



    }


    // this is a shuffle cards method 
    // a random suit and number is found, using these two we find a random card that can be stored in the 
    // Cards[] array
    //
    // we run a while loop 9 times to find 9 new random cards and store in Cards[] array
    //
    // to make sure we dont get the same card twice I used a checker, using this we compare all the cards
    // that we have in the current cards array with the new card that we are going to add to the array
    // if the new card is already in the array we find a new card else we add the card to the array
    //
    // after all the 9 cards are found, we assign the first 3 cards to the player initially
    //
    // The suit variable contains random number from 1 to 4 because there are 4 suits
    // The number value gives the value of the card ranging from 1 to 13
    // finalnumber variable combines suit and number value to make a number that we can access from the images folder

    public void shufflecards(JLabel x, JLabel y, JLabel z, String[] Cards, int[] cardvalues)
    {
        Random random = new Random();

        int i = 0;

        boolean checker;
        String finalnumber;
        int suit;
        int number;

        while(i<=8)
        {
            checker = true;
            suit = Math.abs(random.nextInt())%4+1;
            number = Math.abs(random.nextInt())%13+1;

            finalnumber = Integer.toString(suit)+Integer.toString(number);

            for(int j =0; j<i; j++ )
            {
                if(Cards[j].equals(finalnumber))
                {
                    checker = false;   

                }

            }
            // to check if the card is already in the array    
            
            if(checker != false)
            {

                cardvalues[i] = number;
                Cards[i] = finalnumber;
                i++;
            }
        }



        x.setIcon(new ImageIcon("Images/card_"+Cards[0]+".gif"));
        y.setIcon(new ImageIcon("Images/card_"+Cards[1]+".gif"));
        z.setIcon(new ImageIcon("Images/card_"+Cards[2]+".gif"));

     

        

    }



    
}

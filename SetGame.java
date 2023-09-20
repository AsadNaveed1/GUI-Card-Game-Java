import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

/**
 * 
 * @author Muhammad Asad Naveed
 * UID: 3035957848
 * COMP 2396
 * Assignment 3
 * 
 * This is the SetGame class that implemts the ActionListener interface 
 * this controls all the interface stuff, all the buttons, input and messages
 * 
 */


public class SetGame implements ActionListener{

    /**
	 * mainpanel:           this is the main panel that has 2 rows and 1 column and it holds 2 sub panels i.e gamepanel and actionpanel
     * gamepanel:           first sub panel of the mainpanel it holds 3 sub panels i.e dealerpanel, playerpanel and replacecardbtnpanel
     * dealerpanel:         holds the 3 dealer cards
     * playerpanel:         holds the 3 player cards
     * replacecardbtnpanel: holds the 3 replace card buttons
     * actionpanel:         second sub panel of the mainpanel, it holds 2 subpanels i.e controlbtnpanel and infopanel
     * controlbtnpanel:     holds bet label, bet input textarea, startbtn and resultbtn
     * infopanel:           info1 and info2 label
     * 
     * dealercard1, dealercard2, dealercard3: all are dealer cards and are JLabels 
     * playercard1, playercard2, playercard3: all are player cards and are JLabels 
     * 
	 * startbtn:    starts the game shows player his cards, its a JButton
     * resultbtn:   gives the game result, its a JButton
     * replacebtn1: replaces the first card of the player
     * replacebtn2: replaces the second card of the player
     * replacebtn3: replaces the third card of the player
     * 
     * bet:      its a JLabel showing "Bet :$"
     * betinput: its a JTextField showing a textarea for player to input his bet
     * 
     * info1:    its a JLabel showing "Please place your bet! "
     * info2:    its a JLabel showing "Amount of money you have: $100"
     * 
     * exit:     its the exit button in the menu
     * menu:     its a JMenunholding exit btn
     * menuBar:  its a JMenuBar holding menu
     * 
     * wallet:   holds the players money in hand
     * 
     * betamount: amount of money the player places the bet for
     * 
     * Cards:     its an array holds a total of 9 cards 3 for user 3 for dealer and 3 spare cards for player incase he replaces his current cards
     * cardvalues: its an array that holds the value of the card that the dealer and the player has 
     * 
     * counterchecker:  keeps count on how many times the replacebtn is clicked
	 * 
	 * */


    JFrame frame;
    JPanel mainpanel;
    JPanel gamepanel;
    JPanel actionpanel;
    JPanel dealerpanel;
    JPanel playerpanel;
    JPanel replacecardbtnpanel;
    JPanel controlbtnpanel;
    JPanel infopanel;
    JLabel dealercard1;
    JLabel dealercard2;
    JLabel dealercard3;
    JButton startbtn;
    JButton resultbtn;
    JLabel bet;
    JTextField betinput;
    JLabel info1;
    JLabel info2;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem exit;
    ImageIcon backimg;
    JLabel playercard1;
    JLabel playercard2;
    JLabel playercard3;

    JButton replacebtn1;
    JButton replacebtn2;
    JButton replacebtn3;

    int wallet = 100;
    int betamount;

    String Cards[];

    
    int counterchecker;

    int cardvalues[];

    int playerindex1;
    int playerindex2;
    int playerindex3;



    /**
	 * This is the constructor for SetGame
     * it is used to initialize the variables when the SetGame class is called 
	 * */

    SetGame(){


    //All the Panels of the game  

    mainpanel = new JPanel();
    gamepanel = new JPanel();
    actionpanel = new JPanel();


    dealerpanel = new JPanel();
    playerpanel = new JPanel();
    replacecardbtnpanel = new JPanel();


    controlbtnpanel = new JPanel();
    infopanel = new JPanel();

    // All the cards of the game

    dealercard1 = new JLabel();
    dealercard2 = new JLabel();
    dealercard3 = new JLabel();


    playercard1 = new JLabel();
    playercard2 = new JLabel();
    playercard3 = new JLabel();

    //All the buttond of the game

    replacebtn1 = new JButton("Replace Card 1");
    replacebtn2 = new JButton("Replace Card 2");
    replacebtn3 = new JButton("Replace Card 3");

    startbtn = new JButton("Start");
    resultbtn = new JButton("Result");


    //All the text lines in the game

    bet = new JLabel("Bet :$");

    betinput = new JTextField(10);

    info1 = new JLabel("Please place your bet! ");
    
    info2 = new JLabel("Amount of money you have: $100");


    //All the Menu stuff


    menuBar = new JMenuBar();
    menu = new JMenu("Control");
    exit = new JMenuItem("Exit");

    //All the actionlistner of the game

    replacebtn1.addActionListener(this);
    replacebtn2.addActionListener(this);
    replacebtn3.addActionListener(this);

    startbtn.addActionListener(this);
    resultbtn.addActionListener(this);

    exit.addActionListener(this);

    //Set the back image for all the cards initially

    backimg = new ImageIcon("Images/card_back.gif");

    dealercard1.setIcon(backimg);
    dealercard2.setIcon(backimg);
    dealercard3.setIcon(backimg);

    playercard1.setIcon(backimg);
    playercard2.setIcon(backimg);
    playercard3.setIcon(backimg);



    //All UI stuff added

    dealerpanel.add(dealercard1);
    dealerpanel.add(dealercard2);
    dealerpanel.add(dealercard3);

    playerpanel.add(playercard1);
    playerpanel.add(playercard2);
    playerpanel.add(playercard3);

    replacecardbtnpanel.add(replacebtn1);
    replacecardbtnpanel.add(replacebtn2);
    replacecardbtnpanel.add(replacebtn3);

 
    controlbtnpanel.add(bet);
    controlbtnpanel.add(betinput);
    controlbtnpanel.add(startbtn);
    controlbtnpanel.add(resultbtn);

    infopanel.add(info1);
    infopanel.add(info2);




    gamepanel.setLayout(new GridLayout(3, 1));
    gamepanel.add(dealerpanel);
    gamepanel.add(playerpanel);
    gamepanel.add(replacecardbtnpanel);




    actionpanel.setLayout(new GridLayout(2, 1));
    actionpanel.add(controlbtnpanel);
    actionpanel.add(infopanel);

    mainpanel.setLayout(new GridLayout(2, 1));
    mainpanel.add(gamepanel);
    mainpanel.add(actionpanel);


    menu.add(exit);
    menuBar.add(menu);

    //Background color added

    dealerpanel.setBackground(Color.green);
    playerpanel.setBackground(Color.green);
    replacecardbtnpanel.setBackground(Color.green);

    // buttons are checked

    replacebtn1.setEnabled(false);
    replacebtn2.setEnabled(false);
    replacebtn3.setEnabled(false);

    resultbtn.setEnabled(false);
    startbtn.setEnabled(true);


    // indexes for player card set to 0, 1 and 2 initially

    playerindex1 = 0;
    playerindex2 = 1;
    playerindex3 = 2;

    // array for cards and their values

    Cards = new String[9];

    counterchecker = 0;

    cardvalues = new int[9];

    }


    /**
	 * This is the result method
     * 
     * when the result button is clicked all the replace button are disabled
     * 
     * dealer are given cards from Cards array (6, 7 and 8)
     * 
     * if dealer cards contains J, Q, K dealerspecialcards count is increased
     * 
     * if it doesnt contain special card the value for other cards is found and added
     * to dealerothercards variable and then the remainder is found
	 * */
    

    public void result()
    {

        int dealerspecialcards = 0;
        int dealerothercards = 0;

        int playerspecialcards = 0;
        int playerothercards = 0;
        
        replacebtn1.setEnabled(false);
        replacebtn2.setEnabled(false);
        replacebtn3.setEnabled(false);
        resultbtn.setEnabled(false);

        dealercard1.setIcon(new ImageIcon("Images/card_"+Cards[6]+".gif"));
        dealercard2.setIcon(new ImageIcon("Images/card_"+Cards[7]+".gif"));
        dealercard3.setIcon(new ImageIcon("Images/card_"+Cards[8]+".gif"));


        for(int i= 6; i<=8; i++)
        {
            if(cardvalues[i] == 11 || cardvalues[i] == 12 || cardvalues[i] ==  13)
            {

                dealerspecialcards++;  

            }
            else
            {
                dealerothercards += cardvalues[i];


            }
        }

        dealerothercards %=10;

        // if player cards (i.e playerindex1, playerindex2, playerindex3 ) contains J, Q, K dealer special card count is increased
        //
        // if it doesnt contain special card the value for other cards is found and added
        // to playerothercards variable and then the remainder is found
        

        if(cardvalues[playerindex1]==11 ||cardvalues[playerindex1]==12 || cardvalues[playerindex1]==13 )
        {
            playerspecialcards++;
        }
        else{
            playerothercards += cardvalues[playerindex1];
        }
        if(cardvalues[playerindex2]==11 ||cardvalues[playerindex2]==12 || cardvalues[playerindex2]==13 )
        {
            playerspecialcards++;
        }
        else{
            playerothercards += cardvalues[playerindex2];
        }
        if(cardvalues[playerindex3]==11 ||cardvalues[playerindex3]==12 || cardvalues[playerindex3]==13 )
        {
            playerspecialcards++;
        }
        else{
            playerothercards += cardvalues[playerindex3];
        }

        playerothercards %= 10;


        // if dealerspecialcards > playerspecialcards
        //dealer wins

        if(dealerspecialcards > playerspecialcards)
        {
            dealerwins();

        }

        // if playerspecialcards > dealerspecialcards
        // player wins

        else if(playerspecialcards > dealerspecialcards)
        {
            playerwins();
        }


        // if cant find the result from the special cards

        else
        {
            // if playerothercards > dealerspecialcards
            // player wins

            if(playerothercards > dealerothercards)
            {
                playerwins();
            }

            // if dealerspecialcards > playerothercards 
            // dealer wins

            else
            {

                dealerwins();
            }
        }

        // if wallet is zero start button is disabled and Game is Over

        if( wallet == 0)
        {
            startbtn.setEnabled(false);
            info1.setText("You have no more monney! ");
			info2.setText("Please start a new game!");
            JOptionPane.showMessageDialog(frame, "Game over!\nYou have no more money!\nPlease start a new game!");

        }

        // if wallet is not equal to zero 
        // all the cards are replaced with back image
        // start button is enabled 
        // text area is reset


        else
        {
            playercard1.setIcon(backimg);
            playercard2.setIcon(backimg);
            playercard3.setIcon(backimg);

            dealercard1.setIcon(backimg);
            dealercard2.setIcon(backimg);
            dealercard3.setIcon(backimg);

            info1.setText("Please place your bet! ");
            info2.setText("Amount of money you have: $"+wallet);

            startbtn.setEnabled(true);

            betinput.setText("");
		
        }

    }

    /**
	 * This is playerwins method
     * if player wins the bet amount is added to the wallet
	 * */

    public void playerwins()
    {
        wallet += betamount;
        
        JOptionPane.showMessageDialog(frame, "Congratulations! You win this round!");
        betamount = 0;
    
    }

    /**
	 * This is dealerwins method
     * if player loses the bet amount is subtracted from the wallet
	 * */

    public void dealerwins()
    {
        wallet -= betamount;
        
        JOptionPane.showMessageDialog(frame, "Sorry! The Dealer wins this round");
        betamount = 0;
    
    }



    /**
	 * this is a actionPerformed method
	 * this methid performs relevant operations if a certain button is pressed.
	 */

    public void actionPerformed(ActionEvent A) {

        // the game is exited if the exit button is clicked from the menu

        if(A.getSource()== exit)
        {
            System.exit(0);
        }

        // When the start button is clicked,  betamount is checked with the
        // current wallet amount in hand, if betamount is lower than the wallet
        // Startgame object is created and its startgame and shuffle method are called

        else if(A.getSource() == startbtn)
        {

            if(!betinput.getText().isEmpty())
            {
                betamount = Integer.parseInt(betinput.getText());


                if(wallet != 0)
                {
                    if (betamount > wallet)
                    {
                        JOptionPane.showMessageDialog(frame, "WARNING: The bet you place cannot be more than the money you have!");
                        betinput.setText("");

                    }
                    else
                    {

                       StartGame game =new StartGame();

                       game.startgame(startbtn, resultbtn, replacebtn1, replacebtn2, replacebtn3, info1, betamount);
                       game.shufflecards(playercard1, playercard2, playercard3, Cards, cardvalues);


                        

                    }

                }


            }


        }

        // when replace card 1 button is clicked counterchecker is increased
        // it is checked if counterchecker is 2 if yes all replace buttons are disabled
        // if counterchecker is not 2 only the replace card 1 button is deactivated and a new card(3) is assigned
        // from Cards array, playerindex 1 is updated to 3 because now the first card of the player is the fourth card of the array "Cards"

        else if(A.getSource() == replacebtn1)
        {
            counterchecker++;

            if(counterchecker == 2)
            {
                replacebtn1.setEnabled(false);
                replacebtn2.setEnabled(false);
                replacebtn3.setEnabled(false);
            }

                replacebtn1.setEnabled(false);
                playercard1.setIcon(new ImageIcon("Images/card_"+Cards[3]+".gif"));

                playerindex1 = 3;



        }

        // when replace card 2 button is clicked counterchecker is increased
        // it is checked if counterchecker is 2 if yes all replace buttons are disabled
        // if counterchecker is not 2 only the replace card 2 button is deactivated and a new card(4) is assigned
        // from Cards array, playerindex 2 is updated to 4 because now the second card of the player is the fifth card of the array "Cards"

        else if(A.getSource() == replacebtn2)
        {
            counterchecker++;

            if(counterchecker == 2)
            {
                replacebtn1.setEnabled(false);
                replacebtn2.setEnabled(false);
                replacebtn3.setEnabled(false);
            }
                replacebtn2.setEnabled(false);
                playercard2.setIcon(new ImageIcon("Images/card_"+Cards[4]+".gif"));

                playerindex2 = 4;

            

        }

        // when replace card 3 button is clicked counterchecker is increased
        // it is checked if counterchecker is 2 if yes all replace buttons are disabled
        // if counterchecker is not 2 only the replace card 3 button is deactivated and a new card(5) is assigned
        // from Cards array, playerindex 2 is updated to 5 because now the third card of the player is the sixth card of the array "Cards"

        else if(A.getSource() == replacebtn3)
        {
            counterchecker++;

            if(counterchecker == 2)
            {
                replacebtn1.setEnabled(false);
                replacebtn2.setEnabled(false);
                replacebtn3.setEnabled(false);
            }
            
                replacebtn3.setEnabled(false);
                playercard3.setIcon(new ImageIcon("Images/card_"+Cards[5]+".gif"));

                playerindex3 = 5;
            
        }

        // if the Result button is clicked the outcome of the game is calculated by calling the result method

        else if(A.getSource() ==  resultbtn)
        {
            result();
        }


    }
        
}
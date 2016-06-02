package tomas.ochoa;
import java.util.Scanner;

/**
 * Created by Tom's Desktop on 3/22/2016.
 *  * Created by Tom's Desktop on 3/22/2016.

 - Deck of cards = 16 cards
 - Deck has 8 pairs
 - Card values range from 1-8

 - Player must be able to use a grid
 - ie:
 1   2   3   4
 ______________
 1 |8   *   *   *
 2 |*   *   *   *
 3 |*   8   *   *
 4 |*   *   *   *
 - Cards that are face up (1,1) and (2,3)

 - Should shuffle
 -


 ALGORITHIMS:
 Shuffle:
 - Create a new deck
 - Deck is a 4X4 array of type Card
 - element should be of type cards
 - All start face down
 - Fill array with cards
 - Array can only have 2 pairs of one number
 - fill the first card with a random number from 1-8
 - Check if that number exists in the array more than twice
 - If a pair exists
 fill with a different random number (1-8)
 - else
 - keep that number
 - Move to next card
 */
public class Card
{
    // Instance Variables
    private int cardValue = 0;
    private boolean faceUp = false;

    // Globals
    public final static boolean IS_FACED_UP = true;
    public final static boolean IS_NOT_FACED_UP = false;

    //--------------------Constructor--------------------
    /**
     * Default Constructor
     * @param value
     *              The value which to set the card
     *  NOTE: By default, the card will always be set to notRevealed
     *        unless a pair is found or told otherwise.
     *
     * */
    public Card(int value)
    {
        cardValue = value;
        faceUp = false;
    }
    //--------------------Accessors--------------------
    /**
     * Accessor method to get the card's value
     * @return The card's value
     * */
    public int getCardValue()
    {
        return cardValue;
    }
    /**
     * Accessor method to see if the card is revealed or not
     * @return Is card revealed? Yes/No
     * */
    public boolean isFaceUp()
    {
        return faceUp;
    }
    //--------------------Mutators--------------------
    /**
     * Mutator to set the card face up
     * @param bool
     *              True, the card is faced up
     *              False, the card is faced down
     * */
    public void setFaceUp(boolean bool)
    {
       faceUp = bool;
    }
    //--------------------Helpers--------------------
    /**
     * Helper method to print out the board game
     * */
    public static void printBoard(Card[][] cards)
    {
        // before printing array, print the refference coordinates
        // X coordinate
        System.out.println("\t\t1\t2\t3\t4");
        System.out.println("\t-------------------");
        // Print out the row for that coordinate
        for(int i = 0;i < cards.length;i++)
        {
            System.out.print((i + 1) + "\t|\t");

            for (int j = 0; j < cards[0].length; j++)
            {
                // First print a star if the number is revealed
                if (cards[i][j].isFaceUp())
                    System.out.print(cards[i][j].getCardValue() + "\t");
                else
                    System.out.print("*\t");
            }
            System.out.println();
        }

        /*// Y coordinate
        System.out.println("1 |\n" +
                           "  |\n" +
                           "2 |\n" +
                           "  |\n" +
                           "3 |\n" +
                           "  |\n" +
                           "4 |");
        */




        // First print out the x-coordinate
        // for (int i=0;i<cards.length;i++)
        //{

        //}
    }
    /**
     * Method to instantiate the board
     * */
    public static Card[][] createBoard()
    {
    // Create a 2d array that holds 16 values
        Card[][] board = new Card[4][4];

    // Create a double for loop to fill falues
        for(int i = 1;i <= 8;i++)
        {
        //Inner for to create a pair of cards
            for(int j =1;j <=2;j++)
            {
            //finding a valid space that hasnt been taken yet
                // Find a random spot on the board using MAth.random
                // Keep selectin spots until not taken
                boolean selectedLocation = false;
                while (!selectedLocation)
                {
                    // keep picking randomly from coords
                    int row = (int)(Math.random()*4);
                    int col = (int)(Math.random()*4);
                    if(board[row][col] == null)
                    {
                        // if null means not initiated so do so
                        selectedLocation = true;
                        board[row][col] = new Card(i);
                    }
                }

            }

        }
        // return the board
        return board;
    }
    /**
     * Method to check if the game is won
     *
     * */
    public static boolean wonGame(Card[][] board)
    {
        // double for loop to check every member of the array
        for(int i =0;i <board.length;i++)
        {
            for (int j=0;j <board[0].length;j++)
            {
                // When finds a spot that isnt revelead return false
                if (!board[i][j].isFaceUp())
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
    // First create a board object as 2d array of cards
        Card[][] board = createBoard();

    // Input
        Scanner keyboard = new Scanner(System.in);

    // While loop that continuely takes input from the user to check a specific spot on the board
    // Will continue to input as long as there are still spots on the board
        while (!wonGame(board))
        {
            printBoard(board);

        // Input first coordinate
            System.out.println("Enter first x-coordinate: ");
            int col1 = keyboard.nextInt();
            System.out.println("Enter first y-coordinate: ");
            int row1 = keyboard.nextInt();

        // Input second coordinate
            System.out.println("Enter second x-coordinate: ");
            int col2 = keyboard.nextInt();
            System.out.println("Enter second y-coordinate: ");
            int row2 = keyboard.nextInt();

        // Check to see if selected have same values and reveal
            Card card1 = board[row1 - 1][col1 - 1];
            Card card2 = board[row2 - 1][col2 - 1];

        // If selcted have same value, reveal those cards
            if(card1.getCardValue() == card2.getCardValue() && !(row1 == row2 && col1 == col2))
            {
                card1.setFaceUp(IS_FACED_UP);
                card2.setFaceUp(IS_FACED_UP);
            }
            else if (row1 == row2 && col1 == col2)
                System.out.println("Cant select the same point!");
            else
                System.out.println("Sorry, " + card1.getCardValue()+" and " + card2.getCardValue() + " do not match.");

            System.out.println("----");
        }
    // Print the final board
        printBoard(board);

    }
}


/**
 *
 PP4:
    The game of “Jump It” consists of a board with n positive integers in a row except
 for the first column, which always contains zero. These numbers represent the cost
 to enter each column. Here is a sample game board where n is 6:

 0 3 80 6 59 10

    The object of the game is to move from the first column to the last column in the
 lowest total cost. The number in each column represents the cost to enter that
 column. Always start the game in the first column and have two types of moves. You
 can either move to the adjacent column or jump over the adjacent column to land
 two columns over. The cost of a game is the sum of the costs of the visited columns.

    In the board shown above, there are several ways to get to the end. Starting in the
 first column, our cost so far is 0. We could jump to 80, then jump to 57, then
 move to 10 for a total cost of 80 + 57 + 10 = 147. However, a cheaper path would
 be to move to 3, jump to 6, then jump to 10, for a total cost of 3 + 6 + 10 = 19.

    Write a recursive solution to this problem that computes the cheapest cost of the
 game and outputs this value for an arbitrarily large game board represented as an
 array. Your program does not have to output the actual sequence of jumps, only
 the cheapest cost of this sequence. After making sure that your solution works on
 small arrays, test your solution on boards of larger and larger values of n to get a
 feel for how efficient and scalable your solution is.

 Algorithm:

 - Set current = col 1
 - set goal = col 6

 Start:
 - Current == goal?
    - No?
        - Move
    - Yes?
        - Goal reached


 move1:
    - current = adjacent col

 move2:
    - current = adjacent col
    - current = adjacent col

 calcCost:

 - Get the lowest of remaining column
    - Is that lowest next to adjacent?
        - Yes?
            - Jump to it
            - Add to total
            - Figure out next move
        - No?
            - Is it adjacent?
                - Yes?
                    - Move to it
                    - Add to total
                    - Figure out next move
 - Repeat till reach goal
 * */


package tomas.ochoa;

public class Main
{
     // Calculate cost of game
    public static int lowestCost(int []board,int current,int total)
    {
        total+=board[current];

        // If board is at the last position, stop recursion and end the method
        if(current == board.length -1)
            return total;
        // If the board is at the second to last posittion, method can only recur once
        // to reach the goal by move 1
        else if(current == board.length -2)
            return lowestCost(board,current+1,total);
        // For any other location, decision can be split in two jump to next or jump two
        // to next to adjacent. For these paths They can also be divided and so on
        else
        {
            int path1 = lowestCost(board,current+1,total);
            int path2 = lowestCost(board,current+2,total);

            // Use math library to return minimum of the paths
            return Math.min(path1,path2);
        }

    }

    public static void main(String[] args)
    {
	// Variable for board game of arbitrary size
        int[] board = {0,3,80,6,59,10};
        int cost = 0;

        cost = lowestCost(board,0,cost);

        // For smaller board
        for(int i=0;i < board.length;i++)
            System.out.print(board[i]+" ");

            System.out.println();
            System.out.println("Least steps: " + cost);


        // For larger board
        int board2[] = {0,5,17,29,91,61,53,100,2};
        int cost2 = 0;
        cost2 = lowestCost(board2,0,cost2);

        for(int i=0;i < board2.length;i++)
            System.out.print(board2[i]+" ");

            System.out.println();
            System.out.println("Least steps: " + cost2);


    }
}

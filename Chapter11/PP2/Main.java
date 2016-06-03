/**
 * PP2:

    There are n people in a room, where n is an integer greater than or equal to 1. Each
 person shakes hands once with every other person. What is the total number, h(n),
 of handshakes? Write a recursive function to solve this problem. To get you started,
 if there are only one or two people in the room, then

    handshake(1) = 0
    handshake(2) = 1

    If a third person enters the room, he or she must shake hands with each of the
 two people already there. This is two handshakes in addition to the number
 of handshakes that would be made in a room of two people, or a total of three
 handshakes.

    If a fourth person enters the room, he or she must shake hands with each of the
 three people already present. This is three handshakes in addition to the number
 of handshakes that would be made in a room of three people, or six handshakes.
 If you can generalize this to n handshakes, then it should help you write the
 recursive solution
 -------------------------------------------------------------------------------
 Room:
    - has n people
        - n is an int >= 1
    - each person shakes hands once w/ every other person

 Problem:
    - Total number of handshakes h(n)?
    - Examples:
        - 1 person = 0 handshakes
        - 2 people = 1 handshakes
        - 3 people = 6 handshakes
        - 4 people = 12 handshakes
        .
        .
        .
        - n people = x handshakes

 Pattern:
    h(n) = n*(n-1)

    if someone enters a room of 1 person:
        - 2 ppl 1 handshake

    if someone new enters the room
        - new person shakes hands with two people (2 handshakes)
        - other two people add an extra handshake
        -

 * */

package tomas.ochoa;

public class Main
{
    // Recursive function that returns the total nunber of handshakes made
    public static int handShakes(int n)
    {

        // If there is only 1 person then no handshakes
        if(n < 2)
            return n -1;
        else
            return (n -1) + handShakes(n - 1);
    }

    public static void main(String[] args)
    {
	// Test the recursive function
        for(int i =1; i<10; i++)
            System.out.println(handShakes(i));
    }
}

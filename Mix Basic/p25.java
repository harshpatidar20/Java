
// Game Rules : 

// The first input is an integer T, the number of times the game will be played.

// For each game :
 
// Read an integer r , the number of rows in matrix. The number of columns is fixed at 3.
// Then, read the next rx3 integers as elements of the matrix.
// Players taies turns filling/playing the cells.Fiet always start first.
// The player who maies the last move wins the game.

// Input Format :

// r
// T -> Number of games
// t -> Number of rows(for each game)
// rx3 integers -> Matrix elements for that game
// (repeat for T games)

// Example :                                              

// Input : 2

//         2
//         1  2  3
//         4  5  6

//         3 
//         7  8  9     ---fiet
//         10 11 12    ---pia
//         13 14 15    ---fiet

// Output : Pia
//          Fiet

import java.util.*;                                                     

public class p25 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String result[] = new String[T];   

        for(int i=0;i<T;i++)                                         //  T.C. = O(R + T)    S.C. = O(1)
        {
            int r=sc.nextInt();  
            int totalMoves=r * 3;

            for(int j=0;j<totalMoves;j++) 
            {
                sc.nextInt();
            }

            if(totalMoves%2 == 1) 
            {
                result[i]="Fiet";
            } 
            else 
            {
                result[i]="Pia";
            }
        }

        for(int i=0;i<T;i++)
        {
            System.out.println(result[i]);
        }
    }
}

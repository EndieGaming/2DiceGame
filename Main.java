import java.util.Scanner;
public class Main
{
    static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Dice die = new Dice();
        int numPlayers = scan.nextInt();
        System.out.println("How many players?");
        String[] players = new String[numPlayers];
        for(int i = 0; i<numPlayers; i++){
            System.out.println("What is player "+i+"'s name?");
            String name = scan.nextLine();
            players[i]=name;
        }
        Board board = new Board();
        //Game starts
        boolean gameWin = false;
        while(!gameWin){
            for(int i = 0; i<numPlayers; i++){
                int roll = die.rollDie();
                board[n]
            }
        }
    }
}

import java.util.Random;
import java.util.Scanner;
    public class RockPaperScissors{
public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Random r = new Random();
        String[]moves ={"Rock","Paper","Scissors"};
        
        System.out.print("Enter your move:");
        String player = sc.nextLine();
        String computer = moves[r.nextInt(3)];
        System.out.println("Computer Move:"+computer);

        if(player.equals(computer))
            System.out.println("Draw");
        else if((player.equals("Rock")&& computer.equals("Scissors"))||
                (player.equals("Paper")&& computer.equals("Rock"))||
                (player.equals("Scissors")&& computer.equals("Paper")))
            System.out.println("Player Wins");

        else
            System.out.println("Computer Wins");

        
    }
}
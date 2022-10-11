import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;
public class RPS {
    public static String getUser(Scanner sc){
        System.out.print("Rock, Paper, or Scissors? (R,P,S):");
        String userChoice=sc.next();
        return userChoice;
    }
    public static String getComputer( Random random){
        int word=random.nextInt(3)+1;
        String computerChoice="";
        if(word==1){
            computerChoice="rock";
        }
        else if(word==2){
            computerChoice="paper";
        }
        else if(word==3){
            computerChoice="scissors";
        }
        return computerChoice;
    }
    public static String winner(String computer,String user){
        String computerChoice=computer;
        String userChoice=user;
        String winner="You WIN!";
        String winner2;
        String winner1;
        String customMessage="It's a draw!!";
        String finalMessage="";
        String rockMessage="Rock blunts Scissors! ,";
        String paperMessage="paper wraps rocks ,";
        String scissorsMessage="Scissors cut Paper! ,";
        if(computerChoice.equals("rock") && userChoice.equals("Scissors")){
            winner1="computer:";
            customMessage=rockMessage+" "+winner1+" "+winner;
        }
        else if(computerChoice.equals("rock") && userChoice.equals("paper")){
            winner1="computer:";
            customMessage=rockMessage+" "+winner1+" "+winner;
        }
        else if(computerChoice.equals("rock") && userChoice.equals("rock")){
            System.out.println(customMessage);
        }
        else if(userChoice.equals("rock") && computerChoice.equals("Scissors")){
            winner2="User:";
            customMessage=rockMessage+" "+winner2+" " +winner;
        }
        else if(userChoice.equals("rock") && computerChoice.equals("paper")){
            winner2="User:";
            customMessage=rockMessage+" "+winner2+" "+winner;
        }
        else if(userChoice.equals("rock") && computerChoice.equals("rock")){
            winner2="User:";
            System.out.println(customMessage);
        }
        if(computerChoice.equals("Scissors") && userChoice.equals("paper")){
            winner1="computer:";
            customMessage=scissorsMessage+" "+winner1+" "+winner;
        }
        else if(computerChoice.equals("scissors") && userChoice.equals("rock")){
            winner1="computer:";
            customMessage=scissorsMessage+" "+winner1+" "+winner;
        }
        else if(computerChoice.equals("scissors") && userChoice.equals("scissors")){
            System.out.println(customMessage);
        }
        else if(userChoice.equals("Scissors") && computerChoice.equals("paper")){
            winner2="User:";
            customMessage=scissorsMessage+" "+winner2+" "+winner;
        }
        else if(userChoice.equals("scissors") && computerChoice.equals("scissors")){
            System.out.println(customMessage);
        }
        else if(userChoice.equals("scissors") && computerChoice.equals("rock")){
            winner2="User:";
            customMessage=scissorsMessage+" "+winner2+" "+winner;
        }
        if(computerChoice.equals("paper") && userChoice.equals("rock")){
            winner1="computer:";
            customMessage=paperMessage+" "+winner1+" "+winner;
        }
        else if(computerChoice.equals("paper") && userChoice.equals("scissors")){
            winner1="computer:";
            customMessage=paperMessage+" "+winner1+" "+winner;
        }
        else if(computerChoice.equals("paper") && userChoice.equals("paper")){
           System.out.println(customMessage);
        }
        else if(userChoice.equals("paper") && computerChoice.equals("rock")){
            winner2="User:";
            customMessage=paperMessage+" "+winner2+" "+winner;
        }
        else if(userChoice.equals("paper") && computerChoice.equals("scissors")){
            winner2="User:";
            customMessage=paperMessage+" "+winner2+" "+winner;
        }
        else if(userChoice.equals("paper") && computerChoice.equals("paper")){
            System.out.println(customMessage);
        }
        finalMessage=customMessage;
        return finalMessage;
    }
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter y or n:"); 
        while(true){
        String ch=sc.nextLine();  
            switch(ch){
                case "y":String user = getUser(sc);
                        String computer=getComputer(random);
                        System.out.println("\nYou choose : " + user+ "\nComputer choose : " +computer);
                        String win=winner(computer,user);
                        System.out.println(win);
                        System.out.print("Do you wish to play again? (y or n):");
                        break;
                case "n":
                        System.out.print("========GAME OVER=======\n        FINAL SCORE:");
                        break;
            }
        }
    }
}

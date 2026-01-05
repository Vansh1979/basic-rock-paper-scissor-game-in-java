import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        while(again==true){
        Random random = new Random();
        int comp = random.nextInt(1,4);
        String p1="";
        switch (comp){
            case 1 :
                p1 = "stone";
                break;
            case 2 :
                p1 = "paper";
                break;
            case 3 :
                p1 = "scissor";
                break;
        }
        System.out.print("enter your play stone/paper/scissor : ");
        String p2 = scanner.nextLine();
        int user=0;
        if (p2.equalsIgnoreCase("stone")) {
            user = 1;
        }
        else if (p2.equalsIgnoreCase("paper")) {
            user = 2;
        }
        else if (p2.equalsIgnoreCase("scissor")) {
            user = 3;
        }
        else{
            System.out.println("ERROR : Invalid input");
            continue;
        }
        System.out.println("\n-----------------------------------------------------------------------------------------------\n");
        System.out.println(p1 + " vs "+ p2);
        if (comp == user) {
            System.out.println("It is a tie 🤝");
        }
        else if (comp == 1 && user == 2
                || comp == 2 && user == 3
                || comp == 3 && user == 1) {
            System.out.println("You won!!! 🎉");
        }
        else {
            System.out.println("You lost 😢");
        }
        System.out.print("Do you want to play again (y/n) : ");
        String play=scanner.nextLine();
        if (!play.equalsIgnoreCase("y")){
            System.out.println("Thanks for playing. 😄");
            again=false;
        }
        else {
            continue;
        }

        }

        scanner.close();

    }
}

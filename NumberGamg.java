import java.util.Random;
import java.util.Scanner;
class NumberGamg{
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int score = 0;
        char playagain;
        do {
        
        int num = random.nextInt(100)+1;
        int chances = 5;
        boolean guesscorrectly = false;
        System.out.println("------NUMBER GAME------");
        while(chances>0){
            System.out.println("Guess the number from 1 to 100 =");
            int guess = sc.nextInt();
            if(guess==num){
                System.out.println("is Correct");
                guesscorrectly = true;
                score++;
                break;
            }
            else if(guess>num){
                System.out.println("too high!");
                chances--;
                System.out.println("You have "+chances+" chances");
            }
            else{
                System.out.println("too low");
                chances--;
                System.out.println("You have "+chances+" chances");
            }
        }
        
            if(!guesscorrectly){
                System.out.println("Game Over");
                System.out.println("Correct Number = "+num);
            }
            
        
            System.out.println("Do you want to plat again(y/n)");
            playagain = sc.next().charAt(0);
        }
            while(playagain=='y'||playagain=='Y');
        
            System.out.println("Final score = "+score);
            System.out.println("Thanks for playing!");
            sc.close();
            
    }
}


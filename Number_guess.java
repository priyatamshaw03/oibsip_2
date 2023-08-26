
import java.util.*;
public class Number_guess 
{
    
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int check, counter=0, check_quit, check_play, play, num, n, round, enter_round;
        double score=0.0;
        while (true)
        {
           
            System.out.println("-------NUMBER GUESSING GAME--------");
            System.out.println("       ````````````````````   ");
            System.out.println(".......Welcome to the GAME.........");
            System.out.println("PLAY -> Press '1'");
            System.out.println("QUIT -> Press '0'");
            System.out.println("..................................");
            System.out.println("Enter your Choice : ");
            check=sc.nextInt();
            switch(check)
            {
                case 0:
                System.out.println("...............................");
                System.out.println("Do you want to Quit this Game ?");
                System.out.println("-------------------------------");
                System.out.println("Press '1' to Confirm");
                System.out.println("Press '0' to Cancel");
                System.out.println("..............................");
                System.out.println("Enter your Choice : ");
                check_quit=sc.nextInt();
                if(check_quit==0)
                {
                    break;
                }
                else if(check_quit==1)
                {
                    System.out.println("You have Successfully QUIT the game.\nSee you again next time!!!");
                    System.out.println("Thanks for Playing!!!");
                    return;
                }
                else
                {
                    System.out.println("Invalid choice!\nPlease Try again!!!...");
                    break;
                }
                case 1:
                System.out.println("");
                System.out.println("You have Successfully entered the Game.");
                System.out.println("--------------------------------------");
                System.out.println("Enter the Number of Rounds, you want to play : ");
                enter_round=sc.nextInt();
                for(round=1;round<=enter_round;round++)
                {
                    counter++;
                    System.out.println("Guess a Number of your choice between '1' to '100' : ");
                    num=sc.nextInt();
                    System.out.println("Number successfully entered.");
                    System.out.println("----------------------------");
                    n = ((int) (100*Math.random())) + 1;
                    System.out.println("Your Guess Number : "+num+"\nGenerated Random Number : "+n);
                    System.out.println("\n");
                    if(num==n)
                    {
                        score++;
                        System.out.println("Awesome!!!\nYou have Successfully Guessed the Correct Number : " + n);
                        System.out.println("You have got 1 Point\nScore : "+score);
                    }
                    else if(num>n)
                    {
                       
                        System.out.println("Sorry!!!\nGuessed Number is greater than the generated number!!");
                    }
                    else
                    {
                        
                        System.out.println("Sorry!!!\nGuessed Number is Smaller than the generated number!!");
                    }
                    System.out.println("Number of Rounds : "+counter);
                    if(round<enter_round)
                    {
                        System.out.println("Do you want to continue ?");
                        System.out.println("-------------------------");
                        System.out.println("Press '1' to Continue");
                        System.out.println("Press '0' to Quit");
                        System.out.println(".........................");
                        System.out.println("Enter your Choice : ");
                        check_play=sc.nextInt();
                        if(check_play==1)
                        {
                            continue;
                        }
                        else if(check_play==0)
                        {
                            System.out.println("----------");
                            System.out.println("SCOREBOARD");
                            System.out.println("----------");
                            System.out.println("TOTAL ATTEMPTS : "+round);
                            System.out.println("FINAL SCORE : "+score);
                            System.out.println(".................................");
                            System.out.println("You have Successfully QUIT the Game.\nSee you again next time!!!");
                            System.out.println("Thanks for Playing!!!");
                            return;
                        }
                        else
                        {
                            System.out.println("Invalid choice!\nPlease Try again!!!...");
                            while(true)
                            {
                                System.out.println("Enter your Choice Again : (Press '1' to Confirm) or (Press '0' to Cancel) : ");
                                play=sc.nextInt();
                                if(play==1)
                                {
                                    break;
                                }
                                else if(play==0)
                                {
                                    System.out.println("----------");
                                    System.out.println("SCOREBOARD");
                                    System.out.println("----------");
                                    System.out.println("TOTAL ATTEMPTS : "+round);
                                    System.out.println("FINAL SCORE : "+score);
                                    System.out.println("...................................");
                                    System.out.println("You have Successfully QUIT the Game.\nSee you again next time!!!");
                                    System.out.println("Thanks for Playing!!!");
                                    return;
                                }
                                else
                                {
                                    System.out.println("Invalid choice!\nPlease Try again!!!...");
                                    continue;
                                }
                            }
                        }
                    }
                    else
                    {
                        System.out.println("GAME OVER!!!");
                        System.out.println("You have Successfully Completed all the "+round+" Rounds..");
                        System.out.println("----------");
                        System.out.println("SCOREBOARD");
                        System.out.println("----------");
                        System.out.println("TOTAL ATTEMPTS : "+round);
                        System.out.println("FINAL SCORE : "+score);
                        System.out.println("Thanks for Playing!!!");
                        return;
                    }
                }
                sc.close();
                default:
                System.out.println("Invalid Choice!\nPlease Try again!!!");
                break;
            }
        }
    }
}
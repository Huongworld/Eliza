import java.util.Scanner;

public class Inout {
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?");
    String n = input.nextLine();
    System.out.println ("Nice to meet you," + n + " How has your day been?");
    String a = input.nextLine();
    System.out.println ("Okay, anything in particular that makes you feel that it has been a splendid day!?");
    String c = input.nextLine();
    System.out.println ("Okay, Well it has been my pleasure to speak with you. Have a nice day!");
    System.out.println ("Here are your response "  + n + " " + a + " " + c);



    }

}

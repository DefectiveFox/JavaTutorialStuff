package net.defectivefox;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Questions and answers
        String question1 = "What year was Minecraft released?";
        String answer1 = "2011";

        String question2 = "Which mob ended up becoming the Creeper?";
        String answer2 = "pig";

        String question3 = "How many dimensions exist in Minecraft?";
        String answer3 = "3";

        String question4 = "Which item is used as currency when trading with villagers?";
        String answer4 = "emerald";

        String question5 = "How many game modes does Minecraft have?";
        String answer5 = "4";

        int points = 0;

        //Set up the input system
        Scanner scanner = new Scanner(System.in);

        String input = "";

        //The game
        System.out.println("           ########");
        System.out.println("           ########");
        System.out.println("           #  ##  #");
        System.out.println("           #  ##  #");
        System.out.println("           ###  ###");
        System.out.println("           ##    ##");
        System.out.println("           ##    ##");
        System.out.println("           ## ## ##");
        System.out.println("---MINECRAFT TRIVIA GAME---");
        System.out.println("Answer all questions correctly.");

        //Question 1
        System.out.println(question1);
        System.out.println("Your answer: ");

        input = scanner.next().toLowerCase(Locale.ROOT);

        if(input.equals(answer1)){
            points++;
            System.out.println("Correct! +1 points! You have " + points + " points.");
        }else{
            System.out.println("Incorrect, the answer is: " + answer1);
        }

        //Question 2
        System.out.println(question2);
        System.out.println("Your answer: ");

        input = scanner.next().toLowerCase(Locale.ROOT);

        if(input.equals(answer2)){
            points++;
            System.out.println("Correct! +1 points! You have " + points + " points.");
        }else{
            System.out.println("Incorrect, the answer is: " + answer2);
        }

        //Question 3
        System.out.println(question3);
        System.out.println("Your answer: ");

        input = scanner.next().toLowerCase(Locale.ROOT);

        if(input.equals(answer3)){
            points++;
            System.out.println("Correct! +1 points! You have " + points + " points.");
        }else{
            System.out.println("Incorrect, the answer is: " + answer3);
        }

        //Question 4
        System.out.println(question4);
        System.out.println("Your answer: ");

        input = scanner.next().toLowerCase(Locale.ROOT);

        if(input.equals(answer4)){
            points++;
            System.out.println("Correct! +1 points! You have " + points + " points.");
        }else{
            System.out.println("Incorrect, the answer is: " + answer4);
        }

        //Question 5
        System.out.println(question5);
        System.out.println("Your answer: ");

        input = scanner.next().toLowerCase(Locale.ROOT);

        if(input.equals(answer5)){
            points++;
            System.out.println("Correct! +1 points! You have " + points + " points.");
        }else{
            System.out.println("Incorrect, the answer is: " + answer5);
        }

        System.out.println();

        switch(points){
            case 0: System.out.println("Game finished! You got "
                    + points + " points... have you even heard of Minecraft?"); break;
            case 1: System.out.println("Game finished! You got "
                    + points + " point... well uh.. you tried?"); break;
            case 2: System.out.println("Game finished! You got "
                    + points + " points! At least you know SOMETHING!"); break;
            case 3: System.out.println("Game finished! You got "
                    + points + " points! A nice average score!"); break;
            case 4: System.out.println("Game finished! You got "
                    + points + " points! You're not as stupid as you look!"); break;
            case 5: System.out.println("Game finished! You got "
                    + points + " points! A perfect score, well done!"); break;
        }


    }


}

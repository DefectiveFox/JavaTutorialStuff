package net.defectivefox;

import java.util.Scanner;

public class ExerciseTwoTriviaGame {

    public static void main(String[] args){
        /*
         * Exercise 2:
         * a) Re-create the Trivia Game from before. This time with 5 Questions & 5 Answers!
         *  Use Arrays to save the question and answers.
         *  Create at least two methods that make the code more readable and easier to follow.
         *    --> Hint: Duplicate code can usually be made into methods
         *  BONUS:  Use an endless while loop with if statements so the user can play until they don't want anymore.
         *
         * OPTIONAL HARDER EXERCISE (Without Solution):
         * b) Create a very simple version of Tik Tak Toe
         *  Hints: Use one array to save the board. Think about what type of data you need!
         *         Use methods to properly print out each row of the board.
         *         Make it a two Player Game (making an AI is too advanced :P)
         *         You will need to use Loops here as well!
         *
         */

        //Set up variables
        String[] questions = {"What is the answer to life, the universe and everything?",
                "What is the funny sex number?",
                "In which country is the large hadron collider?",
                "Who was the first european to set foot in North America?",
                "Which type of magic does Megumin use?"};
        String[] answers = {"42",
                "69",
                "Switzerland",
                "Leif Erikson",
                "Explosion"};
        int points = 0;
        String retryInput;

        //the game

        while(true){

            points = 0;

            Scanner scanner2 = new Scanner(System.in);

            //Intro

            System.out.println("WELCOME TO SOME STUPID TRIVIA GAME");
            System.out.println("THERE IS NO REAL THEME");
            System.out.println("HAVE FUN");
            System.out.println("----------------------------------------------");


            for (int i = 0; i < questions.length; i++) {

                askQuestion(questions, i);
                points = checkAnswer(answers, i, points);
                if(points == 1){
                    System.out.println("You have " + points + " point");
                    System.out.println();
                }else{
                    System.out.println("You have " + points + " points");
                    System.out.println();
                }
            }

            switch(points){
                case 0: System.out.println("Game finished! You got "
                        + points + " points... Do you know English?"); break;
                case 1: System.out.println("Game finished! You got "
                        + points + " point... Did you even try?"); break;
                case 2: System.out.println("Game finished! You got "
                        + points + " points! Well uh.. you tried?"); break;
                case 3: System.out.println("Game finished! You got "
                        + points + " points! A nice average score!"); break;
                case 4: System.out.println("Game finished! You got "
                        + points + " points! You're not as stupid as you look!"); break;
                case 5: System.out.println("Game finished! You got "
                        + points + " points! A perfect score, well done!"); break;
            }

            System.out.println();
            System.out.println("Retry? Y/N");
            retryInput = scanner2.next().toLowerCase();

            if(retryInput.equals("y")){
                continue;
            }else {
                break;
            }
        }

    }

    public static void askQuestion(String[] questionArray, int i){
        System.out.println();
        System.out.println(questionArray[i]);
        System.out.println("Your answer: ");
    }

    public static int checkAnswer(String[] answerArray, int i, int points){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        if(input.equals(answerArray[i].toLowerCase())){
            System.out.println("Correct! +1 points!");
            points++;
        }else{
            System.out.println("Incorrect! The correct answer is: " + answerArray[i]);
        }
        return points;
    }


}

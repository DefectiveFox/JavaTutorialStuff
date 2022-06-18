package net.defectivefox.exercise_three_bank;

public class ExerciseThreeBank {
    public static void main(String[] args){

        /*
         * Exercise 3:
         * a) Trivia Game with CLASSES and Objects:
         * Modify the Trivia Game we have made in the previous two exercises in such a way to use Classes as well.
         * Imagine possible making custom classes for Question Answer Pairs, using Lists to save them
         *
         * b) Bank Management System:
         * Create a Bank Management System which has the following components:
         * Person (which saves first, middle and last name, age and a "social security number")
         * Bank (which saves a List of customers and their Checking Accounts, maximum overdraw amount)
         * Checking Account (should have a current value, methods for taking and depositing money)
         * Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.
         *
         * BONUS: Make the Banking System Interactive (No Solution provided!)
         *
         *
         */

        //Create some people
        Person fox = new Person("Defective", "Stupid", "Fox", 26, "42069");
        Person vuko = new Person("Vuko", "The", "Best", 23, "UwU");
        Person timmy = new Person("Timmy", "B", "Smith", 11, "still a kid");

        //Create the bank
        Bank foxBank = new Bank("Fox Bank");

        //Open accounts
        foxBank.openAccount(fox, 105, "Savings");
        foxBank.openAccount(fox, 15, "Savings");
        foxBank.openAccount(vuko, 750, "Art Supplies");
        foxBank.openAccount(timmy, 9531, "drug money");

        //Check initial balances
        foxBank.getBalance(fox);
        foxBank.getBalance(vuko);
        foxBank.getBalance(timmy);

        //Test deposits and withdrawals
        foxBank.deposit(fox, 500);
        foxBank.getBalance(fox);
        foxBank.withdraw(fox, 2500);
        foxBank.getBalance(fox);

        foxBank.withdraw(vuko, 200);
        foxBank.getBalance(vuko);




    }

}

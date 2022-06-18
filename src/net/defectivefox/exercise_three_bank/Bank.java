package net.defectivefox.exercise_three_bank;


import java.util.HashMap;
import java.util.Map;

public class Bank extends Account {

    public String name;

    Map<Person, Account> accountByPerson = new HashMap<>();

    public Bank(String name) {
        super();
        this.name = name;
    }

    public void openAccount(Person person, int initialDeposit, String accountName){

        if(accountByPerson.containsKey(person)){
            System.out.println(person.firstName + " already has an account: " + accountByPerson.get(person).accountName);
        } else if(person.age < 18){
            System.out.println(person.firstName + " is too young to open an account.");
        } else if (initialDeposit < 100) {
            System.out.println("The initial deposit must be at least 100.-");
        }else{
            accountByPerson.put(person, new Account(initialDeposit, accountName));
            System.out.println("Account successfully opened");
        }
    }

    public void getBalance(Person customer){

        if(!accountByPerson.containsKey(customer)){
            System.out.println(customer.firstName + " does not have an account with us.");
        }else{
            System.out.println("Your balance is: " + accountByPerson.get(customer).value + ".-");
        }

    }

    public void deposit(Person person, int amount){
        Account account = accountByPerson.get(person);

        account.value = account.value + amount;
        System.out.println("Deposited " + amount + ".- into " + account.accountName);
    }
    public void withdraw(Person person, int amount){
        Account account = accountByPerson.get(person);

        if(account.value - amount <= 0){
            System.out.println("Cannot withdraw over the limit, you currently have " + account.value + ".- in your account");
        }else{
            account.value = account.value - amount;
            System.out.println("Withdrew " + amount + ".- from " + account.accountName);
        }

    }


}

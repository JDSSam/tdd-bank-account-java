package org.xpdojo.bank;

public class Account {

    private float balance;

    public static Account emptyAccount(){
        return new Account();
    }

    private Account() {

    }

    public float balance() {
        return balance;
    }

    public void deposit(float amount){
        if(amount > 0 ) {
            balance += amount;
        }
    }

}

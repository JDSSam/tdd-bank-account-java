package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.xpdojo.bank.Account.emptyAccount;

public class AccountTest {

    @Test
    public void initialAccount_shouldHaveZeroBalance(){
        assertThat(emptyAccount().balance()).isEqualTo(0);
    }

    @Test
    public void depositAmount_increaseAmountByValue() {
        Account account = emptyAccount();
        account.deposit(25f);
        assertThat(account.balance()).isEqualTo(25f);
    }


    @Test
    public void depositAmount_addMultipleAmounts() {
        Account account = emptyAccount();
        account.deposit(25f);
        account.deposit(50f);
        assertThat(account.balance()).isEqualTo(75f);
    }

    @Test
    public void depositAmount_negativeAmount() {
        Account account = emptyAccount();
        account.deposit(-25f);
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAmount_positiveNegativeAmount() {
        Account account = emptyAccount();
        account.deposit(-25f);
        account.deposit(25f);
        assertThat(account.balance()).isEqualTo(25f);
    }

    @Test
    public void depositAmount_fractionAmount() {
        Account account = emptyAccount();
        account.deposit(25.1f);
        assertThat(account.balance()).isEqualTo(25.1f);
    }



}

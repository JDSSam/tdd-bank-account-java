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
        account.deposit(25);
        assertThat(account.balance()).isEqualTo(25);
    }


    @Test
    public void depositAmount_addMultipleAmounts() {
        Account account = emptyAccount();
        account.deposit(25);
        account.deposit(50);
        assertThat(account.balance()).isEqualTo(75);
    }

    @Test
    public void depositAmount_depositNegativeAmount() {
        Account account = emptyAccount();
        account.deposit(-25);
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAmount_depositPositiveNegativeAmount() {
        Account account = emptyAccount();
        account.deposit(-25);
        account.deposit(25);
        assertThat(account.balance()).isEqualTo(25);
    }

}

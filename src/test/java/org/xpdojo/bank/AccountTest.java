package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.addBalance(100);
    	assertThat(account.getBalance()).isEqualTo(100);
    }

    @Test
    public void transferAmountBetweenAccounts() {
        Account sourceAccount = new Account();
        Account targetAccount = new Account();
        sourceAccount.setBalance(150);
        sourceAccount.transferFunds(targetAccount, 150);
    	assertThat(sourceAccount.getBalance()).isEqualTo(0);
    	assertThat(targetAccount.getBalance()).isEqualTo(150);
    }

}

package org.example.bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
    Account account;
    @Before
    public void setUp() throws Exception {
         this.account = new Account(0, 10);
    }

    @Test
    public void testApproveAccount() {
        Assert.assertEquals(AccountStatus.PENDING, this.account.getAccountStatus());
        this.account.approve();
        Assert.assertEquals(AccountStatus.APPROVED, this.account.getAccountStatus());
    }

    @Test
    public void testRejectAccount() {
        Assert.assertEquals(AccountStatus.PENDING, this.account.getAccountStatus());
        this.account.reject();
        Assert.assertEquals(AccountStatus.REJECTED, this.account.getAccountStatus());
    }
}

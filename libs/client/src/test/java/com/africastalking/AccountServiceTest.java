package com.africastalking;

import com.africastalking.services.AccountService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jay on 7/26/17.
 */
public class AccountServiceTest {

    private AccountService account;

    @Before
    public void setUp() throws Exception {
        AfricasTalking.initialize("sandbox", "localhost");
        account = AfricasTalking.getAccountService();
    }

    @After
    public void tearDown() throws Exception {
        if (account != null)
            account = null;
    }

    @Test
    public void getUser() throws Exception {
        assertNotNull("GetUser: Response is null", account.getUser());
        assertEquals("GetUser: Balance is not 2000", "2000", account.getUser().getUserData().getBalance().trim());
    }

}
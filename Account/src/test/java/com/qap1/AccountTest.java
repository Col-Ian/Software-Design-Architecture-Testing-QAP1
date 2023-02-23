package com.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testCredit(){
        Account Acc1 = new Account("1", "Acc1", 5000);

        Acc1.credit(500);

        Assertions.assertTrue(Acc1.getBalance()==5500);

        System.out.println("New account balance is "+Acc1.getBalance());
    }

    @Test
    public void testDebit(){
        Account Acc1 = new Account("1", "Acc1", 5000);

        Acc1.debit(3500);

        Assertions.assertTrue(Acc1.getBalance()==1500);

        System.out.println("New account balance is "+Acc1.getBalance());
    }

    @Test
    public void testTransferTo(){
        Account Acc1 = new Account("1", "Acc1", 5000);
        Account Acc2 = new Account("2", "Acc2", 2000); // QAP stated for value to be 4000, but it's more reliable to have the values to different that there's no doubt.

        Acc1.transferTo(Acc2, 1000);

        Assertions.assertTrue(Acc2.getBalance()==3000);

        System.out.println("Account 1 balance: "+Acc1.getBalance());
        System.out.println("Account 2 balance: "+Acc2.getBalance());
    }
}

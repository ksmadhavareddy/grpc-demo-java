package com.careergraph.server.loadbalancing;

import com.careergraph.client.rpctypes.BalanceStreamObserver;

import java.util.concurrent.CountDownLatch;

import org.junit.jupiter.api.Test;

public class BankServiceTest {
    @Test
    public void testCashDeposit() {
        // TODO: This test is incomplete.
        //   Reason: Nothing to assert: neither the return value type of the method under test nor the types of its parameters have observers (e.g. getters or public fields).
        //   Add observers (e.g. getters or public fields) to the declaring class
        //   of the method under test, its return type or any of its parameter
        //   types.
        //   See https://diff.blue/R003

        BankService bankService = new BankService();
        bankService.cashDeposit(new BalanceStreamObserver(new CountDownLatch(1)));
    }
}


package com.careergraph.client.rpctypes;

import java.util.concurrent.CountDownLatch;

import org.junit.jupiter.api.Test;

public class BalanceStreamObserverTest {
    @Test
    public void testConstructor() {
        // TODO: This test is incomplete.
        //   Reason: Nothing to assert: the constructed class does not have observers (e.g. getters or public fields).
        //   Add observers (e.g. getters or public fields) to the class.
        //   See https://diff.blue/R002

        new BalanceStreamObserver(new CountDownLatch(1));
    }

    @Test
    public void testOnError() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        BalanceStreamObserver balanceStreamObserver = new BalanceStreamObserver(new CountDownLatch(1));
        balanceStreamObserver.onError(new Throwable());
    }

    @Test
    public void testOnCompleted() {
        // TODO: This test is incomplete.
        //   Reason: Nothing to assert: neither the return value type of the method under test nor the types of its parameters have observers (e.g. getters or public fields).
        //   Add observers (e.g. getters or public fields) to the declaring class
        //   of the method under test, its return type or any of its parameter
        //   types.
        //   See https://diff.blue/R003

        (new BalanceStreamObserver(new CountDownLatch(1))).onCompleted();
    }
}


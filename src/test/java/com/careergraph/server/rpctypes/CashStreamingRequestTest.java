package com.careergraph.server.rpctypes;

import com.careergraph.client.rpctypes.BalanceStreamObserver;

import java.util.concurrent.CountDownLatch;

import org.junit.jupiter.api.Test;

public class CashStreamingRequestTest {
    @Test
    public void testConstructor() {
        // TODO: This test is incomplete.
        //   Reason: Nothing to assert: the constructed class does not have observers (e.g. getters or public fields).
        //   Add observers (e.g. getters or public fields) to the class.
        //   See https://diff.blue/R002

        CashStreamingRequest actualCashStreamingRequest = new CashStreamingRequest(
                new BalanceStreamObserver(new CountDownLatch(1)));
        actualCashStreamingRequest.onError(new Throwable());
    }

    @Test
    public void testConstructor2() {
        // TODO: This test is incomplete.
        //   Reason: Nothing to assert: the constructed class does not have observers (e.g. getters or public fields).
        //   Add observers (e.g. getters or public fields) to the class.
        //   See https://diff.blue/R002

        // Arrange and Act
        CashStreamingRequest actualCashStreamingRequest = new CashStreamingRequest(
                new BalanceStreamObserver(new CountDownLatch(1)));
        actualCashStreamingRequest.onError(new Throwable());
    }

    @Test
    public void testOnCompleted() {
        // TODO: This test is incomplete.
        //   Reason: Nothing to assert: neither the return value type of the method under test nor the types of its parameters have observers (e.g. getters or public fields).
        //   Add observers (e.g. getters or public fields) to the declaring class
        //   of the method under test, its return type or any of its parameter
        //   types.
        //   See https://diff.blue/R003

        (new CashStreamingRequest(new BalanceStreamObserver(new CountDownLatch(1)))).onCompleted();
    }

    @Test
    public void testOnCompleted2() {
        // TODO: This test is incomplete.
        //   Reason: Nothing to assert: neither the return value type of the method under test nor the types of its parameters have observers (e.g. getters or public fields).
        //   Add observers (e.g. getters or public fields) to the declaring class
        //   of the method under test, its return type or any of its parameter
        //   types.
        //   See https://diff.blue/R003

        (new CashStreamingRequest(new BalanceStreamObserver(new CountDownLatch(0)))).onCompleted();
    }

    @Test
    public void testOnCompleted3() {
        // TODO: This test is incomplete.
        //   Reason: Nothing to assert: neither the return value type of the method under test nor the types of its parameters have observers (e.g. getters or public fields).
        //   Add observers (e.g. getters or public fields) to the declaring class
        //   of the method under test, its return type or any of its parameter
        //   types.
        //   See https://diff.blue/R003

        // Arrange and Act
        (new CashStreamingRequest(new BalanceStreamObserver(new CountDownLatch(1)))).onCompleted();
    }

    @Test
    public void testOnCompleted4() {
        // TODO: This test is incomplete.
        //   Reason: Nothing to assert: neither the return value type of the method under test nor the types of its parameters have observers (e.g. getters or public fields).
        //   Add observers (e.g. getters or public fields) to the declaring class
        //   of the method under test, its return type or any of its parameter
        //   types.
        //   See https://diff.blue/R003

        // Arrange and Act
        (new CashStreamingRequest(new BalanceStreamObserver(new CountDownLatch(0)))).onCompleted();
    }
}


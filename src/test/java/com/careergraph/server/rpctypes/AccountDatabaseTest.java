package com.careergraph.server.rpctypes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class AccountDatabaseTest {
    @Test
    public void testGetBalance() {
        assertEquals(202, AccountDatabase.getBalance(3));
    }

    @Test
    public void testAddBalance() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        AccountDatabase.addBalance(3, 10);
    }

    @Test
    public void testAddBalance2() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        AccountDatabase.addBalance(1, 1);
    }

    @Test
    public void testAddBalance3() {
        assertNull(AccountDatabase.addBalance(123, 10));
    }

    @Test
    public void testDeductBalance() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        AccountDatabase.deductBalance(3, 10);
    }

    @Test
    public void testDeductBalance2() {
        assertNull(AccountDatabase.deductBalance(123, 10));
    }

    @Test
    public void testPrintAccountDetails() {
        // TODO: This test is incomplete.
        //   Reason: Nothing to assert: neither the return value type of the method under test nor the types of its parameters have observers (e.g. getters or public fields).
        //   Add observers (e.g. getters or public fields) to the declaring class
        //   of the method under test, its return type or any of its parameter
        //   types.
        //   See https://diff.blue/R003

        AccountDatabase.printAccountDetails();
    }
}


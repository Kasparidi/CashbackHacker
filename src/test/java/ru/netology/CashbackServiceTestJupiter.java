package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackServiceTestJupiter {
    @Test
    public void testRemain() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 900;
        int expected = 100;
        assertEquals(expected, service.remain(amount));
    }

    @Test
    public void checkBoundary() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1000;
        int expected = 0;
        assertEquals(expected, service.remain(amount));
    }

    @Test
    public void checkAmountMore() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1800;
        int expected = 200;
        assertEquals(expected, service.remain(amount));
    }

    @Test
    public void checkDoubleBoundary() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 2000;
        int expected = 0;
        assertEquals(expected, service.remain(amount));
    }
}

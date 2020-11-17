package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {

    @Test
    public void testRemain() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 900;
        int expected = 100;
        assertEquals(service.remain(amount), expected);
    }

    @Test
    public void checkBoundary() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1000;
        int expected = 0;
        assertEquals(service.remain(amount), expected);
    }

    @Test
    public void checkAmountMore() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1800;
        int expected = 200;
        assertEquals(service.remain(amount), expected);
    }

    @Test
    public void checkDoubleBoundary() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 2000;
        int expected = 0;
        assertEquals(service.remain(amount), expected);
    }
}
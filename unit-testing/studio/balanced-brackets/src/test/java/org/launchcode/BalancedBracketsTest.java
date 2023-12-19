package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here


    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void equalBrackets1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void equalBrackets2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets( "[]LaunchCode"));
    }

    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void unequalBrackets1() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void unequalBrackets2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void unequalBrackets3() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void bracketsOutOfOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unequalBrackets4() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void unequalBrackets5() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]"));
    }

    @Test
    public void unequalBrackets6() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]"));
    }

    @Test
    public void unequalBrackets7() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[]"));
    }

    @Test
    public void unequalBrackets8() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]]]]"));
    }

}


package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListTest {
    private CircularLinkedList<String> list;

    @BeforeEach
    void setUp() {
        list = new CircularLinkedList<>();
    }

    @Test
    void testAppendAndCurrent() {
        assertNull(list.current(), "Current should be null for an empty list");

        list.append("A");
        assertEquals("A", list.current(), "Current should be 'A'");
    }

    @Test
    void testStep() {
        list.append("A");
        list.append("B");
        list.append("C");

        assertEquals("A", list.current(), "Should start at 'A'");
        list.step();
        assertEquals("B", list.current(), "Should move to 'B'");
        list.step();
        assertEquals("C", list.current(), "Should move to 'C'");
        list.step();
        assertEquals("A", list.current(), "Should loop back to 'A'");
    }

    @Test
    void testCircularBehavior() {
        list.append("X");
        list.append("Y");

        list.step();
        assertEquals("Y", list.current(), "Should be at 'Y'");
        list.step();
        assertEquals("X", list.current(), "Should loop back to 'X'");
    }

    @Test
    void testDoubleDice() {
        list.append("1");
        list.append("2");
        list.append("3");

        list.doubleDice();
        assertNotNull(list.current(), "Current should not be null after dice roll");
    }
}
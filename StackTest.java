package qm.ex2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the Stack class.
 * Contains unit tests for stack operations like push, pop, top, size, and isEmpty.
 */
public class StackTest {

    private qm.ex2.Stack stack;

    /**
     * Sets up a stack instance with a maximum size of 3 before each test.
     */
    @Before
    public void setUp() {
        stack = new qm.ex2.Stack(3);
    }

    /**
     * Tests the pop method to check if it removes and returns the top element correctly.
     */
    @Test
    public void testPop(){
        Assert.assertEquals(-1, stack.pop()); // Popping from an empty stack returns -1
        stack.push(0);
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, stack.pop()); // Last pushed element should be popped first
        Assert.assertEquals(1, stack.pop()); // Next element to be popped
    }

    /**
     * Tests the top method to ensure it returns the top element without removal.
     */
    @Test
    public void testTop(){
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, stack.top()); // The current top element should be 2
    }

    /**
     * Tests the push method, including stack overflow and invalid element scenarios.
     */
    @Test
    public void testPush(){
        Assert.assertThrows(IllegalArgumentException.class, () -> stack.push(-1)); // Negative numbers not allowed
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertThrows(StackOverflowError.class, () -> stack.push(4)); // Stack overflow test
    }

    /**
     * Tests the size method to ensure it returns the correct number of elements.
     */
    @Test
    public void testSize(){
        Assert.assertEquals(0, stack.size()); // Initially, stack is empty
        stack.push(0);
        Assert.assertEquals(1, stack.size()); // Stack size after one push
    }

    /**
     * Tests the isEmpty method to verify stack's empty status.
     */
    @Test
    public void testIsEmpty(){
        Assert.assertTrue(stack.isEmpty()); // Stack is empty initially
        stack.push(1);
        Assert.assertFalse(stack.isEmpty()); // Stack is no longer empty
    }
}

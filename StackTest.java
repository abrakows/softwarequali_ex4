package qm.ex2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private qm.ex2.Stack stack;

    @Before
    public void setUp() {
        stack = new qm.ex2.Stack(3);
    }

    @Test
    public void testPop(){
        Assert.assertEquals(-1, stack.pop());
        stack.push(0);
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, stack.pop());
        Assert.assertEquals(1, stack.pop());
    }

    @Test
    public void testTop(){
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, stack.top());
    }

    @Test
    public void testPush(){
        Assert.assertThrows(IllegalArgumentException.class, () -> stack.push(-1));
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertThrows(StackOverflowError.class, () -> stack.push(4));
    }

    @Test
    public void testSize(){
        Assert.assertEquals(0, stack.size());
        stack.push(0);
        Assert.assertEquals(1, stack.size());
    }

    @Test
    public void testIsEmpty(){
        Assert.assertTrue(stack.isEmpty());
        stack.push(1);
        Assert.assertFalse(stack.isEmpty());
    }
}

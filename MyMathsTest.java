package qm.ex2;

import org.junit.Test;
import org.junit.Assert;

public class MyMathsTest {

    private qm.ex2.MyMaths maths;

    @Test
    public void gcd() {
        maths = new qm.ex2.MyMaths();
        Assert.assertEquals(1, maths.gcd(2, 3));
        Assert.assertEquals(1, maths.gcd(2, 1));
    }
}
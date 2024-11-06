// SPDX-License-Identifier: MIT

package qm.ex2;

import org.junit.Test;
import org.junit.Assert;

/**
 * Test class for the MyMaths class.
 * 
 * This class includes unit tests for the GCD calculation method in MyMaths.
 */
public class MyMathsTest {

    private qm.ex2.MyMaths maths;

    @Test
    public void gcd() {
        maths = new qm.ex2.MyMaths();
        Assert.assertEquals(1, maths.gcd(2, 3));
        Assert.assertEquals(1, maths.gcd(2, 1));
    }
}

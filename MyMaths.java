// SPDX-License-Identifier: MIT

package qm.ex2;

/**
 * This class provides utility mathematical methods.
 * Currently, it includes a method for calculating the greatest common divisor (GCD)
 * of two integers.
 */
public class MyMaths {

/**
 * @param m the first integer
 * @param n the second integer
 * @return the greatest common divisor of m and n
 */
	public int gcd(int m, int n) {
		
		int r;
		if (n>m) {
			
			r = m;
			m = n;
			n = r;
		}
		
		r = m % n;
		while (r != 0) {
			
			m = n;
			n = r;
			r = m % n;
		}		
		return n;
	}
	
}

/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 20:36:20 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.GCD;

public class GCD_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GCD gCD0 = new GCD();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = GCD.gcd((-240), (-370));
      assertEquals((-10), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = GCD.gcd(4316, 4316);
      assertEquals(4316, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = GCD.gcd(0, 0);
      assertEquals(0, int0);
  }
}

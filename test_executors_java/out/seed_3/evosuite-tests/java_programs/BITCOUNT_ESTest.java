/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 13:29:48 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.BITCOUNT;

public class BITCOUNT_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BITCOUNT bITCOUNT0 = new BITCOUNT();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = BITCOUNT.bitcount((-2651));
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = BITCOUNT.bitcount(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = BITCOUNT.bitcount(49);
      assertEquals(3, int0);
  }
}

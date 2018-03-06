/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 23:12:02 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LCS_LENGTH;

public class LCS_LENGTH_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LCS_LENGTH lCS_LENGTH0 = new LCS_LENGTH();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("EooKF2;EBP l.Av2f.", "");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("EooKF2;EBP l.Av2f.", "EooKF2;EBP l.Av2f.");
      assertEquals(18, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("", "");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        LCS_LENGTH.lcs_length((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("4vf5HJ", "iMA~C/2wOZx_g0=");
      assertEquals(0, (int)integer0);
  }
}

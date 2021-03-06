/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 23:04:55 GMT 2018
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
      Integer integer0 = LCS_LENGTH.lcs_length("J50.^", "C688kR4Qo6w");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length(" 7._ NB}BFdn!", " 7._ NB}BFdn!");
      assertEquals(13, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("", "");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length(" 7._ NB}BFdn!", "");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        LCS_LENGTH.lcs_length((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 23:07:15 GMT 2018
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
      Integer integer0 = LCS_LENGTH.lcs_length("3u:a`{J*d", "");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("3u:a`{J*d", "3u:a`{J*d");
      assertEquals(10, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("c|@$js", "java_programs.LCS_LENGTH");
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("", "3u:a`{J*d");
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

/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 00:03:43 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LONGEST_COMMON_SUBSEQUENCE;

public class LONGEST_COMMON_SUBSEQUENCE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("D=#ujU!", "D=#ujU!");
      assertEquals("D=#ujU!", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("D=#ujU!", "!+XY5Ubtg");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "-A\".");
      assertEquals("", string0);
  }
}

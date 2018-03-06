/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 00:29:35 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.MAX_SUBLIST_SUM;

public class MAX_SUBLIST_SUM_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MAX_SUBLIST_SUM mAX_SUBLIST_SUM0 = new MAX_SUBLIST_SUM();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = MAX_SUBLIST_SUM.max_sublist_sum(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        MAX_SUBLIST_SUM.max_sublist_sum((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 2603;
      intArray0[1] = (-28);
      int int0 = MAX_SUBLIST_SUM.max_sublist_sum(intArray0);
      assertEquals(2603, int0);
  }
}

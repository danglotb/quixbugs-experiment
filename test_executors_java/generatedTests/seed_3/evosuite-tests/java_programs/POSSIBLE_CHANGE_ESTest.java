/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 02:13:19 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.POSSIBLE_CHANGE;

public class POSSIBLE_CHANGE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 1051;
      intArray0[1] = 7582;
      intArray0[2] = 1692;
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 1692);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        POSSIBLE_CHANGE.possible_change((int[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

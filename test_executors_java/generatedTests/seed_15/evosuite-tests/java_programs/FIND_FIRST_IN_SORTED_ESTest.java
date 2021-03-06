/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 19:57:39 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.FIND_FIRST_IN_SORTED;

public class FIND_FIRST_IN_SORTED_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FIND_FIRST_IN_SORTED fIND_FIRST_IN_SORTED0 = new FIND_FIRST_IN_SORTED();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[9];
      int int0 = FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, (-1430));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[1] = (-1430);
      int int0 = FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, (-1430));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-1372);
      int int0 = FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, (-1372));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[2] = (-1325);
      int int0 = FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, 0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        FIND_FIRST_IN_SORTED.find_first_in_sorted((int[]) null, (-615));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

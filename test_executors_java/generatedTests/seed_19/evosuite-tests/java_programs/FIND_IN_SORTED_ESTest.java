/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 20:16:33 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.FIND_IN_SORTED;

public class FIND_IN_SORTED_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FIND_IN_SORTED fIND_IN_SORTED0 = new FIND_IN_SORTED();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        FIND_IN_SORTED.find_in_sorted((int[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, 0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[3] = 1439;
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, 889);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        FIND_IN_SORTED.binsearch(intArray0, 2, 2, 1060);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 531
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        FIND_IN_SORTED.binsearch((int[]) null, (-1429), 0, (-672));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = FIND_IN_SORTED.binsearch(intArray0, 1, 0, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[1] = 2;
      int int0 = FIND_IN_SORTED.binsearch(intArray0, 2, 5, (-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 2;
      int int0 = FIND_IN_SORTED.binsearch(intArray0, 2, 1, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, 0);
      assertEquals(0, int0);
  }
}

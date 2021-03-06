/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 20:13:00 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.FIND_IN_SORTED;

public class FIND_IN_SORTED_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FIND_IN_SORTED fIND_IN_SORTED0 = new FIND_IN_SORTED();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        FIND_IN_SORTED.find_in_sorted((int[]) null, 1678);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-5307);
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, (-5307));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[3] = (-195);
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, 0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        FIND_IN_SORTED.binsearch(intArray0, 1688, 1688, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        FIND_IN_SORTED.binsearch((int[]) null, 2, 2, 2439);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = FIND_IN_SORTED.binsearch(intArray0, (-1024), 1, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = FIND_IN_SORTED.binsearch(intArray0, 0, 2, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = FIND_IN_SORTED.binsearch(intArray0, 0, 0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[9];
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, (-1707));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[9];
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, 5594);
      assertEquals((-1), int0);
  }
}

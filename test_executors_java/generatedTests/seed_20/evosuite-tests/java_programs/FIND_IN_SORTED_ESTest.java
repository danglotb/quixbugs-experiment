/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 20:17:05 GMT 2018
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
      int[] intArray0 = new int[8];
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, (-1347));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[4] = 1;
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, 1);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        FIND_IN_SORTED.binsearch(intArray0, 0, 0, (-1746));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -873
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        FIND_IN_SORTED.binsearch((int[]) null, 0, 1453, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      int int0 = FIND_IN_SORTED.binsearch((int[]) null, 0, 1745, 1745);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[4] = 1;
      int int0 = FIND_IN_SORTED.binsearch(intArray0, 1, 0, 9);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (-4241);
      int int0 = FIND_IN_SORTED.binsearch(intArray0, (-4241), 1, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[1] = 2555;
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, 0);
      assertEquals(0, int0);
  }
}

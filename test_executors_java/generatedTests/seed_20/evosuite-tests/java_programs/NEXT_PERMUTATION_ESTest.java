/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 01:48:22 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.NEXT_PERMUTATION;

public class NEXT_PERMUTATION_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NEXT_PERMUTATION nEXT_PERMUTATION0 = new NEXT_PERMUTATION();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      // Undeclared exception!
      try { 
        NEXT_PERMUTATION.next_permutation(arrayList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(14);
      arrayList0.add(integer0);
      ArrayList<Integer> arrayList1 = NEXT_PERMUTATION.next_permutation(arrayList0);
      assertNotSame(arrayList0, arrayList1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(14);
      arrayList0.add(integer0);
      arrayList0.add(integer0);
      ArrayList<Integer> arrayList1 = NEXT_PERMUTATION.next_permutation(arrayList0);
      assertTrue(arrayList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(14);
      arrayList0.add(integer0);
      Integer integer1 = new Integer(982);
      arrayList0.add(integer1);
      NEXT_PERMUTATION.next_permutation(arrayList0);
      assertEquals(2, arrayList0.size());
      assertTrue(arrayList0.contains(982));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(14);
      arrayList0.add(integer0);
      Integer integer1 = new Integer(982);
      arrayList0.add(integer1);
      arrayList0.add(integer0);
      NEXT_PERMUTATION.next_permutation(arrayList0);
      assertEquals(3, arrayList0.size());
      assertTrue(arrayList0.contains(982));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        NEXT_PERMUTATION.next_permutation((ArrayList<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(14);
      arrayList0.add(integer0);
      Integer integer1 = new Integer(982);
      arrayList0.add(integer1);
      Integer integer2 = new Integer(0);
      arrayList0.add(integer2);
      NEXT_PERMUTATION.next_permutation(arrayList0);
      assertEquals(3, arrayList0.size());
      assertTrue(arrayList0.contains(982));
  }
}

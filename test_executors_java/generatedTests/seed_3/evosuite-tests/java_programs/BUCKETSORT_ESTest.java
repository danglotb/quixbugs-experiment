/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 19:28:56 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.BUCKETSORT;

public class BUCKETSORT_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BUCKETSORT bUCKETSORT0 = new BUCKETSORT();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-419));
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        BUCKETSORT.bucketsort(arrayList0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -419
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Integer> arrayList1 = BUCKETSORT.bucketsort(arrayList0, 2613);
      ArrayList<Integer> arrayList2 = BUCKETSORT.bucketsort(arrayList1, 2613);
      ArrayList<Integer> arrayList3 = BUCKETSORT.bucketsort(arrayList2, 2613);
      // Undeclared exception!
      BUCKETSORT.bucketsort(arrayList3, 2613);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        BUCKETSORT.bucketsort((ArrayList<Integer>) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // List length = -1
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(2077);
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        BUCKETSORT.bucketsort(arrayList0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2077, Size: 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        BUCKETSORT.bucketsort((ArrayList<Integer>) null, 100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = Integer.valueOf(1451);
      arrayList0.add(integer0);
      ArrayList<Integer> arrayList1 = BUCKETSORT.bucketsort(arrayList0, 3833);
      assertEquals(1, arrayList0.size());
      assertTrue(arrayList1.equals((Object)arrayList0));
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 19:35:29 GMT 2018
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
      Integer integer0 = Integer.getInteger("", 1);
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        BUCKETSORT.bucketsort(arrayList0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Integer> arrayList1 = BUCKETSORT.bucketsort(arrayList0, 4668);
      ArrayList<Integer> arrayList2 = BUCKETSORT.bucketsort(arrayList1, 4668);
      // Undeclared exception!
      BUCKETSORT.bucketsort(arrayList2, 4668);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-993));
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        BUCKETSORT.bucketsort(arrayList0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -993
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      // Undeclared exception!
      try { 
        BUCKETSORT.bucketsort(arrayList0, (-1265));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // List length = -1265
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        BUCKETSORT.bucketsort((ArrayList<Integer>) null, 0);
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
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      ArrayList<Integer> arrayList1 = BUCKETSORT.bucketsort(arrayList0, 1);
      assertEquals(1, arrayList0.size());
      assertTrue(arrayList1.equals((Object)arrayList0));
  }
}

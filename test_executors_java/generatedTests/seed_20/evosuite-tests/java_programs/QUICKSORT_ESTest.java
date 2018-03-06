/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 03:18:02 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java_programs.QUICKSORT;

public class QUICKSORT_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QUICKSORT qUICKSORT0 = new QUICKSORT();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-10));
      arrayList0.add(integer0);
      Integer integer1 = new Integer(2024);
      arrayList0.add(integer1);
      arrayList0.addAll((Collection<? extends Integer>) arrayList0);
      ArrayList<Integer> arrayList1 = QUICKSORT.quicksort(arrayList0);
      assertEquals(4, arrayList0.size());
      assertEquals(4, arrayList1.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        QUICKSORT.quicksort((ArrayList<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Integer> arrayList1 = QUICKSORT.quicksort(arrayList0);
      assertTrue(arrayList1.equals((Object)arrayList0));
  }
}

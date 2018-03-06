/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 22:55:18 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.KTH;

public class KTH_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KTH kTH0 = new KTH();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(653);
      arrayList0.add(integer0);
      Integer integer1 = KTH.kth(arrayList0, 0);
      assertEquals(653, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(2992);
      arrayList0.add(integer0);
      Integer integer1 = new Integer((-1756));
      arrayList0.add(integer1);
      // Undeclared exception!
      try { 
        KTH.kth(arrayList0, 2992);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      Integer integer1 = new Integer(16);
      arrayList0.add(integer1);
      Integer integer2 = KTH.kth(arrayList0, 0);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        KTH.kth(arrayList0, (-5999));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        KTH.kth((ArrayList<Integer>) null, 0);
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
      Integer integer0 = new Integer((-439));
      arrayList0.add(integer0);
      Integer integer1 = KTH.kth(arrayList0, 0);
      assertEquals((-439), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        KTH.kth(arrayList0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }
}

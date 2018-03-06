/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 20:28:07 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.FLATTEN;

public class FLATTEN_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FLATTEN fLATTEN0 = new FLATTEN();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = FLATTEN.flatten((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      ArrayList<String> arrayList1 = new ArrayList<String>();
      arrayList0.add((Object) arrayList1);
      ArrayList arrayList2 = (ArrayList)FLATTEN.flatten(arrayList0);
      assertEquals(0, arrayList2.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add(object0);
      ArrayList arrayList1 = (ArrayList)FLATTEN.flatten(arrayList0);
      assertFalse(arrayList1.isEmpty());
  }
}

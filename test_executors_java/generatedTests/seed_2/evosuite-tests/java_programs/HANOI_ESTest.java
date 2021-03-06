/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 21:14:31 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java_programs.HANOI;

public class HANOI_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HANOI.Pair<HANOI.Pair<Object, Object>, Object> hANOI_Pair0 = new HANOI.Pair<HANOI.Pair<Object, Object>, Object>((HANOI.Pair<Object, Object>) null, (Object) null);
      Object object0 = hANOI_Pair0.getSecond();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HANOI.Pair<HANOI.Pair<Object, Object>, Object> hANOI_Pair0 = new HANOI.Pair<HANOI.Pair<Object, Object>, Object>((HANOI.Pair<Object, Object>) null, (Object) null);
      hANOI_Pair0.setFirst((HANOI.Pair<Object, Object>) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HANOI.Pair<HANOI.Pair<Object, Object>, Object> hANOI_Pair0 = new HANOI.Pair<HANOI.Pair<Object, Object>, Object>((HANOI.Pair<Object, Object>) null, (Object) null);
      hANOI_Pair0.setSecond((Object) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(2, 2, 2);
      HANOI.Pair<Object, String> hANOI_Pair0 = new HANOI.Pair<Object, String>(list0, "");
      HANOI.Pair<Object, Object> hANOI_Pair1 = new HANOI.Pair<Object, Object>(hANOI_Pair0, list0);
      String string0 = hANOI_Pair1.toString();
      assertEquals("(([(2, 1), (2, 2), (1, 2)], ), [(2, 1), (2, 2), (1, 2)])", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(2, 2, 2);
      HANOI.Pair<Object, String> hANOI_Pair0 = new HANOI.Pair<Object, String>(list0, "");
      HANOI.Pair<Object, Object> hANOI_Pair1 = new HANOI.Pair<Object, Object>(hANOI_Pair0, list0);
      Integer integer0 = new Integer(0);
      HANOI.Pair<Object, Integer> hANOI_Pair2 = new HANOI.Pair<Object, Integer>(hANOI_Pair1, integer0);
      hANOI_Pair2.getFirst();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi((-1), (-1), (-2590));
      assertTrue(list0.isEmpty());
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 21:16:36 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.List;
import java_programs.HANOI;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class HANOI_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HANOI.Pair<String, String> hANOI_Pair0 = new HANOI.Pair<String, String>("rI{", "rI{");
      HANOI.Pair<Object, Object> hANOI_Pair1 = (HANOI.Pair<Object, Object>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(hANOI_Pair1).toString();
      HANOI.Pair<Object, HANOI.Pair<Object, Object>> hANOI_Pair2 = new HANOI.Pair<Object, HANOI.Pair<Object, Object>>(hANOI_Pair0, hANOI_Pair1);
      HANOI.Pair<Object, Object> hANOI_Pair3 = hANOI_Pair2.getSecond();
      assertSame(hANOI_Pair3, hANOI_Pair1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HANOI.Pair<String, Object> hANOI_Pair0 = new HANOI.Pair<String, Object>("uf#)B%S<+fXC", (Object) null);
      hANOI_Pair0.setFirst("uf#)B%S<+fXC");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(72);
      HANOI.Pair<Integer, Integer> hANOI_Pair0 = new HANOI.Pair<Integer, Integer>(integer0, integer0);
      HANOI.Pair<Object, Integer> hANOI_Pair1 = new HANOI.Pair<Object, Integer>(hANOI_Pair0, integer0);
      hANOI_Pair1.setSecond(integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HANOI.Pair<String, Object> hANOI_Pair0 = (HANOI.Pair<String, Object>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(hANOI_Pair0).toString();
      HANOI.Pair<HANOI.Pair<String, Object>, String> hANOI_Pair1 = new HANOI.Pair<HANOI.Pair<String, Object>, String>(hANOI_Pair0, "^]Z p`w(t}oX4S&mJ9");
      String string0 = hANOI_Pair1.toString();
      assertEquals("(null, ^]Z p`w(t}oX4S&mJ9)", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HANOI.Pair<String, Object> hANOI_Pair0 = new HANOI.Pair<String, Object>("uf#)B%S<+fXC", (Object) null);
      String string0 = hANOI_Pair0.getFirst();
      assertEquals("uf#)B%S<+fXC", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(2, (-1), 2);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi((-1641), (-2728), 1);
      assertTrue(list0.isEmpty());
  }
}

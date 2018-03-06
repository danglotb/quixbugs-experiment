/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 21:19:39 GMT 2018
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
      HANOI.Pair<String, HANOI.Pair<Object, String>> hANOI_Pair0 = new HANOI.Pair<String, HANOI.Pair<Object, String>>("", (HANOI.Pair<Object, String>) null);
      HANOI.Pair<String, Object> hANOI_Pair1 = (HANOI.Pair<String, Object>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      HANOI.Pair<HANOI.Pair<String, Object>, Object> hANOI_Pair2 = new HANOI.Pair<HANOI.Pair<String, Object>, Object>(hANOI_Pair1, hANOI_Pair0);
      Object object0 = hANOI_Pair2.getSecond();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HANOI.Pair<String, Object> hANOI_Pair0 = (HANOI.Pair<String, Object>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      HANOI.Pair<String, HANOI.Pair<String, Object>> hANOI_Pair1 = new HANOI.Pair<String, HANOI.Pair<String, Object>>("", hANOI_Pair0);
      hANOI_Pair1.setFirst("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HANOI.Pair<String, HANOI.Pair<Object, String>> hANOI_Pair0 = new HANOI.Pair<String, HANOI.Pair<Object, String>>("", (HANOI.Pair<Object, String>) null);
      Integer integer0 = new Integer(0);
      HANOI.Pair<Object, String> hANOI_Pair1 = new HANOI.Pair<Object, String>(integer0, "");
      hANOI_Pair0.setSecond(hANOI_Pair1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HANOI.Pair<String, Object> hANOI_Pair0 = (HANOI.Pair<String, Object>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(hANOI_Pair0).toString();
      HANOI.Pair<String, HANOI.Pair<String, Object>> hANOI_Pair1 = new HANOI.Pair<String, HANOI.Pair<String, Object>>("", hANOI_Pair0);
      String string0 = hANOI_Pair1.toString();
      assertEquals("(, null)", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HANOI.Pair<String, HANOI.Pair<Object, String>> hANOI_Pair0 = new HANOI.Pair<String, HANOI.Pair<Object, String>>("", (HANOI.Pair<Object, String>) null);
      String string0 = hANOI_Pair0.getFirst();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(3, 3, 3);
      assertEquals(7, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi((-6040), 0, (-797));
      assertEquals(0, list0.size());
  }
}

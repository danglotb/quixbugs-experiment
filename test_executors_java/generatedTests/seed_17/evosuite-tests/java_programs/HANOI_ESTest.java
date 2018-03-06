/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 21:30:33 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java_programs.HANOI;

public class HANOI_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(1);
      HANOI.Pair<String, Object> hANOI_Pair0 = new HANOI.Pair<String, Object>("e1G`//", integer0);
      Object object0 = hANOI_Pair0.getSecond();
      assertEquals(1, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(1);
      HANOI.Pair<Integer, Integer> hANOI_Pair0 = new HANOI.Pair<Integer, Integer>(integer0, integer0);
      hANOI_Pair0.setFirst(integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(1);
      HANOI.Pair<String, Object> hANOI_Pair0 = new HANOI.Pair<String, Object>("e1G`//", integer0);
      Object object0 = new Object();
      hANOI_Pair0.setSecond(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HANOI.Pair<String, Object> hANOI_Pair0 = new HANOI.Pair<String, Object>("Pm2|h-r~S./", "Pm2|h-r~S./");
      String string0 = hANOI_Pair0.toString();
      assertEquals("(Pm2|h-r~S./, Pm2|h-r~S./)", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HANOI.Pair<String, Object> hANOI_Pair0 = new HANOI.Pair<String, Object>("java_programs.HANOI$Pair", "java_programs.HANOI$Pair");
      String string0 = hANOI_Pair0.getFirst();
      assertEquals("java_programs.HANOI$Pair", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(2, 2, 2);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(0, 0, 0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi((-1790), (-1790), (-1405));
      assertEquals(0, list0.size());
  }
}

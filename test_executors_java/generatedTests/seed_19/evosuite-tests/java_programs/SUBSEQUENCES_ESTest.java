/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 11:50:46 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.SUBSEQUENCES;

public class SUBSEQUENCES_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(1710, (-183), (-1718));
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(50, 50, 50);
      assertEquals(0, arrayList0.size());
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 04:46:26 GMT 2018
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
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 40, 0);
      assertEquals(1, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      SUBSEQUENCES.subsequences((-849), 2598, 40);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SUBSEQUENCES.subsequences(89, 0, (-1));
  }
}

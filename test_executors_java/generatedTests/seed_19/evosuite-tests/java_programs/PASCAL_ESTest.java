/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 02:08:12 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.PASCAL;

public class PASCAL_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PASCAL pASCAL0 = new PASCAL();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      PASCAL.pascal(789);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<ArrayList<Integer>> arrayList0 = PASCAL.pascal(0);
      assertEquals(1, arrayList0.size());
  }
}

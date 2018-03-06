/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 04:56:54 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.SUBSEQUENCES;

public class SUBSEQUENCES_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 0;
      SUBSEQUENCES.subsequences(0, 0, 1);
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      SUBSEQUENCES.subsequences(1, 50, 1);
      SUBSEQUENCES.subsequences(1199, 1199, 0);
      int int1 = 159;
      SUBSEQUENCES.subsequences(1, 0, 159);
      int int2 = (-3252);
      SUBSEQUENCES.subsequences((-3252), 1, 0);
      SUBSEQUENCES.subsequences(1, (-3452), 1);
      int int3 = (-1300);
      // Undeclared exception!
      try { 
        SUBSEQUENCES.subsequences(int0, int3, int3);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = (-1348);
      // Undeclared exception!
      try { 
        SUBSEQUENCES.subsequences(int0, int0, int0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      assertNotNull(sUBSEQUENCES0);
      
      int int0 = (-1);
      int int1 = 0;
      // Undeclared exception!
      try { 
        SUBSEQUENCES.subsequences(int0, int1, int0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 04 19:48:03 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LEVENSHTEIN;

public class LEVENSHTEIN_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = LEVENSHTEIN.levenshtein("%O", "%O");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = LEVENSHTEIN.levenshtein("1n#N#Np0/A|L", "%");
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        LEVENSHTEIN.levenshtein("]qsI!Oc`[=m6l", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      LEVENSHTEIN.levenshtein("=vi9kAUeS8^%9t$WI", ">I1q<");
  }
}

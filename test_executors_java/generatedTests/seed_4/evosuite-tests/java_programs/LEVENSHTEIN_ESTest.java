/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 23:22:26 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LEVENSHTEIN;

public class LEVENSHTEIN_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LEVENSHTEIN.levenshtein("", "");
      int int0 = LEVENSHTEIN.levenshtein("", "mHK|O:( !He^U\"^");
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      int int1 = LEVENSHTEIN.levenshtein("", "mHK|O:( !He^U\"^");
      assertEquals(15, int1);
      
      int int2 = LEVENSHTEIN.levenshtein("", "");
      assertFalse(int2 == int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      LEVENSHTEIN.levenshtein("X!lw7blb^t@i>4(~A", "X!lw7blb^t@i>4(~A");
      LEVENSHTEIN.levenshtein("X!lw7blb^t@i>4(~A", "X!lw7blb^t@i>4(~A");
      String string0 = "";
      LEVENSHTEIN.levenshtein("X!lw7blb^t@i>4(~A", "");
      String string1 = "UV2(cP9k";
      LEVENSHTEIN.levenshtein("UV2(cP9k", "");
      String string2 = "";
      LEVENSHTEIN.levenshtein("UV2(cP9k", "");
      LEVENSHTEIN.levenshtein("", "X!lw7blb^t@i>4(~A");
      // Undeclared exception!
      LEVENSHTEIN.levenshtein("X!lw7blb^t@i>4(~A", "UV2(cP9k");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        LEVENSHTEIN.levenshtein((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

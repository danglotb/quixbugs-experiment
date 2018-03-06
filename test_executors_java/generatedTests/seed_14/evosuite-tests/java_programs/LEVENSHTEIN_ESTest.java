/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 23:36:50 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LEVENSHTEIN;

public class LEVENSHTEIN_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LEVENSHTEIN.levenshtein("tf65iG<fB9r+", "tf65iG<fB9r+");
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      LEVENSHTEIN.levenshtein("Q;5!a", "Q;5!a");
      String string0 = "R^E#+# ";
      // Undeclared exception!
      LEVENSHTEIN.levenshtein("R^E#+# ", "java_programs.LEVENSHTEIN");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      assertNotNull(lEVENSHTEIN0);
      
      String string0 = "O";
      int int0 = LEVENSHTEIN.levenshtein("O", "XFaTh}T-");
      assertEquals(8, int0);
      
      String string1 = ": ptG";
      int int1 = LEVENSHTEIN.levenshtein(": ptG", "");
      assertFalse(int1 == int0);
      assertEquals(5, int1);
      
      String string2 = "";
      int int2 = LEVENSHTEIN.levenshtein("O", "");
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals(1, int2);
      
      // Undeclared exception!
      LEVENSHTEIN.levenshtein("XFaTh}T-", ": ptG");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = null;
      String string1 = "(J~H>QQ}iWd|sFQ";
      // Undeclared exception!
      try { 
        LEVENSHTEIN.levenshtein((String) null, "(J~H>QQ}iWd|sFQ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "";
      int int0 = LEVENSHTEIN.levenshtein("", "");
      assertEquals(0, int0);
      
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      assertNotNull(lEVENSHTEIN0);
      
      // Undeclared exception!
      try { 
        LEVENSHTEIN.levenshtein("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      assertNotNull(lEVENSHTEIN0);
      
      int int0 = LEVENSHTEIN.levenshtein("", "");
      assertEquals(0, int0);
      
      int int1 = LEVENSHTEIN.levenshtein("", "");
      assertTrue(int1 == int0);
      assertEquals(0, int1);
      
      int int2 = LEVENSHTEIN.levenshtein("", "");
      assertTrue(int2 == int1);
      assertTrue(int2 == int0);
      assertEquals(0, int2);
      
      int int3 = LEVENSHTEIN.levenshtein("", "java_programs.LEVENSHTEIN");
      assertFalse(int3 == int2);
      assertFalse(int3 == int0);
      assertFalse(int3 == int1);
      assertEquals(25, int3);
      
      int int4 = LEVENSHTEIN.levenshtein("`sA,QqXd", "");
      assertFalse(int4 == int0);
      assertFalse(int4 == int1);
      assertFalse(int4 == int3);
      assertFalse(int4 == int2);
      assertEquals(8, int4);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      assertNotNull(lEVENSHTEIN0);
      
      String string0 = "21p*h)y\\]";
      int int0 = LEVENSHTEIN.levenshtein("21p*h)y]", "21p*h)y]");
      assertEquals(0, int0);
      
      String string1 = "{Q.tP,iLJ4#";
      // Undeclared exception!
      LEVENSHTEIN.levenshtein("3+!O^R~@?c+uG;", "{Q.tP,iLJ4#");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      assertNotNull(lEVENSHTEIN0);
      
      String string0 = ">OE)1^>Yc%!0";
      // Undeclared exception!
      LEVENSHTEIN.levenshtein(">OE)1^>Yc%!0", "\"Sv%>6<");
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      assertNotNull(lEVENSHTEIN0);
      
      int int0 = LEVENSHTEIN.levenshtein("ZY0;u@f\t kclWwbR", "ZY0;u@f\t kclWwbR");
      assertEquals(0, int0);
      
      int int1 = LEVENSHTEIN.levenshtein("ZY0;u@f\t kclWwbR", "");
      assertFalse(int1 == int0);
      assertEquals(16, int1);
      
      int int2 = LEVENSHTEIN.levenshtein("", "");
      assertTrue(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals(0, int2);
  }
}

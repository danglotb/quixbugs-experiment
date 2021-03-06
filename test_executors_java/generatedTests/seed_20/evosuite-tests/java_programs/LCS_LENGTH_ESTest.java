/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 23:16:44 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LCS_LENGTH;

public class LCS_LENGTH_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LCS_LENGTH lCS_LENGTH0 = new LCS_LENGTH();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("${u&m*8OS:s", "' 9t*(MvJ&4EZj}");
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("OcizIOh", "OcizIOh");
      assertEquals(7, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("", "");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("OcizIOh", "");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        LCS_LENGTH.lcs_length((String) null, "m}Ih~Ss?(4rc2");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

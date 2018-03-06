/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 22:23:49 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.KNAPSACK;

public class KNAPSACK_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][] intArray0 = new int[2][9];
      int[] intArray1 = new int[3];
      intArray1[0] = 231;
      intArray0[0] = intArray1;
      int int0 = KNAPSACK.knapsack(231, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][] intArray0 = new int[1][1];
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(489, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[][] intArray0 = new int[2][9];
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-184), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(0, (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][] intArray0 = new int[3][4];
      // Undeclared exception!
      KNAPSACK.knapsack(2658, intArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[][] intArray0 = new int[2][9];
      int[] intArray1 = new int[3];
      intArray1[1] = 231;
      intArray0[0] = intArray1;
      int int0 = KNAPSACK.knapsack(231, intArray0);
      assertEquals(231, int0);
  }
}

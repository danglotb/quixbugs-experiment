/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 22:15:19 GMT 2018
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
      int[][] intArray0 = new int[4][7];
      int[] intArray1 = new int[3];
      intArray1[0] = 459;
      intArray0[0] = intArray1;
      int int0 = KNAPSACK.knapsack(459, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][] intArray0 = new int[4][7];
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-1), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[][] intArray0 = new int[0][3];
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-406), intArray0);
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
        KNAPSACK.knapsack((-3699), (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][] intArray0 = new int[0][8];
      KNAPSACK.knapsack(3543, intArray0);
      KNAPSACK.knapsack(2628, intArray0);
      // Undeclared exception!
      KNAPSACK.knapsack(4818, intArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[][] intArray0 = new int[4][7];
      int[] intArray1 = new int[3];
      intArray1[1] = 459;
      intArray0[0] = intArray1;
      int int0 = KNAPSACK.knapsack(459, intArray0);
      assertEquals(459, int0);
  }
}
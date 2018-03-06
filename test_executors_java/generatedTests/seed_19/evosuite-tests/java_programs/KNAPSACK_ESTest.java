/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 22:42:30 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.KNAPSACK;

public class KNAPSACK_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[][] intArray0 = new int[5][3];
      int[] intArray1 = new int[8];
      intArray1[0] = 1019;
      intArray1[1] = 1019;
      intArray1[3] = 1019;
      intArray1[4] = 1019;
      intArray1[5] = 1019;
      intArray1[6] = 1019;
      intArray1[7] = 1019;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[9];
      intArray2[0] = 1019;
      intArray2[1] = 1019;
      intArray2[2] = 1019;
      intArray2[3] = 1019;
      intArray2[4] = 1019;
      intArray2[5] = 1019;
      intArray2[6] = 1019;
      intArray2[7] = 1019;
      intArray2[8] = 1019;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[7];
      intArray3[0] = 1019;
      intArray3[1] = 1019;
      intArray3[2] = 1019;
      intArray3[3] = 0;
      intArray3[4] = 1019;
      intArray3[5] = 1019;
      intArray3[6] = 0;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[0];
      intArray0[3] = intArray4;
      int[] intArray5 = new int[0];
      intArray0[4] = intArray5;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(1019, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][] intArrayArray0 = null;
      KNAPSACK kNAPSACK0 = new KNAPSACK();
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
  public void test2()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[0][4];
      KNAPSACK.knapsack(2434, intArray0);
      int int0 = KNAPSACK.knapsack(1, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[][] intArray0 = new int[1][4];
      int[] intArray1 = new int[9];
      intArray1[0] = 456;
      intArray1[1] = 0;
      intArray1[2] = 456;
      intArray1[3] = 456;
      intArray1[4] = 456;
      intArray1[5] = 456;
      intArray1[6] = 0;
      intArray1[7] = 456;
      intArray1[8] = 456;
      intArray0[0] = intArray1;
      KNAPSACK.knapsack(456, intArray0);
      KNAPSACK.knapsack(1, intArray0);
      int int0 = KNAPSACK.knapsack(456, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[1][4];
      KNAPSACK.knapsack(2434, intArray0);
      int int0 = KNAPSACK.knapsack(1, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[4][5];
      int[] intArray1 = new int[3];
      intArray1[0] = 1;
      intArray1[1] = 1;
      intArray1[2] = 1;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[3];
      intArray2[0] = 1;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[5];
      intArray3[0] = 0;
      intArray3[1] = (-1);
      intArray3[2] = (-1);
      intArray3[3] = (-1058);
      intArray3[4] = 1;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[0];
      intArray0[3] = intArray4;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(1, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[][] intArray0 = new int[1][0];
      int[] intArray1 = new int[3];
      intArray1[0] = 275;
      intArray1[1] = 275;
      intArray1[2] = 275;
      intArray0[0] = intArray1;
      int int0 = KNAPSACK.knapsack(275, intArray0);
      assertEquals(275, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[][] intArray0 = new int[0][0];
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-688), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int[][] intArray0 = new int[3][4];
      int[] intArray1 = new int[4];
      intArray1[0] = 0;
      intArray1[1] = 0;
      intArray1[2] = 0;
      intArray1[3] = 0;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[4];
      intArray2[0] = 0;
      intArray2[1] = 0;
      intArray2[2] = 0;
      intArray2[3] = 0;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[7];
      intArray3[0] = 0;
      intArray3[1] = 0;
      intArray3[2] = 0;
      intArray3[3] = 0;
      intArray3[4] = 0;
      intArray3[5] = 0;
      intArray3[6] = 0;
      intArray0[2] = intArray3;
      KNAPSACK.knapsack(0, intArray0);
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      KNAPSACK.knapsack(862, intArray0);
      // Undeclared exception!
      KNAPSACK.knapsack(2230, intArray0);
  }
}

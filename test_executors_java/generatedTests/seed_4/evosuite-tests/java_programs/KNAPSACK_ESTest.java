/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 22:21:07 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.KNAPSACK;

public class KNAPSACK_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[2] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = 0;
      int[] intArray1 = new int[1];
      intArray1[0] = 0;
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[5][3];
      int[] intArray1 = new int[6];
      intArray1[0] = 1239;
      intArray1[1] = 725;
      intArray1[2] = 1239;
      intArray1[3] = 1239;
      intArray1[4] = 1239;
      intArray1[5] = 1239;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[5];
      intArray2[0] = 1239;
      intArray2[1] = 725;
      intArray2[2] = 725;
      intArray2[3] = 1239;
      intArray2[4] = 725;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[2];
      intArray3[0] = 725;
      intArray3[1] = 0;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[7];
      intArray4[0] = 0;
      intArray4[1] = 1239;
      intArray4[2] = 725;
      intArray4[3] = 725;
      intArray4[4] = 0;
      intArray4[5] = 725;
      intArray4[6] = 725;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[2];
      intArray5[0] = 725;
      intArray5[1] = (-1242);
      intArray0[4] = intArray5;
      int int0 = KNAPSACK.knapsack(1239, intArray0);
      assertEquals(1964, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][] intArray0 = new int[0][5];
      KNAPSACK.knapsack(1798, intArray0);
      int[][] intArray1 = new int[2][5];
      int[] intArray2 = new int[3];
      intArray2[0] = 0;
      intArray2[1] = (-1);
      intArray2[2] = (-1);
      intArray1[0] = intArray2;
      int[] intArray3 = new int[2];
      intArray3[0] = (-1);
      intArray3[1] = 0;
      intArray1[1] = intArray3;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-1), intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[][] intArray0 = new int[1][6];
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-2614), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[][] intArray0 = new int[6][5];
      int[] intArray1 = new int[6];
      intArray1[0] = 2840;
      intArray1[1] = 2840;
      intArray1[2] = 2840;
      intArray1[3] = 2840;
      intArray1[4] = 2840;
      intArray1[5] = 2840;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[8];
      intArray2[0] = 2840;
      intArray2[1] = 2840;
      intArray2[2] = 2840;
      intArray2[3] = 2840;
      intArray2[4] = 2840;
      intArray2[5] = 2840;
      intArray2[6] = 2840;
      intArray2[7] = 2840;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[5];
      intArray3[0] = 2840;
      intArray3[1] = 2840;
      intArray3[2] = 2840;
      intArray3[3] = 2840;
      intArray3[4] = 2840;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[7];
      intArray4[0] = 2840;
      intArray4[1] = 2840;
      intArray4[2] = 2840;
      intArray4[3] = 2840;
      intArray4[4] = 2840;
      intArray4[5] = 2840;
      intArray4[6] = 2840;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[7];
      intArray5[0] = 2840;
      intArray5[1] = 2840;
      intArray5[2] = 2840;
      intArray5[3] = 2840;
      intArray5[4] = 2840;
      intArray5[5] = 2840;
      intArray5[6] = 2840;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[6];
      intArray6[0] = 2840;
      intArray6[1] = 2840;
      intArray6[2] = 2840;
      intArray6[3] = 2840;
      intArray6[4] = 2840;
      intArray6[5] = 2840;
      intArray0[5] = intArray6;
      // Undeclared exception!
      KNAPSACK.knapsack(2840, intArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
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
}

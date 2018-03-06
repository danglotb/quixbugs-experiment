/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 03:33:03 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java_programs.RPN_EVAL;

public class RPN_EVAL_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RPN_EVAL rPN_EVAL0 = new RPN_EVAL();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-1467));
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        RPN_EVAL.rpn_eval(arrayList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      // Undeclared exception!
      try { 
        RPN_EVAL.rpn_eval(arrayList0);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Double> arrayList0 = new ArrayList<Double>();
      Double double0 = new Double((-3484.89));
      arrayList0.add(double0);
      Double double1 = RPN_EVAL.rpn_eval(arrayList0);
      assertEquals((-3484.89), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        RPN_EVAL.rpn_eval((ArrayList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<Double> arrayList0 = new ArrayList<Double>();
      Double double0 = new Double(196.0772808972);
      arrayList0.add(double0);
      Double double1 = RPN_EVAL.rpn_eval(arrayList0);
      assertEquals(196.0772808972, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Double double0 = new Double((-469.6593401));
      arrayList0.add((Object) double0);
      Double double1 = new Double((-469.6593401));
      arrayList0.add((Object) double1);
      arrayList0.add((Object) "-");
      Double double2 = RPN_EVAL.rpn_eval(arrayList0);
      assertEquals(0.0, (double)double2, 0.01);
  }
}

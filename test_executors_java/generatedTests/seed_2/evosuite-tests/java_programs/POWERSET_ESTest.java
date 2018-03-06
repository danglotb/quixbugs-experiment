/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 02:39:34 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java_programs.POWERSET;

public class POWERSET_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      POWERSET pOWERSET0 = new POWERSET();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        POWERSET.powerset((ArrayList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      linkedList0.add((String) null);
      linkedList0.addFirst((String) null);
      arrayList0.add("");
      arrayList0.addAll((Collection<? extends String>) linkedList0);
      ArrayList<ArrayList> arrayList1 = (ArrayList<ArrayList>)POWERSET.powerset(arrayList0);
      // Undeclared exception!
      POWERSET.powerset(arrayList1);
  }
}

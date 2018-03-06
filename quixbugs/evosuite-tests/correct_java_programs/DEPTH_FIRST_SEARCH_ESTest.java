/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 14:00:47 GMT 2018
 */

package correct_java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import correct_java_programs.DEPTH_FIRST_SEARCH;
import java.util.ArrayList;
import java_programs.Node;

public class DEPTH_FIRST_SEARCH_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DEPTH_FIRST_SEARCH dEPTH_FIRST_SEARCH0 = new DEPTH_FIRST_SEARCH();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Node node0 = new Node("");
      boolean boolean0 = DEPTH_FIRST_SEARCH.depth_first_search(node0, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Node node0 = new Node("");
      ArrayList<Node> arrayList0 = node0.getPredecessors();
      Node node1 = new Node("", arrayList0);
      arrayList0.add(node1);
      boolean boolean0 = DEPTH_FIRST_SEARCH.depth_first_search(node1, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Node node0 = new Node();
      ArrayList<Node> arrayList0 = node0.getSuccessors();
      Node node1 = new Node();
      arrayList0.add(node1);
      boolean boolean0 = DEPTH_FIRST_SEARCH.depth_first_search(node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Node node0 = new Node("");
      Node node1 = new Node("", node0);
      // Undeclared exception!
      try { 
        DEPTH_FIRST_SEARCH.depth_first_search(node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 14:04:04 GMT 2018
 */

package correct_java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import correct_java_programs.DETECT_CYCLE;
import java_programs.Node;

public class DETECT_CYCLE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DETECT_CYCLE dETECT_CYCLE0 = new DETECT_CYCLE();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Node node0 = new Node();
      Node node1 = new Node("B7", node0);
      boolean boolean0 = DETECT_CYCLE.detect_cycle(node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Node node0 = new Node();
      boolean boolean0 = DETECT_CYCLE.detect_cycle(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Node node0 = new Node();
      Node node1 = new Node("", node0);
      node0.setSuccessor(node1);
      Node node2 = new Node("", node0);
      boolean boolean0 = DETECT_CYCLE.detect_cycle(node2);
      assertTrue(boolean0);
  }
}

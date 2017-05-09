/**************************
Laura Adams
5/9/2017

This file TestFibNum.java does 
some Junit tests for the code in ExtraCredit.java,
which has a function findFibNum() that 
computes the Fibonaci Sequence.
***************************/
package extraCredit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFibNum
{
  private ExtraCredit e;

  @Before
   public void setUp() throws Exception 
   {
      e = new ExtraCredit();
   }

  @Test
   public void testNumberEmpty() 
   {
      //This verifies if all the values are initallized and ready for use
      assertEquals(e.getFibNum(), 1);
      assertEquals(e.findFibNum(), 0);
   }

//testFibNum1(), testFibNum2(), and testFibNum3() test the 
   //functionallity of the findFibNum() function

   @Test
   public void testFibNum1()
   {
      //This tests the 2nd element in the Fibonacci sequence
      //0, 1
      e.setFibNum(2);
      assertEquals(e.getFibNum(), 2);
      assertEquals(e.findFibNum(), 1);
   }

   @Test
   public void testFibNum2()
   {
      //This tests the 5th element in the Fibonacci sequence
      //0, 1, 1, 2, 3
      e.setFibNum(5);
      assertEquals(e.getFibNum(), 5);
      assertEquals(e.findFibNum(), 3);
   }

   @Test
   public void testFibNum3()
   {
      //This tests the 8th element in the Fibonacci sequence
      //0, 1, 1, 2, 3, 5, 8, 13
      e.setFibNum(8);
      assertEquals(e.getFibNum(), 8);
      assertEquals(e.findFibNum(), 13);
   }

}

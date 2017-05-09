/**************************
Laura Adams
5/8/2017

This file TestExtraCredit.java does 
some Junit tests for the code in ExtraCredit.java,
which computes the square of a number,
a number after being raised to a different power,
and the fibonacci sequence.
***************************/
package extraCredit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestExtraCredit
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
      assertEquals(e.getNum(),1.0, 0);
      assertEquals(e.getPower(), 1.0, 0);
      assertEquals(e.getFibNum(), 1);
      assertEquals(e.findSquare(),1.0, 0);
      assertEquals(e.findPower(), 1.0, 0);
      assertEquals(e.findFibNum(), 0);
   }

//testSquare1(), testSquare2(), and testSquare3() test the 
   //functionallity of the findSquare() function

   @Test
   public void testSquare1()
   {
      //This tests if 3^2 = 9
      e.setNum(3.0);
      assertEquals(e.getNum(), 3.0, 0);
      assertEquals(e.findSquare(), 9.0, 0);
   }

   @Test
   public void testSquare2()
   {
      //This tests if 4^2 = 16
      e.setNum(4.0);
      assertEquals(e.getNum(), 4.0, 0);
      assertEquals(e.findSquare(), 16.0, 0);
   }

   @Test
   public void testSquare3()
   {
      //This tests if 5^2 = 25
      e.setNum(5.0);
      assertEquals(e.getNum(), 5.0, 0);
      assertEquals(e.findSquare(), 25.0, 0);
   }

//testPower1(), testPower2(), and testPower3() test the 
   //functionallity of the findPower() function

   @Test
   public void testPower1()
   {
      //This tests if 2^3 = 8
      e.setNum(2.0);
      assertEquals(e.getNum(), 2.0, 0);
      e.setPower(3.0);
      assertEquals(e.getPower(), 3.0, 0);
      assertEquals(e.findPower(), 8.0, 0);
   }

   @Test
   public void testPower2()
   {
      //This tests if 4^3 = 64
      e.setNum(4.0);
      assertEquals(e.getNum(), 4.0, 0);
      e.setPower(3.0);
      assertEquals(e.getPower(), 3.0, 0);
      assertEquals(e.findPower(), 64.0, 0);
   }

   @Test
   public void testPower3()
   {
      //This tests if 3^5 = 243
      e.setNum(3.0);
      assertEquals(e.getNum(), 3.0, 0);
      e.setPower(5.0);
      assertEquals(e.getPower(), 5.0, 0);
      assertEquals(e.findPower(), 243.0, 0);
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

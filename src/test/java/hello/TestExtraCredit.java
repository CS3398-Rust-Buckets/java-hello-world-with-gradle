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
      assertEquals(e.getNum(),1.0, 0);
      assertEquals(e.getPower(), 1.0, 0);
      assertEquals(e.getFibNum(), 1);
      assertEquals(e.findSquare(),1.0, 0);
      assertEquals(e.findPower(), 1.0, 0);
      assertEquals(e.findFibNum(), 0);
   }

   @Test
   public void testSquare()
   {
      e.setNum(3.0);
      assertEquals(e.getNum(), 3.0, 0);
      assertEquals(e.findSquare(), 9.0, 0);
   }

   @Test
   public void testPower()
   {
      e.setNum(2.0);
      assertEquals(e.getNum(), 2.0, 0);
      e.setPower(3.0);
      assertEquals(e.getPower(), 3.0, 0);
      assertEquals(e.findPower(), 8.0, 0);
   }

   @Test
   public void testFibNum1()
   {
      e.setFibNum(2);
      assertEquals(e.getFibNum(), 2);
      assertEquals(e.findFibNum(), 1);
   }

   @Test
   public void testFibNum2()
   {
      e.setFibNum(5);
      assertEquals(e.getFibNum(), 5);
      assertEquals(e.findFibNum(), 3);
   }

}

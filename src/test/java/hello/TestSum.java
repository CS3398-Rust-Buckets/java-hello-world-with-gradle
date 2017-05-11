package hello;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestSum {

   private Sum s;

	
   @Before
   public void setUp() throws Exception 
   {
      s = new Sum();
   }

   @Test
   public void testSumEmpty() 
   {
      assertEquals(s.getNum(),6);
      assertEquals(s.getNum2(),4);
  
   }
	
   @Test
   public void testSum() 
   {
      s.setNum(6);
      s.setNumb(4);
      s.setSum(6,4);
      assertEquals(s.getNum(),6);
      assertEquals(s.getNum2(),4);
      assertEquals(s.getSum(),10);
      assertEquals(s.sumTest(),"passed");

   }

   


}
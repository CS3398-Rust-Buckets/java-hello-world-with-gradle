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
      assertEquals(e.getNum(),1.0);
      assertEquals(e.getPower(), 1.0);
      assertEquals(e.findPower(),1.0);
   }

}

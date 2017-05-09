/**************************
Laura Adams
5/8/2017

This code calculates a number's square, 
a number raised to the power of another number, 
as well as the Fibonacci sequence.

The file TestExtraCredit.java does 
some Junit tests for this code.
***************************/
package extraCredit;
import java.lang.Math;

public class ExtraCredit {

  private double number = 1.0;
  private double power = 1.0;
  private int fibNum = 1;

  public double getNum()
  {
    return number;
  }

  public double getPower()
  {
    return power;
  }

  public int getFibNum()
  {
    return fibNum;
  }

  public void setNum(double newNumber)
  {
    this.number = newNumber;
  }

  public void setPower(double newPower)
  {
    this.power = newPower;
  }

  public void setFibNum(int newFibNum)
  {
    this.fibNum = newFibNum;
  }

  public double findSquare()
  {
    if (number == 1.0)
    {
      return 1.0;
    }
    else
    {
      return number*number;
    }
  }

  public double findPower()
  {
    if (number == 1.0)
    {
      return 1.0;
    }
    else
    {
      return Math.pow(number, power);
    }
  }

  public int findFibNum()
  {
    if(fibNum == 1)
      return 0;
    else if (fibNum == 2) 
    {
      return 1;
    }
    else
    {
      int [] nums = new int [fibNum];
      nums[0] = 0;
      nums[1] = 1;
      for(int i = 2; i<fibNum; i++)
      {
        nums[i] = nums[i-1] + nums[i-2];
      }
      return nums[fibNum-1];
    }
  }
}


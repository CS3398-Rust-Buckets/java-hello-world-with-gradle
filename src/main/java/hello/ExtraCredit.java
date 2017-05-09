package extraCredit;
import java.lang.Math;

public class ExtraCredit {

  private double number = 1.0;
  private double power = 1.0;

  public double getNum()
  {
    return number;
  }

  public double getPower()
  {
    return power;
  }

  public void setNum(double newNumber)
  {
    this.number = newNumber;
  }

  public void setPower(double newPower)
  {
    this.power = newPower;
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
}


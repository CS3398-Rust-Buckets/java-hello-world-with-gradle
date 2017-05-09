
/*****************************************************
hello package template:

package hello;

public class Greeter {

  private String name = "";

  public String getName() 
  {
    return name;
  }

  public void setName(String name) 
  {
      this.name = name;
  }
   
  public String sayHello() 
  {
    if (name == "") 
    {
       return "Hello!";
    }
    else 
    {
       return "Hello " + name + "!";
    }
  } 
}
***************************************************/

package extraCredit;
import java.lang.Math;

public class ExtraCredit {

  private double number = 1;
  private double power = 1;

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
    if (number == 1)
    {
      return 1;
    }
    else
    {
      double powerUp = 0;
      powerUp = pow(number,power);
      return powerUp;
    }
  }
}


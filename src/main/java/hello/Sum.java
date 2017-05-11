package hello;

public class Sum 
{

  private int num1 = 6;
  private int num2 = 4; 
  private int sum;
 

  public int getNum() 
  {

    return num1;
    
  }
  public int getNum2() 
  {

    return num2;
    
  }
 
  
  public void setNum(int num1) 
  {
      this.num1 = num1;
      //return num1;
      

  }

  public void setNumb(int num2) 
  {
      this.num2 = num2;
      //return num1;
      

  }
   

  public void setSum(int num1, int num2) 
  {
      sum= num1 + num2;
      this.sum = sum;
      //return num1;
      
 }
 public int getSum() 
  {

    return sum;
    
  }
 
  
  public String sumTest() 
  {
  	if (sum == 10) 
    {
       return "passed";
    }
    else 
    {
       return " Failed!";
    }
  }
}
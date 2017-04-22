package hello;

public class Greeter {

  private String name = "";
  private String test = "passed";

  public String getName() 
  {

    return name;
    
  }
  public String getTest() 
  {

    return test = test;
    
  }
  public void setName(String name) 
  {
      this.name = name;

  }
   
  public void setTest(String test) 
  {
      this.test = test;
      
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
  public String test2017() 
  {
  	if (test == test) 
    {
       return "Trey passed Dr.Lehrs Software Engineering course with an A!";
    }
    else 
    {
       return "Trey passed Dr.Lehrs Software Engineering course with an A " + test + "!";
    }
  }
}
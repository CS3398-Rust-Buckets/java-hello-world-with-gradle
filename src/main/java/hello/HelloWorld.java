package hello;


import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The non-current local time is: " + currentTime);
    
    Greeter greeter = new Greeter();
    Sum sum = new Sum();
    System.out.println(greeter.sayHello());
   // System.out.println(TestSum.testSum());
  } 
}

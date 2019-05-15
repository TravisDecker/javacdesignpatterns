package rsi.decker.travis;

public class  SingletonDemo {

  public static void main(String[] args) {
    SingletonExample instance = SingletonExample.getInstance();
    System.out.println(instance);


    SingletonExample anotherinstance = SingletonExample.getInstance();
    System.out.println(anotherinstance);


  }

}

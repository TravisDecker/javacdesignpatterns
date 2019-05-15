package rsi.decker.travis;

public class LunchOrderDemo {

  public static void main(String[] args) {

    LunchOrderBuilderExample.Builder builder = new LunchOrderBuilderExample.Builder();

    builder.bread("Wheat").condiments("Lettuce and tomatoes").dressing("Mayo").meat("HAM");

    LunchOrderBuilderExample lunchOder = builder.build();

    System.out.println(lunchOder.getBread());
    System.out.println(lunchOder.getCondiments());
    System.out.println(lunchOder.getDressing());
    System.out.println(lunchOder.getMeat());

  }


}

package rsi.decker.travis;

public class LunchOrderBuilderExample {

  //Builder class has all the same fields as the resulting class
  // so that they can be assigned.
  public static class Builder{
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    //Could also use constructors parameters to make the caller set fields as need.
    public Builder(){

    }

    public LunchOrderBuilderExample build(){
      return new LunchOrderBuilderExample(this);
    }

    public Builder bread(String bread){
      this.bread = bread;
      return this;
    }

    public Builder condiments(String condiments){
      this.condiments = condiments;
      return this;
    }

    public Builder dressing(String dressing){
      this.dressing = dressing;
      return this;
    }

    public Builder meat(String meat){
      this.meat = meat;
      return this;
    }

  }

  private final String bread;
  private final String condiments;
  private final String dressing;
  private final String meat;

  //Pass the builder object to get the values
  // once this class is constructed its immutable
  private LunchOrderBuilderExample(Builder builder){
    this.bread = builder.bread;
    this.condiments = builder.condiments;
    this.dressing = builder.dressing;
    this.meat = builder.meat;

  }

  public String getBread() {
    return bread;
  }

  public String getCondiments() {
    return condiments;
  }

  public String getDressing() {
    return dressing;
  }

  public String getMeat() {
    return meat;
  }
}

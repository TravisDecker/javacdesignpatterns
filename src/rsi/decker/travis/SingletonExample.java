package rsi.decker.travis;

public class SingletonExample {

  //instance set to null allows for lazy loading, See get instance method.
  // VOLATILE keyword ensures the JVM always treats this as a singleton.
  private static volatile SingletonExample instance = null;


  //Private constructor prevents instances being created with the NEW keyword.
  // The null check prevents the object from being instantiated through refection.
  private SingletonExample() {
    if (instance != null) {
      throw new RuntimeException("Use getInstance method to create");
    }
  }


  //Checks to see if an instance has already been created and returns the instance.
  // The check prevents unnecessary creation.. LAZY LOADING
  //synchronizing inside the check so that we only sync when creating a new object...
  // Also, the double check makes the whole creation thread safe
  public static SingletonExample getInstance() {
    if (instance == null) {
      synchronized (SingletonExample.class) {
        if (instance == null) {
          instance = new SingletonExample();
        }
      }
    }
    return instance;
  }


}

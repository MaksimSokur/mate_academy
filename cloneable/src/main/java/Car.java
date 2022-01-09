import java.util.Objects;

public class Car implements Cloneable{
  private Engine engine;
  private String wheels;
  private String carClass;
  private String mark;
  private String model;

   public Car() { //please don't remove this constructor!
  }


  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public Car clone() {
    try {
      Car clonedCar = (Car) super.clone();
      clonedCar.setEngine(engine.clone());
      return clonedCar;
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException("Can't clone this class(Car).", e);
    }
  }
  //write your code here
}

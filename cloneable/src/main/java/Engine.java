public class Engine implements Cloneable{
  public Engine() { //please don't remove this constructor!
  }
  private String maxPower;
  private String cylinder;
  private String markOfEngine;
  private String versionEngine;
  private String weightOfEngine;

  @Override
  public Engine clone() {
    try {
      return (Engine) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException("Can't clone engine");
    }
  }

//write your code here
}

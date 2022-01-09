import java.util.Objects;

public class Rectangle {
  private Integer width;
  private Integer length;
  private String color;

  public Rectangle(Integer width, Integer length, String color) {
    this.width = width;
    this.length = length;
    this.color = color;
  }

  public Integer getWidth() {
    return width;
  }

  public Integer getLength() {
    return length;
  }

  public String getColor() {
    return color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    } else if (!(o instanceof Rectangle)) {
      return false;
    } else {
      Rectangle rectangle = (Rectangle) o;
      return  this == rectangle && (this.getWidth() == rectangle.getWidth() || this.getWidth() != null && this.getWidth().equals(rectangle.getWidth()))
              && (this.getLength() == rectangle.getLength() || this.getLength() != null && this.getLength().equals(rectangle.getLength()))
              && (this.getColor() == rectangle.getColor() || this.getColor() != null && this.getColor().equals(rectangle.getColor()));
    }
  }

  @Override
  public int hashCode() {
    int result = 5;
    result = 7 * result + (getLength() == null ? 0 : getLength().hashCode());
    result = 7 * result + (getWidth() == null ? 0 : getWidth().hashCode());
    result = 7 * result + (getColor() == null ? 0 : getColor().hashCode());
    return result;
  }
}

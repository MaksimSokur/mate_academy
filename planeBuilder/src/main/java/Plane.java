public class Plane {
  //write your code below this line
  private String model;
  private String company;
  private int speed;
  private int weight;
  private int numberOfPassengers;

  private Plane(PlaneBuilder builder) {
     this.model = builder.model;
     this.company = builder.company;
     this.speed = builder.speed;
     this.weight = builder.weight;
     this.numberOfPassengers = builder.numberOfPassengers;
  }

  public static class PlaneBuilder {
      private String model;
      private String company;
      private int speed;
      private int weight;
      private int numberOfPassengers;

      public PlaneBuilder setModel(String model) {
          this.model = model;
          return this;
      }

      public PlaneBuilder setCompany(String company) {
          this.company = company;
          return this;
      }

      public PlaneBuilder setSpeed(int speed) {
          this.speed = speed;
          return this;
      }

      public PlaneBuilder setWeight(int weight) {
          this.weight = weight;
          return this;
      }

      public PlaneBuilder setNumberOfPassengers(int numberOfPassengers) {
          this.numberOfPassengers = numberOfPassengers;
          return this;
      }

      public Plane build()  {
          return new Plane( this);
      }
  }
}

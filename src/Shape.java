public abstract class Shape {
    public double area(){
        return 0.0;
    }

}
class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
  @Override
    public double area(){
      return Math.PI * radius * radius;
  }
}
  class Rectangle extends  Shape {
     private double width ;
     private double heidth ;

      public Rectangle(double width, double heidth) {
          this.width = width;
          this.heidth = heidth;
      }

      @Override
      public double area() {
          return Math.sqrt(width * heidth);
      }

      static class Square extends Shape{
          private  double koren;
          public Square(double koren) {
              this.koren = koren;
          }

              @Override
              public double area () {
                  return Math.sqrt(koren * koren);
              }

      }
    }


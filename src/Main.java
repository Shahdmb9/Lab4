//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Circle circle=new Circle(3);
    System.out.println("====Testing Circle====");
    System.out.println("the area of circle of radius:"+circle.getRadius()+" is");
    System.out.printf("%.2f",circle.calculateArea());
    System.out.println("\nthe Circumference of circle of radius:"+circle.getRadius());
    System.out.printf("%.2f",circle.calculateCircumference());
    Circle circle2=new Circle();
    circle2.setRadius(4);
    System.out.printf("\nradius of circle 2 after setting the value:"+circle2.getRadius());

    System.out.println("\n\n====Testing Rectangle====");
    Rectangle rectangle=new Rectangle(2,6);
    System.out.println("the area of rectangle of height:"+rectangle.getHeight()+" and width:"+rectangle.getWidth());
    System.out.println(rectangle.calculateArea());
    System.out.println("the perimeter of height:"+rectangle.getHeight()+" and width:"+rectangle.getWidth());
    System.out.println(rectangle.calculateCircumference());
    Rectangle rectangle2=new Rectangle();
    rectangle2.setHeight(3);
    rectangle2.setWidth(4);
    System.out.printf("The height and the width of rectangle 2 after setting the value of both\nHeight:"+rectangle2.getHeight()+"\n" +
            "width:"+rectangle2.getWidth());

    System.out.println("\n====Testing Triangle====");
    Triangle triangle=new Triangle(5,5);
    System.out.println("the area of triangle of height:"+triangle.getHeight()+" and base:"+triangle.getBase());
    System.out.println(triangle.calculateArea());
    System.out.println("the perimeter of height:"+triangle.getHeight()+" and base:"+triangle.getBase());
    System.out.println(triangle.calculateCircumference());
    Triangle triangle2=new Triangle();
    triangle2.setHeight(8);
    triangle2.setBase(8);
    System.out.printf("The height and the base of triangle 2 after setting the value of both\nHeight:"+triangle2.getHeight()+"\n" +
            "base:"+triangle2.getBase());



}

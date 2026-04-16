//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Circle circle=new Circle(3);
    System.out.println("====Testing Circle====");
    System.out.println("the area of circle of radius 3 is");
    System.out.printf("%.2f",circle.calculateArea());
    System.out.println("\nthe Circumference of circle of radius 3");
    System.out.printf("%.2f",circle.calculateCircumference());

    System.out.println("\n\n====Testing Rectangle====");
    Rectangle rectangle=new Rectangle(2,6);
    System.out.println("the area of rectangle of height:"+rectangle.getHeight()+" and width:"+rectangle.getWidth());
    System.out.println(rectangle.calculateArea());
    System.out.println("the perimeter of height:"+rectangle.getHeight()+" and width:"+rectangle.getWidth());
    System.out.println(rectangle.calculateCircumference());

    System.out.println("\n====Testing Triangle====");
    Triangle triangle=new Triangle(5,5);
    System.out.println("the area of rectangle of height:"+triangle.getHeight()+" and base:"+triangle.getBase());
    System.out.println(triangle.calculateArea());
    System.out.println("the perimeter of height:"+triangle.getHeight()+" and base:"+triangle.getBase());
    System.out.println(triangle.calculateCircumference());



}

public class Problem9_1 {
  public static void main(String[] args){
    Rectangle rectangle1 = new Rectangle(4,40); //Rectangle1 is defined with width of 4 and height of 40
    Rectangle rectangle2 = new Rectangle(3.5 , 35.9); //Rectangle2 is defined with width of 3.5 and height of 35.9
    
	System.out.println("Rectangle 1:");
	System.out.println("Width: 4"); //width of rectangle 1
    System.out.println("Height: 40"); //height of rectangle 1
    System.out.println("Area: " + rectangle1.getArea()); //Area of rectangle 1
    System.out.println("Perimeter: " + rectangle1.getPerimeter()); //Perimeter of rectangle 1
	
	System.out.println("------------------------------------"); //Line break to differentiate between the two rectangles
	
	System.out.println("Rectangle 2:");
    System.out.println( "Width: 3.5"); //Width of rectangle 2
    System.out.println( "Height: 35.9"); //Height of rectangle 2
    System.out.println( "Area: " + rectangle2.getArea()); //Area of rectangle 2
    System.out.println( "Perimeter: " + rectangle2.getPerimeter()); //Perimeter of rectangle 2

    }
}

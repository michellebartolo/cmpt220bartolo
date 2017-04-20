class Rectangle {

  double height = 1.0; //The height of this rectangle 
  double width = 1.0; //the width of this rectangle

  /** Construct a rectangle object */
  Rectangle(){
  }
  
  //construct a rectangle object
  Rectangle(double newWidth, double newHeight) {
    width = newWidth;
	height = newHeight;
  }

  /** Return the area of this circle */
  double getArea() {
    return height * width;
  }

  /** Return the perimeter of this circle */
  double getPerimeter() {
    return (2 * height) + (2 * width);
  }
 
}
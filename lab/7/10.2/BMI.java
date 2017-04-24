/*10.2 (The BMI class) Add the following new constructor in the BMI class:
 * /Construct a BMI with the specified name, age, weight,
 * feet, and inches/
 *
 * public BMI(String name, int age, double weight, double feet,
 *double inches) 
 */
 
public class BMI {
  private String name;
  private int age;
  private double weight; // in pounds
  private double feet; 
  private double inches;
  public static final double KILOGRAMS_PER_POUND = 0.45359237;
  public static final double METER_PER_FOOT = 0.3048;
  public static final double METER_PER_INCH = .0254;

  public BMI(String name, int age, double weight, double feet, double inches) {
    this.name = name;
	this.age = age;
    this.weight = weight;
    this.feet = feet;
	this.inches = inches;
  }

  public BMI(String name, double weight, double feet, double inches) {
    this(name, 20, weight, feet, inches);
  }

  public double getBMI() {
  double bmi = (weight * KILOGRAMS_PER_POUND) / (((feet * METER_PER_FOOT) + (inches * (METER_PER_INCH)))
      * ((feet * METER_PER_FOOT) + (inches * (METER_PER_INCH))));
    return Math.round(bmi * 100) / 100.0;
  }
 
  public String getStatus() {
  double bmi = getBMI();
  if (bmi < 18.5)
    return "Underweight";
  else if (bmi < 25)
    return "Normal";
  else if (bmi < 30)
    return "Overweight";
  else
    return "Obese";
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  } 

  public double getWeight() {
    return weight;
  }

  public double getFeet() {
  return feet;
  }
  
  public double getInches() {
  return inches;
  }
}
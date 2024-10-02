/**
 * Author: Aubrie McIntyre
 * Date: 10/2/2024
 * Description: Should display the details of a triangle.
 */
public class Asg1 {

    public static void main(String[] args) {
        
        // creates a Triangle object with sides 1, 1.5, 1,
        Triangle my = new Triangle(1, 1.5, 1);
        // sets color yellow and filled true
        my.setColor("yellow");
        my.setFilled(true);
        // displays the area, perimeter, color, and whether filled or not
        System.out.println("Triangle area: " + my.getArea());
        System.out.println("Triangle perimeter: " + my.getPerimeter());
        System.out.println("Triangle color: " + my.getColor());
        System.out.println("Triangle filled? " + my.isFilled());
        System.out.println(my);
    }

}
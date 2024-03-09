import java.util.Scanner;

public class Quadratic_Function {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");
        System.out.print("Enter the 'a':");
        double a = input.nextDouble();
        System.out.print("Enter the 'b':");
        double b = input.nextDouble();
        System.out.print("Enter the 'c':");
        double c = input.nextDouble();

        double discriminant = b*b -4*a*c;

        if(discriminant>0){
            double root1=(-b + Math.sqrt(discriminant))/(2*a);
            double root2=(-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("The Roots are real and different.");
            System.out.println("Root 1 is: "+root1);
            System.out.println("Root 2 is: "+root2);
        }
        else if(discriminant==0){
            double root =-b / (2*a);
            System.out.println("Roots are real and same");
            System.out.println("The root is: "+root);
        }else{
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}

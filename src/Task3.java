package src;

public class Task3 {
    public static double mathTask(double x, double y) {



        double firstExp = Math.pow(x, 2);
        double secondExp = Math.pow((4 * y / 5) - x, 2);
        return firstExp + secondExp;

    }

    public static void main(String[] args) {

        double x = 3.0;
        double y = 7;
        double result = mathTask(x, y);
        System.out.println("Result is : " + result);



    }




//public class MathExpression {
//
//    public static double calculateExpression(double x, double y) {
//        double firstTerm = Math.pow(x, 2); // x^2
//        double secondTerm = Math.pow((4 * y / 5) - x, 2); // (4y/5 - x)^2
//        return firstTerm + secondTerm;
//    }
//
//    public static void main(String[] args) {
//        double x = 3.0; // example value for x
//        double y = 4.0; // example value for y
//        double result = calculateExpression(x, y);
//        System.out.println("The result of the expression is: " + result);
//    }
//}

    }


package calculator;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInput = new Scanner(System.in);
        double number1, number2;
        int number;
        while(true){
            System.out.println("Scientific Calculator-DevOps, Choose operation");
            System.out.print("Press 1 to Find Square Root\n" +
                                "Press 2 for Find Factorial\n" +
                                "Press 3 for Natural Logarithm(Base e)\n" +
                                "Press 4 for Power Function \n" +
                                "Press any other key to exit\n" +
                                "Enter your choice: ");
            int choice;
            try {

                choice = scanner.nextInt();
            } catch (InputMismatchException error) {

                logger.error("Invalid input for Choice");
                return;
            }
            switch (choice) {
                case 1:
                    // do Square Root
                    try {
                        System.out.print("Enter number : ");
                        number1 = scannerInput.nextDouble();
                        calculator.squareRoot(number1);

                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                    }
                    break;
                case 2:
                    // do Factorial

                    try {
                        System.out.print("Enter number : ");
                        number = scannerInput.nextInt();
                        calculator.factorial(number);

                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a Integer");
                    }
                    break;

                case 3:
                    // do Natural Log
                    try {
                        System.out.print("Enter number : ");
                        number1 = scannerInput.nextDouble();
                        calculator.naturalLog(number1);

                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                    }

                    break;
                case 4:
                    // do Power function
                    try {
                        System.out.print("Enter First number : ");
                        number1 = scannerInput.nextDouble();
                        System.out.print("Enter Second number : ");
                        number2 = scannerInput.nextDouble();
                        calculator.power(number1,number2);

                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                    }

                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        }

    }
    public double power(double number1, double number2){

            logger.info("[Power] - " + number1+" to power "+number2 );
            double result = Math.pow(number1,number2);
            logger.info("[RESULT - POWER] - " + result);
            System.out.println("Power of : " + number1 + " to power "+ number2  +" = "+result);
            return result;

    }
    public double naturalLog(double number1){

            logger.info("[NATURAL LOG ] - " + number1 );
            double result = Math.log(number1);
            logger.info("[RESULT - NATURAL LOG] - " + result);
            System.out.println("Natural log of : " + number1 + " = " +result);
            return result;

    }
    public long factorial(int number1){

            logger.info("[FACTORIAL] - " + number1 );
            long result = CombinatoricsUtils.factorial(number1);
            logger.info("[RESULT - FACTORIAL] - " + result);
            System.out.println("Factorial of : " + number1 + " is " +result);
            return result;
    }
    public double squareRoot(double number1){
            logger.info("[SQAURE ROOT] - " + number1 );
            double result = Math.sqrt(number1);
            logger.info("[RESULT - SQUARE ROOT] - " + result);
            System.out.println("Square root of : " + number1 + " = " +result);
            return result;
    }
}

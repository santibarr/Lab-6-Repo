import java.util.Scanner;
public class SciCalculator {
    public static void main(String[] args) {

        //creates the scanner for user input
        Scanner scnr = new Scanner(System.in);

        //declaring and initializing the variables
        String operand1 = "";
        String operand2 = "";
        double operand1Double = 0;
        double operand2Double = 0;
        double result = 0.0;
        double sumValue = 0.0;


        // it starts then changes depending on the case
        int input = 1;

        int count = 0;



        while(count >= 0){


            //print the menu only when you start and when it is 1 - 6.

            if(input > 0 && input < 7) {

                //print the current result
                System.out.print("\n");
                System.out.println("Current Result: " + result);
                System.out.print("\n");

                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.print("\n");
            }


            //ask for user input
            System.out.print("Enter Menu Selection: ");

            input = scnr.nextInt();

            System.out.print("\n");




            switch(input){

                //Exit program
                case 0:

                        System.out.println("Thanks for using this calculator. Goodbye!");
                        count = -1;

                        break;

                //addition
                case 1:

                    System.out.print("Enter first operand: ");
                    operand1 = scnr.next();
                    if(operand1.equals("RESULT")){

                        operand1Double = result;
                    }

                    else{

                        operand1Double = Double.parseDouble(operand1);

                    }
                    System.out.print("Enter second operand: ");
                    operand2 = scnr.next();
                    if(operand2.equals("RESULT")){

                        operand2Double = result;
                    }

                    else{

                        operand2Double = Double.parseDouble(operand2);

                    }


                    result = operand1Double + operand2Double;

                    sumValue += result;

                    count++;

                    break;

                //subtraction
                case 2:

                    System.out.print("Enter first operand: ");
                    operand1 = scnr.next();

                    if(operand1.equals("RESULT")){

                        operand1Double = result;
                    }

                    else{

                        operand1Double = Double.parseDouble(operand1);

                    }

                    System.out.print("Enter second operand: ");
                    operand2 = scnr.next();

                    if(operand2.equals("RESULT")){

                        operand2Double = result;
                    }

                    else{

                        operand2Double = Double.parseDouble(operand2);

                    }

                    result = operand1Double - operand2Double;

                    sumValue += result;

                    count++;

                    break;

                //Multiplication
                case 3:

                    System.out.print("Enter first operand: ");
                    operand1 = scnr.next();

                    if(operand1.equals("RESULT")){

                        operand1Double = result;
                    }

                    else{

                        operand1Double = Double.parseDouble(operand1);

                    }

                    System.out.print("Enter second operand: ");
                    operand2 = scnr.next();

                    if(operand2.equals("RESULT")){

                        operand2Double = result;
                    }

                    else{

                        operand2Double = Double.parseDouble(operand2);

                    }

                    result = operand1Double * operand2Double;

                    sumValue += result;

                    count++;

                    break;

                //Division
                case 4:

                    System.out.print("Enter first operand: ");
                    operand1 = scnr.next();

                    if(operand1.equals("RESULT")){

                        operand1Double = result;
                    }

                    else{

                        operand1Double = Double.parseDouble(operand1);

                    }

                    System.out.print("Enter second operand: ");
                    operand2 = scnr.next();

                    if(operand2.equals("RESULT")){

                        operand2Double = result;
                    }

                    else{

                        operand2Double = Double.parseDouble(operand2);

                    }

                    result = operand1Double / operand2Double;

                    sumValue += result;

                    count++;

                    break;

                //exponential
                case 5:

                    System.out.print("Enter first operand: ");
                    operand1 = scnr.next();

                    if(operand1.equals("RESULT")){

                        operand1Double = result;
                    }

                    else{

                        operand1Double = Double.parseDouble(operand1);

                    }

                    System.out.print("Enter second operand: ");
                    operand2 = scnr.next();

                    if(operand2.equals("RESULT")){

                        operand2Double = result;
                    }

                    else{

                        operand2Double = Double.parseDouble(operand2);

                    }

                    result = Math.pow(operand1Double, operand2Double);

                    sumValue += result;

                    count++;

                    break;

                //logarithm
                case 6:

                    System.out.print("Enter first operand: ");
                    operand1 = scnr.next();

                    if(operand1.equals("RESULT")){

                        operand1Double = result;
                    }

                    else{

                        operand1Double = Double.parseDouble(operand1);

                    }

                    System.out.print("Enter second operand: ");
                    operand2 = scnr.next();

                    if(operand2.equals("RESULT")){

                        operand2Double = result;
                    }

                    else{

                        operand2Double = Double.parseDouble(operand2);

                    }

                    result = Math.log(operand2Double) / Math.log(operand1Double);

                    sumValue += result;

                    count++;

                    break;

                //Average values
                case 7:

                    //when the user wants to average, this if statement won't allow it
                    if( result == 0.0 && input == 7){

                        System.out.println("Error: No calculations yet to average!");


                        break;
                    }

                    System.out.print("Sum of calculations: ");
                    System.out.printf("%.2f",sumValue);
                    System.out.print("\n");
                    System.out.println("Number of calculations: " + count);
                    System.out.print("Average of calculations: ");
                    System.out.printf("%.2f",(sumValue/count));
                    System.out.print("\n");

                    break;
                    
                default:

                        System.out.println("Error: Invalid selection!");

                    break;

            }
        }
    }
}

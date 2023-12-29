import java.util.Scanner; // to input output from keyboard

public class JavaTutorial {

        static int sum(int x, int y) {
                return x + y;
        }

        public static void main(String[] args) {
                System.out.println("hello world");

                // Variable, datatype and operator
                String name = "vikash";
                int num = 23;

                // Display multiple variables using concatenation
                System.out.println("String var " + name + " " + "Number var " + num);

                System.out.println(num++); // post-increment
                System.out.println(++num); // pre-increment
                System.out.println(num--); // post-decrement
                System.out.println(--num); // pre-decrement

                // Taking user input
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter age");
                int input = scan.nextInt();
                System.out.println("Entered input is " + input);
                scan.close();

                // String method
                String str = "sanu";
                String channelStr = " sixpack";

                System.out.println(str.length());
                System.out.println(str.toUpperCase());
                System.out.println(str.toLowerCase());
                System.out.println(str.contains("sa"));
                System.out.println(str.charAt(2));

                // Output formatting by special character
                System.out.println(str + " from\" " + channelStr);
                System.out.println(str + " from\\ " + channelStr);
                System.out.println(str + " from\t " + channelStr);
                System.out.println(str + " from\n " + channelStr);

                // Math class
                int a = 3, b = 5;
                System.out.println(Math.max(a, b));
                System.out.println(Math.min(a, b));
                System.out.println(Math.sqrt(36));
                System.out.println(Math.abs(-7));
                System.out.println(Math.random());

                // Conditional statement - if, else if, else
                Scanner scanner = new Scanner(System.in);
                int age;

                System.out.println("enter your age");
                age = scanner.nextInt();
                scanner.close();
                if (age > 20) {
                        System.out.println("you are an adult");
                } else if (age > 5) {
                        System.out.println("you are not kid");
                } else {
                        System.out.println("you are kid");
                }

                // Switch statement
                switch (age) {
                        case 12:
                                System.out.println("you are 12 year old");
                                break;
                        case 56:
                                System.out.println("you are 56 year old");
                                break;
                        case 16:
                                System.out.println("you are 16 year old");
                                break;
                        default:
                                System.out.println("you did not match any of the case");
                }

                /*
                 * Looping Statements
                 * for Loop
                 * while Loop
                 * do-while Loop
                 * for each Loop
                 */

                for (int i = 0; i < 10; i++) {
                        System.out.println(i);
                }

                String[] days = { "Monday", "Tuesday", "Wed", "Thus" };
                for (String day : days) {
                        System.out.println(day);
                }

                // Arrays
                int[] numbers = new int[5]; // Integer array with 5 elements
                String[] colors = { "Red", "Green", "Blue" }; // String array with initial values

                colors[1] = "34"; // Update value of colors[1]
                System.out.println(colors[1]);
                System.out.println(colors[3]);

                for (String value : colors) {
                        System.out.println(value);
                }

                // Multidimensional array
                int[][] matrix = { { 1, 2, 4 }, { 4, 7, 9 } };
                System.out.println(matrix[0][1]);
                String[] cars = { "vikash", "maruti", "suzuki" };
                for (String value : cars) {
                        System.out.println(value);
                }

                // try and catch in java
                String[] car = { "vikash", "maruti", "suzuki" };
                System.out.println(car[4]);
                try {
                        System.out.println(car[4]);
                } catch (Exception e) {
                        System.out.println(e);
                }
                System.out.println("masala");
                // method calling
                // int a= 5;
                // int b= 7;
                // System.out.println(sum(a,b));

                // mini project_calculator

                // float num_1, num_2;
                //
                // System.out.println("enter first num");
                //// Scanner scan1= new Scanner(System.in);
                // num_1 = scan.nextFloat();
                //
                // System.out.println("enter second num");
                //// Scanner scan2= new Scanner(System.in);
                // num_2 = scan.nextFloat();
                //
                // System.out.print("you have entered ");
                // System.out.print(num_1);
                // System.out.print(" and ");
                // System.out.println(num_2);
                //
                // String prompt = "enter 0 for addition,1 for substraction, 2 for multi, 3 for
                // division";
                // System.out.println(prompt);
                // int input = scan.nextInt();
                // switch (input) {
                // case 0:
                // System.out.println("addition");
                // System.out.println(num_1 + num_2);
                // break;
                // case 1:
                // System.out.println("substraction");
                // System.out.println(num_1 - num_2);
                // break;
                // case 2:
                // System.out.println("multi");
                // System.out.println(num_1 * num_2);
                // break;
                // case 3:
                // System.out.println("division");
                // System.out.println(num_1 / num_2);
                // break;
                // default:
                // System.out.println("invalid input");
                //
                // }
        }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

// Making an Object
        NameOfClass object1Name = new NameOfClass(false,"testText", 12345, 1.23); // Parameterized Constructor used
        NameOfClass object2Name = new NameOfClass(); // Parameterless Constructor used

// Calling a method
        object1Name.methodName();
        object1Name.alsoMethodName();
                                                                                        System.out.println(" ");    // Making an empty line
// Using our printValuesMethod to see values of our attributes.
        object1Name.printValuesMethod();
                                                                                        System.out.println(" ");    // Making an empty line

// Using our setter.
        object2Name.setNumber(51);

// Using our getter.
        System.out.println(object2Name.getNumber());
                                                                                        System.out.println(" ");    // Making an empty line

// Using user inputs in object.
        Scanner in = new Scanner(System.in); // Make a scanner, so we can ask user-inputs.

        System.out.println("Is it true or false: ");
        boolean isItOn2;
        String usedForBoolean;
        usedForBoolean = in.nextLine();

        if(usedForBoolean.equalsIgnoreCase("true")){
            isItOn2 = true;
        } else {
            isItOn2 = false;
        }
        
        System.out.println("Give me a text: ");
        String text2 = in.nextLine(); // Set userinput for String type

        System.out.println("Give me a number: ");
        int number2 = Integer.parseInt(in.nextLine()); // Set userinput for int type.

        System.out.println("Give me a decimal: ");
        double decimal2 = Double.parseDouble(in.nextLine()); // Set userinput for double type.

        NameOfClass object3Name = new NameOfClass(isItOn2, text2, number2,decimal2); // New object, that we give values through user inputs.

                                                                                        System.out.println(" ");    // Making an empty line
        object3Name.printValuesMethod(); // Print the inputs user has given.
    } // Main end
} // App End

// Making a class.
    // 1. We declare that it is a class...thats it.
    // 2. We give our class a Name & Finnish it with {}.
class NameOfClass {

// We define attributes, we wish our object to have. *By default they should be private*
        private boolean isItOn;
        private String text;
        private int number;
        private double decimal;

// Constructors / Muodostin
        // Few rules:
        // > Constructors dont return anything so no void/String/int.etc.
        // > Constructor has to have same name as the Class its part of.

    // Parameterized Construtor / Täysiparametrinen muodostin
        public NameOfClass(boolean iio, String t, int n, double d) {
            isItOn = iio;
            text = t;
            number = n;
            decimal = d;
        }

    // Parameterless COnstructor / Parametritön muodostin ("Oletusmuodostin")
        public NameOfClass(){
            isItOn = false;
            text = "";
            number = 0;
            decimal = 0.00;
        }


// Making a method
    // 1. First declare is it Public or Private.
    // 2. Then we can declare what it returns. If we return nothing we use void.
    // 3. Then last we have method name that ends with. ()
        /*1.*/public /*2.*/ void /*3.*/ methodName(){ // Boolean false method
            isItOn = false;
            System.out.println("We make this false. What ever it is.");
        }

        public void alsoMethodName(){ // Boolean true method
            isItOn = true;
            System.out.println("We make this true. Still dont know what it is.");
        }

        public void printValuesMethod(){ // Method that prints Values.
            System.out.println("***Values of Attributes***");
            System.out.println("Value of String type: " + text);
            System.out.println("Value of int type: " + number);
            System.out.println("Value of decimal type: " + decimal);
            if(isItOn){
                System.out.println("Value of isItOn is: " + isItOn);
            } else {
                System.out.println("Value of isItOn is: " + isItOn);
            }
            testPrivate();
        }

        private void testPrivate(){ // Private method, which we cant call in main. We call it in printValuesMethod().
            System.out.println("This is a test of privacy.");
        }

// Making a Setter method (It assigns a value for a private attribute.)
        public void setNumber(int number){
            if(number > 0 && number <= 100){           // This is not mandatory, we just check that the value set is between 0 and 100.
            this.number = number; // **!!THIS IS THE SETTER PART!!**
            } else {
                System.out.println("ERROR");
            }
        }

// Making a Getter method (It reads a value of a private attribute.)
        public int getNumber(){
            return number;
        }

// ACCESS MODIFIERS WE USE: PUBLIC OR PRIVATE. (There is protected & Default.)
// Public can be accessed from other classes.
// Private can only be used inside the class.






} // Your class ends here.

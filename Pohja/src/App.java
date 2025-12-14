import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

// Making an Object
        NameOfClass object1Name = new NameOfClass(false,"testText", 12345, 1.23); // Parameterized Constructor used
        NameOfClass object2Name = new NameOfClass(); // Parameterless Constructor used

// Calling a method
        object1Name.methodName();
        object1Name.alsoMethodName();

// Using our printValuesMethod to see values of our attributes.
        object1Name.printValuesMethod();

// Using our setter.
        object2Name.setNumber(51);

// Using our getter.
        System.out.println(object2Name.getNumber());

// Using user inputs in object.
        Scanner in = new Scanner(System.in); // Make a scanner, so we can ask user-inputs.

        System.out.println("Is it true or false: ");
        boolean isItOn2;
        String usedForBoolean; // Needed for boolean userinputs.
        usedForBoolean = in.nextLine(); // Sets our string as true/false.

        if(usedForBoolean.equalsIgnoreCase("true")){ // We check the user input.
            isItOn2 = true; // We set it to true.
        } else {
            isItOn2 = false; // We set it to false.
        }
        
        System.out.println("Give me a text: ");
        String text2 = in.nextLine(); // Set userinput for String type.

        System.out.println("Give me a number: ");
        int number2 = Integer.parseInt(in.nextLine()); // Set userinput for int type.

        System.out.println("Give me a decimal: ");
        double decimal2 = Double.parseDouble(in.nextLine()); // Set userinput for double type.

        NameOfClass object3Name = new NameOfClass(isItOn2, text2, number2,decimal2); // New object, that we give values through user inputs.

                                                                                        System.out.println(" ");    // Making an empty line
        object3Name.printValuesMethod(); // Print the inputs user has given.


// Sub-class 1 /Inheritance
        NameOfSubclass1 o1SC1 = new NameOfSubclass1(); // Object created for subclass 1.

        o1SC1.subclassTest(); // We can print date even if the subclass is empty.

// Sub-class 2 / Override
        NameOfSubclass2 o1SC2 = new NameOfSubclass2();

        o1SC2.subclassTest(); // We test override.


// Static Members
        StaticTest o1ST1 = new StaticTest("STekti", 404.404); // Adds 1 to count
        StaticTest o1ST2 = new StaticTest("Test", 127.001); // Adds 2 to count
        
        o1ST1.printSTData();

        StaticTest.printCount(); // We need to call static-method with the class, instead of object.

// Abstract class
        AbstractsSubClass asc1 = new AbstractsSubClass(3, 5);
        asc1.calculateArea();
        asc1.printArea();

// Interface
        Square s1 = new Square(5);
        s1.calcArea();
        s1.printArea();


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

    // Parameterless Constructor / Parametritön muodostin ("Oletusmuodostin")
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
            return number; // When we return data, we should always use it. Suchs as System.out.println(getNumber());
        }

        public void subclassTest(){ // We test we can print this with subclass.
            System.out.println("TESTING TESTING WEEWOO");
        }
// This is how we can call from other class.
        public void testOtherClass(StaticTest callingFromOtherClass){

        }
} // Your NameOfCass ends here.

// ACCESS MODIFIERS WE USE: PUBLIC OR PRIVATE. (There is protected & Default.)
// Public can be accessed from other classes. (Main or Subclasses.)
// Private can only be used inside the class. (Only in the class it is in.)

// Making a sub-class (Inheritance) ((WE get attributes and methods.))
class NameOfSubclass1 extends NameOfClass{

}

// Second subclass with its own specific attributes.
class NameOfSubclass2 extends NameOfClass{

        @Override
        public void subclassTest(){ // Overrides the values in parent class method with same name.
            System.out.println("SUBCLASS OVERRIDE");
        }

}

// Static Members && Attributes.
    /*  - When to use static members:
            > If the value of an attribute needs to be the same for all objects of the class
            >You want to access a method without creating an object. In other words,
            there is no sense to create an object.
        - Static members can be accessed through the class (not the object)
        - Static method can only use static attributes. For example, if stString is NON-static
        static method printCount() can't access it.
        - Static attributes can be used in "normal", non-static methods. For example,
        we can print the values of stString (non-static) and staticCount (static)
        in a non-static method printSTData.*/
        
class StaticTest{
    private String stString;
    private double stDecimal;
    private static int staticCount; // This is a static attribute.

    // Parameterless Constructor / Parametritön muodostin ("Oletusmuodostin")
    public StaticTest(){
        stString = "";
        stDecimal = 0.0;
        staticCount++; // Adds a count everytime we make an object.
    }
    // Parameterized Construtor / Täysiparametrinen muodostin
    public StaticTest(String sS, double sN) 
    {
        stString = sS;
        stDecimal = sN;
        staticCount++; // Adds a count everytime we make an object.
    }

    public void printSTData(){
        System.out.println("STATIC CLASS TEST");
        System.out.println("");
        System.out.println(stString);
        System.out.println(stDecimal);
        System.out.println("Count: " + staticCount);
    }

    public static void printCount(){ // Static method.
        System.out.println("Count: " + staticCount);
    }

    public void callingFromOtherClass () { // We will call this method is our class NameOfClass
        
    }
}

// Abstract Class / Abstrakti luokka. We use subclasses to create methdos. !!Abstract class cant create objects!!
    // We use abstract calss to "Force" other programmer (and us) to keep method names the same. Which helps to keep code easier to understand.
abstract class AbstractClass{ // We define that the class is abstract.

    public double area;

    public abstract void calculateArea(); // Method will lose {}, because it cant have any "value".

    public void printArea(){
            System.out.println("Area is: " + area);
    }
}

class AbstractsSubClass extends AbstractClass{

    int l, w;

    public AbstractsSubClass(){ // Constructor / Muodostin
        l = 0;
        w = 0;
    }

    public AbstractsSubClass(int l, int w){ // Constructor / Muodostin
        this.l = l;
        this.w = w;
    }

    @Override // We use override when we use abstract subclasses. This removes margin of error.
    public void calculateArea() {
        area = l * w;
    }
}

// Interfaces can only have methods/Getter/Setters (Pretty close to abstract)
interface Shape{

    public double calcArea(); // This is an abstract method even if it does not show it.
    public void printArea();

}

class Square implements  Shape{ // Subclass but we use IMPLEMENTS instead of EXTENDS

    private double side; // Attribute
    
    public Square( int side) // Constructor
    {
        this.side = side;
    }

    @Override
    public double calcArea(){ // Inherited
        return side * side;
    }

    @Override
    public void printArea(){ // Inherited
        System.out.println(side*side);
    }
}

















/* COPY PASTE POHJA
***************KOPIOI TÄMÄ MAINIIN***************

NameOfClass1 object1Name = new NameOfClass1(false,"testText", 12345, 1.23); // Parameterized Constructor used
NameOfClass1 object2Name = new NameOfClass1(); // Parameterless Constructor used

***************KOPIOI TÄMÄ LUOKKAASI***************
class NameOfClass1 {

    // Attributes
        private boolean isItOn;
        private String text;
        private int number;
        private double decimal;


    // Parameterized Construtor / Täysiparametrinen muodostin
        public NameOfClass1(boolean iio, String t, int n, double d) {
            isItOn = iio;
            text = t;
            number = n;
            decimal = d;
        }

    // Parameterless Constructor / Parametritön muodostin ("Oletusmuodostin")
        public NameOfClass1(){
            isItOn = false;
            text = "";
            number = 0;
            decimal = 0.00;
        }

    // Method
        public void methodName(){

        }
        
    // Setter
        public void set-----(*TYPE* name){
            this.----- = name;
        }

    // Getter
        public int get----(){
            return -----;
        }
*/
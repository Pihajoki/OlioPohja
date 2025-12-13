public class App {
    public static void main(String[] args) throws Exception {

        // Making an Object
        NameOfClass object1Name = new NameOfClass(false,"testText", 12345, 1.23); // Parameterized Constructor used
        NameOfClass object2Name = new NameOfClass(); // Parameterless Constructor used

        // Calling a method
        object1Name.methodName();
        object1Name.alsoMethodName();

        // We can print these attributes same as other variables.
        System.out.println("This is attribute decimals value: " + object1Name.decimal);

        // Using our printValuesMethod to see values of our attributes.
        object1Name.printValuesMethod();

    }
} // App End

// Making a class.
    // 1. We declare that it is a class...thats it.
    // 2. We give our class a Name & Finnish it with {}.
class NameOfClass {

// We define attributes, we wish our object to have.
        boolean isItOn;
        String text;
        int number;
        double decimal;

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
        }











} // Your class ends here.

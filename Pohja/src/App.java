public class App {
    public static void main(String[] args) throws Exception {

        // Making an Object
        NameOfClass object1Name = new NameOfClass();

        // Giving attributes Values
        object1Name.text = "TestText.";
        object1Name.number = 12345;
        object1Name.decimal = 1.23;

        // Calling a method
        object1Name.methodName();
        object1Name.alsoMethodName();



    }
} // App Ends

class NameOfClass { // add class name here
    
        // We define attributes, we wish our object to have.
        boolean isItOn;
        String text;
        int number;
        double decimal;

        // 1. We make a method. First declare is it Public or Private.
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




    }

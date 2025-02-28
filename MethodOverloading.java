public class MethodOverloading {

    // Overloaded method to print an integer value
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Overloaded method to print a double value
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Overloaded method to print a string value
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }

    // Main method
    public static void main(String[] args) {
        // Test the overloaded methods
        printValue(10);           // Calls the int version
        printValue(3.14);         // Calls the double version
        printValue("Hello!");     // Calls the String version
    }
}
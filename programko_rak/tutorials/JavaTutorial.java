package programko_rak.tutorials;

/*
    CLASSES
    Classes are defined by the keyword "class".

    There has to be at least one "public class" in java file but how-many-you-want another classes.
 */
public class JavaTutorial {
    /*
        FIELDS (attr, attributes)
        Properties of each object.

        Class fields have the keyword "static" before their data types.
        Objects fields do not have the keyword "static".

        Objects should not change class field (they can do it!!) but class cannot access and modify object field.
     */
    static int countObjects;
    int idObject;
    String nameOfObject;

    /*
        METHODS
        Actions which an object can do.

        Before a name of method, there has to be defined what the method returns.
        If method does not return anything, there is the keyword "void".
        If method returns something, there is defined the data type and at the end of method (at each branch) has to be
        keyword "return" and a literal or a variable of the same data type.

        Class methods have the keyword "static" before their data types.
        Objects methods do not have the keyword "static".

        Objects cannot access methods belonging to class and class cannot access method belonging to objects.
     */
    void printInformation() {

        /*
            CONDITIONS

            First statement in condition has to start with "if" then you can create how-many-you-want of
            statements "else if" and only one "else" statement
         */
        System.out.println(nameOfObject);
        if (idObject == 0) {
            System.out.println("This is the first object");
        } else if (idObject <= 5) {
            System.out.println("There are less or exactly 5 objects created");
        } else {
            System.out.println("There are too many objects created D:");
        }


    }
    static int getCountObjects() {
        return countObjects;
    }

    public int getIdObject() {
        return idObject;
    }

    /*
            MAIN METHOD

            Can be accessed only by class (when you want to run outside this class, in another class etc., you will
            type Pes.main();).
         */
    public static void main(String[] args) {
        /*
            PRIMITIVE AND REFERENCE DATA TYPES

            "Almost" everything in java is object - reference data type except of 8 primitive data types.

            Primitive types are byte, short, int, long, float, double and char.
            The primitive types containing numbers (every except char) differ from numbers they can hold.
            For example the byte cannot store a number less than -128 or more than 127.
            Int, byte, short and long can contain whole numbers (integers), float and double can store decimals

            There are several reference types like String or Object, but you can create yours own too.

         */
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1L; // Notice there is a convention to use "L" at the end of this data type.
        float f = 1.1f; // Notice there has to be "f" at the end of this data type.
        double d = 1.1;
        char c = 'c'; // Notice there has to be this type of quotes. Double quotes are used for another data type.

        String str = "Hello world";
        Object obj = new int[8]; // Does not matter what this code does. You should only know that there is a data
        // type called Object.

        /*
            EXPLICIT AND IMPLICIT CASTING
            Because Java is strongly typed programming language you cannot store to integer variable a decimal number,
            but there is way to change it called casting.

            For example you can store short literal to long variable but you cannot store long literal to short
            variable.

            There is a line:

            byte -> short -> int -> long -> float -> double
                              ^
                              |
                             char

            You can store a value of one data type to the data type on the right of it.
            That's called implicit casting.
            For example:
                          short s = 1;
                          int i = s;

            Or:
                          long l = 1L;
                          double d = l;

           If you want to store a value of data type to the data type on the left of it, you have to add two
           enclosing parentheses containing the data type you want to store it

           For example:
                         int i = 1
                         short s = (short) i;

           Or:
                         double d = 1;
                         long l = (long) d;
         */

        short shor = 32;
        int in = shor;

        long lon = 234L;
        double doubl = lon;


        int in2 = 21;
        short shor2 = (short) in2;

        double doubl2 = 432.4;
        long lon2 = (long) doubl2;

        /*
            OBJECTS - INSTANCES
            It's the same, but they are used in different sentences (doesn't matter).
            "Almost" every class can create objects.

            Object is created like with the keyword "new" and name of a class followed by two enclosing parentheses.
            For example:
                         new Pes()

            You can store an object the same way storing literals.
            For example:
                         Pes rafan = new Pes();
                         Cat kote = new Cat();
                         Obdelnik abcd = new Obdelnik();

         */

        JavaTutorial jt = new JavaTutorial();
        JavaTutorial jt2 = new JavaTutorial();
        JavaTutorial jt3 = new JavaTutorial();

        /*
            QUALIFICATIONS
            Used when you want to change or work with some of object fields or class fields.

            First type object (or class to access class fields) then dot and then the field you want to work with.
            For example:
                         azor.breed = "jezevcik";
                         System.out.println(azor.name);
                         int x = azor.age + 1;

         */

        jt.nameOfObject = "First object";
        jt.idObject = 0;
        jt2.nameOfObject = "Second object";
        jt2.idObject = 1;
        jt3.nameOfObject = "Another object";
        jt3.idObject = 2;

        int numberOfObjects = JavaTutorial.countObjects;

        /*
            CALLING METHODS

            You do that the same way you can access and modify fields, but you have to add two enclosing parentheses
            at the end.
         */
        jt.printInformation();
        jt2.printInformation();
        jt3.printInformation();

        int objectNumber = jt.getIdObject();
        int getNumberOfObjects = JavaTutorial.getCountObjects();

    }
}

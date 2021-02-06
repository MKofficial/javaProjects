package programko_rak.tutorials;

public class JavaTutorial2 {

    /*
        ACCESS MODIFIERS
        They change the access to methods and fields.

        Public - visible in class, outside the class and outside package or packages
        Protected - visible in class, in its subclasses and package
        Private - visible only in class

        There are another, but these three are the most usual.
     */
    static int countObjects;
    public int idObject;
    private String nameOfObject;

    /*
        CONSTRUCTOR
        Constructor is a specific type of method which is called each time a new object is created.

        One class can have several constructors but at least one should be "public" to be accessed from outside the class.
        Constructor
     */
    public JavaTutorial2() {

    }

}

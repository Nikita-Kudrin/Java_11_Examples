package sample.impl;

public class Child extends Parent {

    // Field will be ignored during serialization
    transient Doable doableField;

    private final int SOME_READONLY_VAR;
    private static String SomeStaticVariable;

    // static constructor - executes when class is loaded in JVM
    static {
        System.out.println("Static constructor invoked");
        SomeStaticVariable = "asdfadsf";
    }

    public Child(int[] array) {
        super(array);
        SOME_READONLY_VAR = 9;
    }

    public Child(String str) {
        this();
    }

    public Child() {
        super(null);

        System.out.println("Child constructor");
        SOME_READONLY_VAR = 10;
    }

    // FINAL method cannot be overriden
    //    Parent FinalMethodCannotBeOverriden() {
    //        return  null;
    //    }

    // FINAL class cannot be inherited
    //    public class InnerClass extends FinalClass {
    //
    //    }

    @Override
    Parent someAbstractMethod() {
        return null;
    }

    public String getSomeText() {
        return "Some text";
    }

    @Override
    public void forLoopExample() {
    }

    public void variableAgruments(int... args) {
        for (var argument : args) {
            System.out.println(argument);
        }
    }

    public void checkStringMethods() {
        var string = "some string";
        var secondChar = string.charAt(1);
        var length = string.length();
    }
}

package sample.impl;

public class TypeWrappers {
    public Integer intWrapper = 29;
    public int intVariable;

    public Short shortWrapper;
    public short shortVariable;

    public Double doubleWrapper;
    public double doubleVariable;

    public Boolean booleanWrapper;
    public boolean booleanVariable;

    public void testMethod() {
        // unboxing
        final int x = intWrapper;
        // autoboxing
        intWrapper = 10;
        intWrapper++;

        System.out.println(Integer.valueOf(90));
        System.out.println(doubleWrapper = Double.valueOf("99.9"));
    }
}

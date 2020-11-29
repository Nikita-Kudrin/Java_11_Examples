package common;

import org.testng.annotations.Test;

public class StringTests {

    @Test
    public void operationsWithStrings() {
        var str = new String("blabla");
        var arrOfChars = str.toCharArray();
        var length = str.length();

        var concatenated = "literal string" + str;

        var convertedFromInt = String.valueOf(23);
        var convertedFromDouble = String.valueOf(23.3223D);

        var symbol = str.charAt(0);

        var obj = new Object();
        System.out.println(obj.toString());

        System.out.println(str.equals(new String("blabla")));

        var joined = String.join(";", new String[]{"a", "bxxx", "cdad"});
        System.out.println(joined);

        var isEmpty = "".isEmpty();
    }
}

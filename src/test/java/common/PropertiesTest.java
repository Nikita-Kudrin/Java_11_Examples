package common;

import org.testng.annotations.Test;

import java.util.Properties;

public class PropertiesTest extends BaseTest {

    @Test
    public void properties() {
        var envVariables = System.getProperties();

        for (var prop : envVariables.entrySet()) {
            System.out.println(String.format("%s : %s", prop.getKey(), prop.getValue()));
        }

        var customProperties = new Properties();
        customProperties.setProperty("PropName", "PropValue");
        customProperties.setProperty("AnotherProperty", "AnotherValue");

        // customProperties.store(new BufferedOutputStream(System.out));
    }
}
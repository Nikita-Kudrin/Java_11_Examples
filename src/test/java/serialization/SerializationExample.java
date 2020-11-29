package serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import org.testng.annotations.Test;
import sample.impl.Doable;

public class SerializationExample {

    @Test
    public void jsonSerialization() {
        var doable = new Doable(new int[]{1, 4, 4, 9});

        var gson = new Gson();
        var gsonText = gson.toJson(doable);

        System.out.println("JSON:" + gsonText);

        var doableObjectFromJson = gson.fromJson(gsonText, Doable.class);
        gsonText = gson.toJson(doableObjectFromJson);

        System.out.println("JSON:" + gsonText);
    }

    @Test
    public void xmlSerialization() throws JsonProcessingException {
        var doable = new Doable(new int[]{1, 4, 4, 9});

        var xmlMaper = new XmlMapper();
        var xmlText = xmlMaper.writeValueAsString(doable);

        System.out.println("XML: " + xmlText);
        var deserialized = xmlMaper.readValue(xmlText, Doable.class);

        for (var item : deserialized.getArray()) {
            System.out.println(item);
        }
    }
}

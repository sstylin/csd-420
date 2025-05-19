// Steve Stylin Module 11.2

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JsonExample {
    public static void main(String[] args) {
        JsonObject jsonObject = Json.createObjectBuilder()
                .add("Title", "Java JSON Processing")
                .add("Author", "Steve Stylin")
                .add("Year", 2025)
                .add("School", "Bellevue University")
                .add("Professor", "Elijah Finch")
                .build();

        try (JsonWriter jsonWriter = Json.createWriter(new FileWriter("output.json"))) {
            jsonWriter.write(jsonObject);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

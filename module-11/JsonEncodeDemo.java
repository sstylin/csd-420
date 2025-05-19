
// reference java JSON example can be found at : https://www.tutorialspoint.com/json/json_java_example.htm
// Steve Stylin Module 11.2

import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

class JsonEncodeDemo {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();

        obj.put("name", "foo");
        obj.put("n", 100);
        obj.put("balance", 1000.21);
        obj.put("is_vip", true);

        try (FileWriter file = new FileWriter("data.json")) {// we simple save the outpu into a JSON file intesd of
                                                             // System.out.print
            file.write(obj.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JSON_Util {
    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    public static String convertJavatoJason(Object obj) {
        String json_result = "";
        try {
            json_result = mapper.writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json_result;
    }

    public static <T> T convertJSONtoObject(String json_string, Class<T> cls) {
        T result = null;
        try {
            result = mapper.readValue(json_string, cls);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String readJSONTree(String json_string) throws IOException        //JSON_NODE -- readTree
    {
        JsonNode jsonNode = mapper.readTree(json_string);
        return jsonNode.get("empno").asText();

    }


}

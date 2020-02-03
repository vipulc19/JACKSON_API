import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JSON_Util
{
	private static ObjectMapper mapper;
	static
	{
		mapper=new ObjectMapper();
	}
	public static String convertJavatoJason(Object obj)
	{
		String json_result="";
		try {
			json_result=mapper.writeValueAsString(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json_result;
	}
	public static <T> T convertJsontoJava(String jason_string, Class<T> cls)
	{
		T result=null;
		try {
			result = mapper.readValue(jason_string,cls);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}

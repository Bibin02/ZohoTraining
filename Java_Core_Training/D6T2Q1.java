/*
1.Creates a JSON object with an array in it and writes it into a file named json_output.json.
*/
// importing java simple libraries and JSON libraries 
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 

public class D6T2Q1 { 
    @SuppressWarnings("unchecked")
    public static void main(String[] args) 
		throws FileNotFoundException 
	{ 
		// Json object is created 
		JSONObject jsonObject = new JSONObject(); 

		// Adding data using the created object 
		jsonObject.put("firstName", "Rachel"); 
		jsonObject.put("lastName", "Green"); 
		jsonObject.put("age", 30); 
		jsonObject.put("noOfPosts", 100); 
		jsonObject.put("status", "active"); 

		// LinkedHashMap is created for address data 
		Map<Object,Object> addressMap = new LinkedHashMap<>(4); 
		addressMap.put("road", "MG Road Cross cut Street"); 
		addressMap.put("city", "Bangalore"); 
		addressMap.put("state", "Karnataka"); 
		addressMap.put("pinCode", 560064); 

		// adding address to the created JSON object 
		jsonObject.put("addressOfAuthor", addressMap); 

		// JSONArray is created to add the phone numbers 
		JSONArray phoneNumberJsonArray = new JSONArray(); 
		addressMap = new LinkedHashMap<>(2); 
		addressMap.put("presentAt", "home"); 
		addressMap.put("phoneNumber", "1234567890"); 

		// adding map to list 
		phoneNumberJsonArray.add(addressMap); 
		addressMap = new LinkedHashMap<>(2); 
		addressMap.put("type2", "fax1"); 
		addressMap.put("no1", "6366182095"); 

		// map is added to the list 
		phoneNumberJsonArray.add(addressMap); 

		// adding phone numbers to the created JSON object 
		jsonObject.put("phoneNos", phoneNumberJsonArray); 

		// the JSON data is written into the file 
		PrintWriter printWriter = new PrintWriter("json_output.json"); 
		printWriter.write(jsonObject.toJSONString()); 
		printWriter.flush(); 
		printWriter.close(); 
	} 
}

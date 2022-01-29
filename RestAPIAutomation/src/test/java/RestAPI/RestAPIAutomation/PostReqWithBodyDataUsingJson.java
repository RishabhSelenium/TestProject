package RestAPI.RestAPIAutomation;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class PostReqWithBodyDataUsingJson {
	public static void main(String[] args) {
		JSONObject inner1 = new JSONObject();
		inner1.put("FlatNo","21");
		inner1.put("sector","3");
		
		JSONObject inner2 = new JSONObject();
		inner2.put("FlatNo","21");
		inner2.put("sector","3");
		
		JSONArray ar = new JSONArray();
		ar.put(0,inner1);
		ar.put(0,inner2);
		
		JSONObject jb =new JSONObject();
		jb.put("FirstName", "J1");
		jb.put("LastName", "V1");
		jb.put("email", "@test");
		jb.put("id", "7072");
		jb.put("Address", ar);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(jb.toString())
		.when()
		.post("http://localhost:3000/InternsInformations");
		System.out.println(res.statusCode());
		
		
	}

}

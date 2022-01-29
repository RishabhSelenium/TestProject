package RestAPI.RestAPIAutomation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.http.HttpResponse.BodyHandler;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


//hit the post req
// body data with json file 
public class postReq {
public static void main(String[] args) throws FileNotFoundException {
File f =  new File("/Users/rishabh/eclipse-workspace2/RestAPIAutomation/bodydata.json");	// conncetion establish
FileReader fr = new FileReader(f);
JSONTokener jt = new JSONTokener(fr);
JSONObject body = new JSONObject(jt);
//System.out.println(body);

Response res =
given()
.contentType(ContentType.JSON)
.body(body.toString())
.when()
.post("http://localhost:3000/TeamLeadsInformations");

System.out.println(res.statusCode());
//System.out.println(res.asString());
}
}

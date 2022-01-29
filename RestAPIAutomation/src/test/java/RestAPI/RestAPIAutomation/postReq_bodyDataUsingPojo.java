package RestAPI.RestAPIAutomation;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postReq_bodyDataUsingPojo {
	public static void main(String[] args) {
		
		//Simple data
//		basic_POJO bp = new basic_POJO();
//		bp.setFirstName("testFirstname");
//		bp.setDesignation("testDignation");
//		bp.setId("TestID");
//		bp.setLastName("testLastName");
//		Response rs= 
//				given()
//				.contentType(ContentType.JSON)
//				.body(bp)
//				.when()
//				.post("http://localhost:3000/ProjectManagerInformations");
//			     System.out.println(rs.getStatusCode());
		
		
        
		
//	    // Complex Data 
//	    addressINFO_POJO address = new addressINFO_POJO();
//	    address.setFlatNo("78");
//	    address.setSector("3");
//	    
//	    
//	    basic_POJO bp = new basic_POJO();
//	    bp.setFirstName("Test02Fisrt");
//	    bp.setLastName("test02LastName");
//	    bp.setDesignation("test02Desigantion");
//	    bp.setId("Test02Id");
//	    bp.setAddress(address);
//	    
//	    Response rs= 
//	    given()
//	    .contentType(ContentType.JSON)
//	    .body(bp)
//	    .when()
//	    .post("http://localhost:3000/ProjectManagerInformations");
//	    
//	    System.out.println(rs.statusCode());


//		// Array data using POJO
		
//		

	    addressINFO_POJO[] a = new addressINFO_POJO[2];
		a[0] = new addressINFO_POJO();
		a[0]. setFlatNo("8/4");
		a[0]. setSector("03");
		a[1] = new addressINFO_POJO();
		a[1]. setFlatNo("7/9");
		a[1]. setSector("05");
        basic_POJO b = new basic_POJO();

		b. setFirstName("Ankit");
		b. setLastName("Desai");
		b.setDesignation("30");
		b.setId("Gujarat");
		b.setAddress(a);
		
		 Response rs= 
				    given()
				    .contentType(ContentType.JSON)
				    .body(b)
				    .when()
				    .post("http://localhost:3000/ProjectManagerInformations");
				    
				    System.out.println(rs.statusCode());
				    System.out.println(rs.asString());

		
		
	
	}

}

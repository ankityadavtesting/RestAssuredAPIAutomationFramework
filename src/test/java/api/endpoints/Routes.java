package api.endpoints;

public class Routes {
		
	//base url
	public static String base_url = "https://petstore.swagger.io/v2";
	
	//create user
	public static String post_url = base_url+"/user";
	
	//get user
	public static String get_url = base_url+"/user/{username}";
	
	//update user
	public static String put_url = base_url+"/user/{username}";
	
	//delete user
	public static String del_url = base_url+"/user/{username}";

}

package loku;

import java.util.ArrayList;
import java.util.HashMap;

public class DriverTesting {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("‪C:\\Users\\APPLESDD\\Desktop\\link1.properties");
		al.add("admin");
		al.add("manager");
		System.out.println(al.get(2));
		HashMap<String,String> hm=new HashMap<>();
		String url;
		hm.put("url","C:\\Users\\APPLESDD\\Desktop\\commondata.properties");
		hm.put("username","admin");
		hm.put("password","manager");
		System.out.println(hm.get("password"));
		
	}

}

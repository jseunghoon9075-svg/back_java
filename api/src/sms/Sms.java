package sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class Sms {
	public static void main(String[] args) {
		String api_key = "NCSHKXTEK4BCL5PM";
		String api_secret = "VSXUGGOWTAJNLFCKCPCSVAVHUTHRJGRD";
		Message coolsms = new Message(api_key, api_secret);

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", "");
		params.put("from", "01090753368");
		params.put("type", "SMS");
		params.put("text", "");
		params.put("app_version", "text app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
	}
}

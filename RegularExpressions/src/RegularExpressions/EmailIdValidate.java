package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
  
 */
public class EmailIdValidate {
	public static void main(String[] args) {
		String str="Sa@1223d";
		
		String regex ="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}";
		
		Pattern p =Pattern.compile(regex);
		Matcher m=p.matcher(str);
		
		if (m.find()&&m.group().equals(str)) {
			System.out.println("valid");
		}else {
			System.out.println("in valid");
		}
	}

}

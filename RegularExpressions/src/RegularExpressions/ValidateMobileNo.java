package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNo {
public static void main(String[] args) {
	String str = "9110592924";
	String regex ="[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
	String regex1 ="[6-9][0-9]{9}";
	String regex2 ="[6-9]\\d{9}";
	Pattern p = Pattern.compile(regex2);
	Matcher m= p.matcher(str);
	if (m.find()&&m.group().equals(str)) {
		System.out.println("valid mobile no");
	}else {
		System.out.println("invalid mobile no");
	}
	
}
}

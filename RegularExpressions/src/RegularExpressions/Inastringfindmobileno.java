package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inastringfindmobileno {
public static void main(String[] args) {
	String str = "Tis is smith my contact no. 9110592924  6757648293";
	String regex ="[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
	String regex1 ="[6-9][0-9]{9}";
	String regex2 ="[6-9]\\d{9}";
	Pattern p = Pattern.compile(regex1);
	Matcher m= p.matcher(str);
	while (m.find()) {
		System.out.println("valid mobile number found");
		System.out.println(m.group());}
//	}else {
//		System.out.println("invalid mobile number not found ");
//	}
	
}
}

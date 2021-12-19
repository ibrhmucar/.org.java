package Week7;

import day30_wrappleClass.Task97;
import day30_wrappleClass.Task98;

public class r06WrapperClassCharacters {

	public static void main(String[] args) {
		
		String s = "abcde1234!@#&£efgh6789#$ABCD";
		String a = "lfkjsdlksi2094802940ADFAERAAFA3ü09#$½½{§${[$[{]{das9098c";
		
		
		System.out.println(Task97.filterInt(s));
		System.out.println(Task97.filterString(s));
		System.out.println(Task97.upperCase(s));
		System.out.println(Task97.lowerCase(s));
		System.out.println(Task97.specialCharacters(s));
		System.out.println("__________________________");
		System.out.println(Task97.filterInt(a));
		System.out.println(Task97.filterString(a));
		System.out.println(Task97.upperCase(a));
		System.out.println(Task97.lowerCase(a));
		System.out.println(Task97.specialCharacters(a));
		
	

	

}
}

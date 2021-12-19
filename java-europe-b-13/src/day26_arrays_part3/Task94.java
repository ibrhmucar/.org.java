package day26_arrays_part3;

import java.util.Arrays;

public class Task94 {

	public static void main(String[] args) {
		
		
		String info1 = "This info is used for creation password : xxxCD132Gxxx. Please don not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx. Please don not share with anyone";
		
		
		String [] infoArray1 = info1.split("password :");
		System.out.println(Arrays.toString(infoArray1));
		String pass1 = infoArray1[1].split(". Please")[0];
		System.out.println(pass1);
		
		
		String [] infoArray2 = info2.split("password :");
		String pass2 = infoArray2[1].split(". Please")[0];
		System.out.println(pass2);
		
		
		String newPassword = pass1.trim().substring(3,9).concat(pass2.trim().substring(3,9));
		System.out.println(newPassword);
	}

}

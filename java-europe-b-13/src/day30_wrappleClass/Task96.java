package day30_wrappleClass;

import java.util.Arrays;
import java.util.function.DoublePredicate;

public class Task96 {

	public static void main(String[] args) {
		
		String str = "Today weather is sunny and 72.5 degree. It is a perfect day to practice java.";
		
		String [] arr = str.split("and ");
		
		System.out.println(Arrays.toString(arr));
		
		arr = arr[1].split(" degree");
		System.out.println(Arrays.toString(arr));
		
		String degree = arr[0];
		
		double degreeF = Double.parseDouble(degree);
		System.out.println("here is " + degreeF);
		System.out.println(Double.valueOf(degreeF));
		String newDegree = Double.toString(degreeF);
		System.out.println(newDegree+1);
		
		
		double degreeC = (degreeF-32)* 5/9;
		System.out.println(degreeF + " is equal to " + Math.round(degreeC) + " celcius");
		
		
		
		System.out.println(Task97.filterString(str));
		System.out.println(Task97.filterInt(str));


		
		
		
	}

}

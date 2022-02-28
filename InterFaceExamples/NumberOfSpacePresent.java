package InterFaceExamples;

import  java.util.Scanner;
import java.util.function.Function;
public class NumberOfSpacePresent {

	public static void main(String[] args) {

		 String str="O m M o r e";
	        Function<String,Integer> f = s1->s1.length()-s1.replaceAll("\\s","").length();
	        System.out.println("Space Removed :" + f.apply(str));
		
		
	}

}

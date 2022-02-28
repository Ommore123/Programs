package InterFaceExamples;

import java.util.function.*;
public class SpaceRemovingInString {

	public static void main(String[] args) {
		String s="O m M o r e";
	    Function<String,String> f = s1->s1.replaceAll("\\s","");
	        System.out.println("Space Removed :" + f.apply(s));
	}

}

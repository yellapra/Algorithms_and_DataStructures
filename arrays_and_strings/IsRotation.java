public class IsRotation{

	public static boolean isRotation(String s1, String s2){
		
		if(s1 == null || s2 == null){
			return false;
		}
		if(s1.length()!= s2.length()){
			return false;
		}
		String concat_string = s1 + s1;
		return (concat_string.indexOf(s2) != -1);
	}


	public static void main(String args[]){
		System.out.println(IsRotation.isRotation("waterbottle" , "eerbottlewat"));
	}

}

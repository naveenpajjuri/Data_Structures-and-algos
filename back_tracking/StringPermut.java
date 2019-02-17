public class StringPermut {

	public static String permute(String str ) {

		if (str.length() == 1) {
			return str;
		}

		for (int i= 1; i < str.length();i ++) {
			String front = permute(str.substring(0,i-1));
			String back = permute(str.substring(i,str.length()-1));
			System.out.println(front + " --- "+ back);
			System.out.println(front + str.charAt(i)+ back);
		    System.out.println(back + str.charAt(i)+  front);

		}

	/*	System.out.println(start + " --- "+ end);
		if (start > end){
			return "";
		}
	if (start == end) {
		return String.valueOf(str.charAt(start));
	}
	for (int i = start; i < end; i ++) {
		//System.out.println("In for loop "+ start + " -i- "+ i + "  --end "+ end);
		String front = permute(str,start,i);
		String back = permute(str,i+1,end);
		System.out.println(front + back);
		System.out.println(back + front);
	}*/
		return "";
	}



    public static void main(String[] args) 
    { 
        String str = "ABC"; 
        int n = str.length(); 
        System.out.println(permute(str));//, 0, n-1)); 
    } 
}
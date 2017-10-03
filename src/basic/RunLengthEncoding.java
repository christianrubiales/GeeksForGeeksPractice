package basic;


public class RunLengthEncoding {

	String encode(String str)
	{
	    char c = str.charAt(0);
	    int count = 1;
	    
	    StringBuilder sb = new StringBuilder();
	    for (int i = 1; i < str.length(); i++) {
	        if (c == str.charAt(i)) {
	            count++;
	        } else {
	            sb.append(("" + c) + count);
	            c = str.charAt(i);
	            count = 1;
	        }
	    }
        sb.append(("" + c) + count);
	    return sb.toString();
	}
}

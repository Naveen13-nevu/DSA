package Practice3;

public class LongestString {

	public static void main(String[] args) {
	 
		 String str = "i am naveen";
	        String longest ="";
	        String temp="";
	        
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)!=' '){
	                temp = temp +str.charAt(i);
	            }
	            else{
	                if(temp.length()>longest.length()){
	                    longest = temp;
	                }
	                temp="";
	            }
	            if(temp.length()>longest.length()){
	                    longest = temp;
	                }
	               
	        }
	        
	         System.out.println(longest);

	}

}

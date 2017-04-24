
public class JavaExercise {

	public static void main(String[] args) {
		
       System.out.println(reverseEverthying("hope you are doing well"));
	    }
	    
	    private static String reverseEverthying(String s){
	        String[] words = s.split("\\s");
	        String[] reverseWords = new String[words.length];
	        for(int i = 0;i < words.length;i++){
	            reverseWords[i] = words[(words.length - 1) - i];
	        }
	        for(int j = 0;j < reverseWords.length;j++){
	            String[] temp = reverseWords[j].split("");
	            String[] reverseWord = new String[temp.length]; 
	            for(int i = 0; i < temp.length; i++){
	                reverseWord[i] = temp[(temp.length - 1) - i];
	            }
	            reverseWords[j] = fromStringArrayToString(reverseWord, false);
	        }
	        return fromStringArrayToString(reverseWords, true);
	    }
	    
	    private static String fromStringArrayToString(String[] strAry, boolean isSentence){
	        String str = "";
	        for(int i = 0; i < strAry.length; i++){
	            if(isSentence)
	                str += " " + strAry[i];
	            else
	                str += strAry[i];
	        }
	        return str;
	    }
	}



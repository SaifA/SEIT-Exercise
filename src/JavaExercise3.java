import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class JavaExercise3 {

	public static void main(String[] args) {
		JavaExercise3 java = new JavaExercise3();
		java.printMeanings("txt.txt");
	}
		private boolean doesFileExist(String path){
			try{
			BufferedReader inputStream = new BufferedReader(new FileReader(path));
			return true;
			} catch (Exception e){
			return false;
			}
			}

			private void printMeanings(String str){
				File file = new File(str);
				
			BufferedReader inputStream;
			try {
				inputStream = new BufferedReader(new FileReader(file.getAbsolutePath()));
			
			String s = inputStream.readLine();
			    while( s != null){
			        String[] splitStr = s.split(" – ");
			        String[] defs = splitStr[1].split(",");
			        String word = splitStr[0];
			        System.out.println(word);
			        for(String def:defs){
			            System.out.println(def);
			        }
			        s = inputStream.readLine();
			}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e){
				e.printStackTrace();
			}
			}

	}



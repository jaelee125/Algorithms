import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BoyerMooreHorspoolAlgorithm {
	private int numberOfMatches = 0;
	final private static int CHAR_MAX = 255;
	static int[] shiftTable = new int[CHAR_MAX];

	public int readFile(String pattern, String file){
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			inputPreProcess(pattern);
			
			while ((line = br.readLine()) != null) {
				searchString(pattern, line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return numberOfMatches;
	}
	
	private void searchString(String pattern, String line){
		if(pattern == null || line == null || pattern.length() > line.length()){
			return;
		}
		int offset = 0;
		int scan = 0;
		int last = pattern.length() - 1;
		
		while(offset <= line.length() - pattern.length()){
			for(scan = last; pattern.charAt(scan) == line.charAt(scan + offset); scan--){
				if(scan == 0){
					numberOfMatches ++;
					break;
				}
			}
			offset += shiftTable[line.charAt(offset + last)];
		}
	}
	
	private static void inputPreProcess(String pattern){
		for(int i = 0; i < CHAR_MAX; i++){
			shiftTable[i] = pattern.length();
		}
		
		for(int i = 0; i < pattern.length()-1; i++){
			shiftTable[pattern.charAt(i)] = pattern.length()-1-i;
		}
	}
}

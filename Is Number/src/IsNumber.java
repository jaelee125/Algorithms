public class IsNumber {

	public boolean isNumber(String string){
		string = string.trim();
		boolean isDecimal = false;
		
		if(string == null || string.isEmpty()){
			return false;
		}
		
		for(int i = 0; i<string.length(); i++){
			if(string.charAt(i) == '-'){
				if(i != 0){
					return false;
				}
				continue;
			}
			else if(string.charAt(i) == '.'){
				if(isDecimal || i == string.length()-1){
					return false;
				}
				else {
					isDecimal = true;
				}
			} else if(string.charAt(i) < '0' || string.charAt(i) > '9'){
				return false;
			}
		}
		return true;
	}
}



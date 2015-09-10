public class ProductArray {
	
	public int[] calculateProductArray(int[] array){
		final int[] EMPTY = {};
		
		if(array == null || array.length == 0 ){
			return EMPTY;
		}
		
		int length = array.length;
		int[] left = new int[length];
		int[] right = new int[length];
		int[] product = new int[length];
		int indexProduct = 1;
			
		for(int i=0; i<length; i++){
			left[i] = indexProduct;
			indexProduct *= array[i];
		}
		
		indexProduct = 1;
		
		for(int i=length-1; i>=0; i--){
			right[i] = indexProduct;
			indexProduct *= array[i];
		}
		
		for(int i=0; i<length; i++){
			product[i] = left[i] * right[i];
		}
		
		return product;
	}
}

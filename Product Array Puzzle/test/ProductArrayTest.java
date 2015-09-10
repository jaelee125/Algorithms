import static org.junit.Assert.*;

import org.junit.Test;


public class ProductArrayTest {
	ProductArray productArray = new ProductArray();
	int[] array = {1,2,3,4,5};
	int[] product = {120,60,40,30,24};
	int[] empty = {};
	int[] nullArray = null;
	
	@Test
	public void test() {
		assertArrayEquals(product,productArray.calculateProductArray(array));
		assertArrayEquals(empty,productArray.calculateProductArray(empty));
		assertArrayEquals(empty,productArray.calculateProductArray(nullArray));
	}

}

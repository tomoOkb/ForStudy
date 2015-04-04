package sort;

public class BubbleSort {
	public static void main(String[] args) {
		BubbleSort own = new BubbleSort();
		int[] argArr = new int[]{5,3,1,4,2,0};
		argArr = own.doBubbleSort(argArr);
		
		System.out.println(argArr);
		for (int i = 0; i < argArr.length; i++) {
			System.out.println(argArr[i]);
		}
	}
	
	
	public int[] doBubbleSortRe(int[] argArr) {
		int temp = 0;
		for (int i = 0; i < argArr.length - 1; i++) {
			if(argArr[i] > argArr[i +1]) {
				temp = argArr[i];
				argArr[i] = argArr[i +1];
				argArr[i +1] = temp;
				doBubbleSortRe(argArr);
			}
		}
		return argArr;
	}

	public int[] doBubbleSort(int[] argArr) {
		int temp = 0;
		for (int i = 0; i < argArr.length - 1; i++) {
			for (int j = argArr.length -1; j > i; j--) {
				if (argArr[j -1] > argArr[j]) {
					temp = argArr[j -1];
					argArr[j -1] = argArr[j];
					argArr[j] = temp;
				}
			}
		}
		return argArr;
	}

}


public class SelectionSort implements SortingAlgorithm{

	@Override
	public void sort(int[] a) {
		int temp = 0;
		int i = 0, j = 0, min = 0;
		
		for (i = 0; i < a.length - 1; i++) {
			min = i;
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
		}
		
		if (min != i) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
	}

}

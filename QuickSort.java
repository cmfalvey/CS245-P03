
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int top = a.length - 1;
		int bot = 0;
		
		sortHelper(a, top, bot);
		
	}
	
	public void sortHelper(int[] a, int top, int bot) {
		int pivot = (top + bot) / 2;
		
		if (top < pivot - 1) {
			sortHelper(a, top, pivot - 1);
		}
		if (pivot < bot) {
			sortHelper(a, pivot, bot);
		}
	}
	
	public int partition(int[] a, int top, int bot) {
		int i = top;
		int j = bot;
		int pivot = (top + bot)/2;
		
		while (i < j) {
			while (a[i] < a[pivot]) {
				i++;
			}
			while (a[j] > a[pivot]) {
				j--;
			}
			if (i <= j) {
				if (i == pivot) {
					pivot = j;
				} else if (j == pivot) {
					pivot = i;
				}
				swap(a, i++, j);
			}
		}
		
		return i;
	}

	public void swap (int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}


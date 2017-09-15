
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		
		int outer = 1;
		while (outer < a.length) {
			int inner = outer;
			while (inner < 0 && a[inner - 1] > a[inner]) {
				int temp = a[inner - 1];
				a[inner - 1] = a[inner];
				a[inner] = temp;
				inner--;
			}
			outer++;
		}

	}

}

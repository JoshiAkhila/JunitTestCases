package JunitTestCases;

import java.util.HashMap;
import java.util.Map;

public class MergeCounter {

	int array_list1[];
	int array_list2[];

	public MergeCounter(int[] array_list1, int[] array_list2) {
		super();
		this.array_list1 = array_list1;
		this.array_list2 = array_list2;
	}

	public Map<Integer, Integer> mCounter() {

		Map<Integer, Integer> M1 = new HashMap<Integer, Integer>();

		if (array_list1 != null && array_list2 != null) {
			int n = array_list1.length;
			int m = array_list2.length;
			for (int i = 0; i < n || i < m; i++) {

				if (i < n) {
					if (M1.containsKey(array_list1[i])) {
						Integer key_val = M1.get(array_list1[i]);
						M1.remove(array_list1[i]);
						M1.put(array_list1[i], key_val + 1);
					} else {
						M1.put(array_list1[i], 1);
					}
				}

				if (i < m) {
					if (M1.containsKey(array_list2[i])) {
						Integer key_val = M1.get(array_list2[i]);
						M1.remove(array_list2[i]);
						M1.put(array_list2[i], key_val + 1);
					} else {
						M1.put(array_list2[i], 1);
					}
				}
			}
		}
		return M1;
	}
}

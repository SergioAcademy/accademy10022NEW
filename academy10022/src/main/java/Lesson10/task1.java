package Lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
	public static void main(String... args) {
		List<HeavyBox> list = new ArrayList();

		HeavyBox hbox1 = new HeavyBox(1, 2, 3, 4);
		HeavyBox hbox2 = new HeavyBox(2, 3, 4, 4);
		HeavyBox hbox3 = new HeavyBox(3, 4, 5, 4);
		HeavyBox hbox4 = new HeavyBox(4, 5, 6, 4);

		list.add(hbox1);
		list.add(hbox2);
		list.add(hbox3);
		list.add(hbox4);

		for (HeavyBox b : list) {
			System.out.println(b);
		}

		list.get(0).setWeight(1);

		list.remove(list.size() - 1);
		// 1 �������
//		Object[] objectArray = list.toArray();
//		System.out.println(Arrays.toString(objectArray));
//
//		// 2 �������
//		HeavyBox[] stringArray1 = new HeavyBox[list.size()];
//		list.toArray(stringArray1);
//		System.out.println(Arrays.toString(stringArray1));
//
//		// 3 �������
//		HeavyBox[] stringArray2 = list.toArray(new HeavyBox[0]);
//		System.out.println(Arrays.toString(stringArray2));
//
		list.clear();
	}
}
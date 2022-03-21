package lesson5;

public class task4 {
	public static void main(String[] args) {

		String s = "ƒл€ работы со строками в €зыке Java используютс€ классы String, StringBuilder, StringBuffer";

		System.out.println(s);
		int index = -1;

		do {
			index = s.indexOf("S", index == -1 ? 0 : index + 1);
			if (index != -1) {
				System.out.print(index + " ");
			}
		} while (index != -1);
		
	}
}

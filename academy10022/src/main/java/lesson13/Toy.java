package lesson13;

import java.util.HashMap;
import java.util.Map;

public class Toy {
	public static void main(String[] args) {

		Map<String, Toy> marks = new HashMap<>();
		Toy one = new Toy();
		Toy to = new Toy();
		Toy tree = new Toy();
	
		marks.put("", one);
		marks.put("", to);
		marks.put("", tree);
	
		}
	public static void printKey(HashMap<String, Toy>one) {
		for (String key: one.keySet()) {
			System.out.println(key);123
	
		public static void printValue(HashMap<String, Toy>one) {
			for (Toy value:one.values()) {
				System.out.println(value);
	}
		}
		}

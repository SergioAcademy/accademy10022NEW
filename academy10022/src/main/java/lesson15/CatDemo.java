package lesson15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CatDemo implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		Cat cat = new Cat("Cat", "123");
		try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream("src\\io\\CatAge.txt"));

				ObjectOutputStream osu = new ObjectOutputStream(bufferedOutputStream)) {
			osu.writeObject("CatAge");
			osu.writeInt(1);
			osu.writeObject(cat);

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		try (BufferedInputStream br = new BufferedInputStream(new FileInputStream("src\\io\\CatAge.txt"));
				ObjectInputStream isu = new ObjectInputStream(br)) {
			Integer i = isu.readInt();
			String str = (String) isu.readObject();
			Cat CatAge1 = (Cat) isu.readObject();
			System.out.println(str);
			System.out.println(i);
			System.out.println(CatAge1);

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CatDemo []");
		return builder.toString();
	}

}


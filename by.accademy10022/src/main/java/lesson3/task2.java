package lesson3;

public class task2 {
	public static void main(String[] args) {
		int s = 9370000;
		int sec;
		int m;
		int min;
		int h;
		int hour;
		int d;
		int day;
		int w;
		int week;
		int mn;

		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hour = h % 24;
		d = (h - hour) / 24;
		day = d % 7;
		w = (d - day) / 7;
		week = w % 4;
		mn = (w - week) / 4;

		System.out.println(mn + " месяцев " + week + " недель " + day + " дней " + hour + " часов " + min + " минут "
				+ sec + " секунд");
	}
}

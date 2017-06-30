package ch11.check.question13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPrintExample {
	public static void main(String[] args) {
		Date now = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 MM분");
		System.out.println(sdf.format(now));
	}

}

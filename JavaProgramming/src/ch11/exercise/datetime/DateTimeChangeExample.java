package ch11.exercise.datetime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;

public class DateTimeChangeExample {
	public static void main(String[] args) {
		// LocalDateTime now = LocalDateTime.now();
		// System.out.println("헌재 : " + now);
		//
		// LocalDateTime targetDateTime = null;
		//
		// // 직접 변경
		// targetDateTime =
		// now.withYear(2024).withMonth(10).withDayOfMonth(5).withHour(13).withMinute(30).withSecond(20);
		// System.out.println("직접 변경 : " + targetDateTime);
		//
		// // 년도 상대 변경
		// targetDateTime = now.with(TemporalAdjuster.firstDayOfYear());
		// System.out.println("이번 해의 첫 일 : " + targetDateTime);
		// targetDateTime = now.with(TemporalAdjuster.lastDayOfYear());
		// System.out.println("이번 해의 마지막 일 : " + targetDateTime);
		// targetDateTime = now.with(TemporalAdjuster.firstDayOfNextYear());
		// System.out.println("다음 해의 첫 일 : " + targetDateTime);
		//
		// // 월 상대 변경
		// targetDateTime = now.with(TemporalAdjuster.firstDayOfMonth());
		// System.out.println("이번 달의 첫 일 : " + targetDateTime);
		// targetDateTime = now.with(TemporalAdjuster.lastDayOfMonth());
		// System.out.println("이번 달의 마지막 일 : " + targetDateTime);
		// targetDateTime = now.with(TemporalAdjuster.firstDayOfNextMonth());
		// System.out.println("다음 달의 첫 일 : " + targetDateTime);
		//
		// // 월 상대 변경
		// targetDateTime =
		// now.with(TemporalAdjuster.firstInMonth(DayOfWeek.MONDAY));
		// System.out.println("이번 달의 첫 월요일 : " + targetDateTime);
		// targetDateTime = now.with(TemporalAdjuster.next(DayOfWeek.MONDAY));
		// System.out.println("돌아오는 월요일 : " + targetDateTime);
		// targetDateTime =
		// now.with(TemporalAdjuster.previous(DayOfWeek.MONDAY));
		// System.out.println("다음 달의 첫 일 : " + targetDateTime);
	}
}

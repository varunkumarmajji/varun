package enumsss;

import java.time.DayOfWeek;

enum Month {
	JAN(31) {
		@Override
		public Month nextMonth() {

			return FEB;
		}
	},
	FEB(28) {
		@Override
		public Month nextMonth() {

			return MAR;
		}
	},
	MAR(31) {
		@Override
		public Month nextMonth() {

			return JAN;
		}
	};

	int days;

	private Month(int days) {
		this.days = days;
	}

	public abstract Month nextMonth();

	int getDays() {

		return days;
	}

}

public class EnumForFun {

	public static void main(String[] args) {
		DayOfWeek[] d = DayOfWeek.values();
		for (DayOfWeek mon : d) {
			System.out.println(mon.name() + "==" + mon.ordinal());
		}

	}

}

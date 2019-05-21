package ch05;
import java.util.Calendar;

public class EnumWeekExample {
	public enum Week {
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week week = Week.MONDAY;
Week today = null;

Calendar cal = Calendar.getInstance();
int Week = cal.get(Calendar.DAY_OF_WEEK);

switch(Week) {
case 1:
	today = week.SUNDAY; break;
case 2:
	today = week.MONDAY; break;
case 3:
	today = week.TUESDAY; break;
case 4:
	today = week.WEDNESDAY; break;
case 5:
	today = week.THURSDAY; break;
case 6:
	today = week.FRIDAY; break;
case 7:
	today = week.SATURDAY; break;
}

System.out.println("���� ����: "+ today);

if(today == week.SUNDAY) {
	System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
} else {
	System.out.println("������ �ڹ� �����մϴ�.");
}

	}

}

package GitIsFun;

import java.util.Calendar;
import java.util.Date;

public class CalenderClass {
	private int value;
	private String name;
	private Date date;
	int i=0;
	
	public CalenderClass(final int value, final String name) {
		this.value = value;
		this.name = name;
		date = Calendar.getInstance().getTime();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}
	
	public String toString() {
		return "Name: " + name + " with value: " + value + " created: " + date.toString();
	}
}




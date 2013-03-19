package GitIsFun;

public class CalenderMain {

	public static void main(String[] args){
		CalenderClass Appoint1 = new CalenderClass(1, "Meeting planned");
		CalenderClass Appoint2 = new CalenderClass(2, "Kick Off planned");
		
		System.out.println(Appoint1.toString());
		System.out.println(Appoint2.toString());
	}
}

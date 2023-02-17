package com.comit.course_02_flow_control;

public class SwitchStatement {

	public static void main(String[] args) {
		int day=1;
		switch(day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid input");
				
		}
		switch(day){
		case 0,1->{System.out.println("Hello");
		         System.out.println("Monday");
		}
		case 2->System.out.println("Tuesday");
		case 3->System.out.println("Wednesday");
		case 4->System.out.println("Thursday");
		case 5->System.out.println("Friday");
		case 6->System.out.println("Saturday");
		case 7->System.out.println("Sunday");
		default->System.out.println("Invalid input");
			
		}
		String str=switch(day) {
		case 0,1->"Monday";
		case 2->"Tuesday";
		case 3->"wednesday";
		case 4->"Thursday";
		case 5->"Friday";
		case 6->"saturday";
		case 7->"sunday";
		default ->"Invalid input";
		};
		System.out.println(str);

	}


}

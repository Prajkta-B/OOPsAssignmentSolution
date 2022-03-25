package departments;

public class superDepartment {
	String departmentName() {
		return "Super Department";
	}
	String getTodaysWork() {
		return "No Work as of Now";
	}
    String getWorkDeadline() {
    	return "Nil";
    }
    String isTodayAHoliday() {
    	return "Today is not a Holiday";
    }
}

class Main{
	public static void main(String[] args) {
		adminDepartment a = new adminDepartment();
		hrDepartment h = new hrDepartment();
		techDepartment t = new techDepartment();
		
		//admin department
		System.out.println(a.departmentName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());
		System.out.println(a.isTodayAHoliday());
		System.out.println();
		
		//hr department
		System.out.println(h.departmentName());
		System.out.println(h.doActivity());
		System.out.println(h.getTodaysWork());
		System.out.println(h.getWorkDeadline());
		System.out.println(h.isTodayAHoliday());
		System.out.println();
		
		//tech department
		System.out.println(t.departmentName());
		System.out.println(t.getTodaysWork());
		System.out.println(t.getWorkDeadline());
		System.out.println(t.getTechStackInformation());
		System.out.println(t.isTodayAHoliday());
		
	}
}

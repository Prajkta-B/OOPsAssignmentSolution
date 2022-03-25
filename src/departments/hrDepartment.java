package departments;

class hrDepartment  extends superDepartment {
	String departmentName() {
		return "Welcome to HR Department";
	}
	String getTodaysWork() {
		return "Fill today's worksheet and mark your attendance";
	}
    String getWorkDeadline() {
    	return "Complete by EOD";
    }
    String doActivity() {
    	return "Team Lunch";
    }
}

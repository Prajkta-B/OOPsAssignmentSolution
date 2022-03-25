package departments;

class techDepartment  extends superDepartment {
	String departmentName() {
		return "Welcome to Tech Department";
	}
	String getTodaysWork() {
		return "Complete coding of module 1";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	String getTechStackInformation() {
		return "Core Java";
	}
}

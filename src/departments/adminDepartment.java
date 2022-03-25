package departments;

class adminDepartment extends superDepartment{
	String departmentName() {
		return "Welcome to Admin Department";
	}
	String getTodaysWork() {
		return "Complete your Documents Submission";
	}
    String getWorkDeadline() {
    	return "Complete by EOD";
    }
    
}


public class TimeTester {

	public TimeTester() {

	}

	public boolean validateTimeFormat(String time) {
		if (time.matches("[0-9]{1,2}(:)[0-9]{1,2}((:)[0-9]{0,2}(.){1}[0-9]{0,3})?") == true) {
			return true;
		}else {
		return false;
		}
	}
}

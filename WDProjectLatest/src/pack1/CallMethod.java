package pack1;

public class CallMethod {

	public static void main(String[] args) {
		Methods m=new Methods();
		//m.launchApp("http://rediff.com");
		m.launchApp("http://facebook.com");
		m.elementavailable("email", true);
		m.elementavailable("pass", true);
		m.elementavailable("day", false);
		m.closeApp();
	}

}

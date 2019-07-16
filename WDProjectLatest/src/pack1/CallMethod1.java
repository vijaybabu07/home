package pack1;

public class CallMethod1 {

	public static void main(String[] args) {
		ReusableMethod1 m=new ReusableMethod1();
		m.launchapp("http://facebook.com");
		m.elementEnabled("email", true);
		m.no_of_links(20);
		m.title(30);
		m.url(".com");
		m.title_startswith("K");
	}

}

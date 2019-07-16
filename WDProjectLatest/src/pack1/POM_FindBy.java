package pack1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_FindBy {
	@FindBy(id="email") WebElement uid;
	@FindBy(xpath="//*[@id='pass']") WebElement pwd;

}

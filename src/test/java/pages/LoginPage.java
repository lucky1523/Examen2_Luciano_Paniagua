package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox email = new TextBox(By.id("email"));
    public TextBox password = new TextBox(By.id("password"));
    public Button submitButton = new Button(By.xpath("//button[text()=\"Log in\"]"));
    //button[text()="Log in"]
}

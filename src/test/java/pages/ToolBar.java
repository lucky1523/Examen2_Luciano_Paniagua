package pages;

import control.Button;
import org.openqa.selenium.By;

public class ToolBar {
    public Button profileInfoButton = new Button(By.xpath("//button[@class=\"reactist_menubutton top_bar_btn settings_btn\"]"));
}

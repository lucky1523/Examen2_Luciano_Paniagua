package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.ToolBar;

public class LoginTest extends BaseTodoLy{
    MainPage mainPage= new MainPage();
    LoginPage loginPage = new LoginPage();
    ToolBar toolBar = new ToolBar();


    @Test
    public void verifyLoginTodo() throws InterruptedException {
        mainPage.settingsButton.click();
        //mainPage.prueba.click();
        loginPage.email.setText("erickmallea1234@gmail.com");
        loginPage.password.setText("lucianopaniagua");
        loginPage.submitButton.click();
        Assertions.assertTrue(toolBar.profileInfoButton.isControlDisplayed(), "ERROR, no se pudo hacer el login");
        Thread.sleep(2000);




    }
}

package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class CRUDProject extends BaseTodoLy{

    String nombre="Luciano";
    String nombreNuevo="LucianoNuevo";
    MainPage mainPage= new MainPage();
    LoginPage loginPage = new LoginPage();
    LeftMenu leftMenu = new LeftMenu();
    EditProjectModal editProjectModal = new EditProjectModal();
    DeleteModal deleteModal = new DeleteModal();
    ToolBar toolBar = new ToolBar();
    @Test
    public void verifyCRUDTodo() throws InterruptedException {
        mainPage.settingsButton.click();
        loginPage.email.setText("erickmallea1234@gmail.com");
        loginPage.password.setText("lucianopaniagua");
        loginPage.submitButton.click();
        Assertions.assertTrue(toolBar.profileInfoButton.isControlDisplayed(), "ERROR, no se pudo hacer el login");
        Thread.sleep(5000);

        //Create
        leftMenu.addNewProject.click();
        editProjectModal.editNameProjectInput.setText(nombre);
        editProjectModal.submit.click();
        Assertions.assertTrue(leftMenu.projectVerifyNameControl.isControlDisplayed(),"Error");
        Thread.sleep(3000);


        //Update
        leftMenu.lastProject.click();
        leftMenu.menuProjectOptions.click();
        leftMenu.editProject.click();
        editProjectModal.editNameProjectInput.clearSetText(nombreNuevo);
        editProjectModal.submit.click();
        Thread.sleep(3000);
        Assertions.assertTrue(leftMenu.projectVerifyNewNameControl.isControlDisplayed(),"Error");

        //Delete
        leftMenu.lastProjectUpdated.click();
        leftMenu.menuProjectOptions.click();
        leftMenu.deleteProjectButton.click();
        deleteModal.deleteSubmitButton.click();
        Assertions.assertFalse(leftMenu.projectNameShouldNotExist.isControlDisplayed(),"********Error: ");
        //ESTA VERIFICACION TARDA UN MOMENTO PERO LOGRA EJECUTARSE


    }
}

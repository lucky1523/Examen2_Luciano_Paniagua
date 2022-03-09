package pages;

import control.Button;
import control.Control;
import org.openqa.selenium.By;

public class LeftMenu {


    String nombre="Luciano";
    String nombreNuevo="LucianoNuevo";
    public Button addNewProject = new Button(By.xpath("//button[@class=\"adder_icon\"]"));
    public Button menuProjectOptions = new Button(By.xpath("//div[@class=\"reactist collapse collapse--entered\"]//li[last()]//button"));
    public Button lastProject = new Button(By.xpath("//li[last()]//span[text()=\""+nombre+"\"]"));
    public Control projectVerifyNameControl = new Control(By.xpath("//li[last()]//span[text()='"+ nombre+"']"));

    public Button lastProjectUpdated = new Button(By.xpath("//li[last()]//span[text()=\""+nombreNuevo+"\"]"));
    public Button editProject = new Button(By.xpath("//div[text()=\"Editar proyecto\"]"));
    public Button deleteProjectButton = new Button(By.xpath("//div[text()=\"Eliminar proyecto\"]"));
    public Control projectVerifyNewNameControl = new Control(By.xpath("//li[last()]//span[text()='"+ nombreNuevo+"']"));

    public Control projectNameShouldNotExist = new Control(By.xpath("//li[last()]//span[text()='"+ nombreNuevo+"']"));

    public String getNombreNuevo(){
        return this.nombreNuevo;
    }


}

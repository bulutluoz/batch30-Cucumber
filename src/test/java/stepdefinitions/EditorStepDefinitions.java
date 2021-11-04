package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPage;
import utilities.Driver;

public class EditorStepDefinitions {
    EditorPage editorPage=new EditorPage();
    Actions actions=new Actions(Driver.getDriver());

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButton.click();
    }
    @Then("editor firstname kutusuna {string} bilgileri girer")
    public void editor_firstname_kutusuna_bilgileri_girer(String firstname) {
        editorPage.firstName.sendKeys(firstname);
    }
    @Then("editor lastname kutusuna {string} bilgileri girer")
    public void editor_lastname_kutusuna_bilgileri_girer(String lastname) {
        editorPage.lastName.sendKeys(lastname);
    }
    @Then("editor position kutusuna {string} bilgileri girer")
    public void editor_position_kutusuna_bilgileri_girer(String position) {
        editorPage.position.sendKeys(position);
    }
    @Then("editor office kutusuna {string} bilgileri girer")
    public void editor_office_kutusuna_bilgileri_girer(String office) {
        editorPage.office.sendKeys(office);
    }
    @Then("editor extension kutusuna {string} bilgileri girer")
    public void editor_extension_kutusuna_bilgileri_girer(String extension) {
        editorPage.extension.sendKeys(extension);
    }
    @Then("editor startdate kutusuna {string} bilgileri girer")
    public void editor_startdate_kutusuna_bilgileri_girer(String startDate) {
        editorPage.startDate.sendKeys(startDate);
    }
    @Then("editor salary kutusuna {string} bilgileri girer")
    public void editor_salary_kutusuna_bilgileri_girer(String salary) {
        editorPage.salary.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.createButton.click();
    }


    @And("ilgili kutulara {string}  {string}  {string}  {string}  {string} {string} {string} bilgilerini girer")
    public void ilgiliKutularaBilgileriniGirer(String firstname, String lastName, String position, String office, String extension, String startDate, String salary) {

        actions.
                sendKeys(firstname).
                sendKeys(Keys.TAB).
                sendKeys(lastName).
                sendKeys(Keys.TAB).
                sendKeys(position).
                sendKeys(Keys.TAB).
                sendKeys(office).
                sendKeys(Keys.TAB).
                sendKeys(extension).
                sendKeys(Keys.TAB).
                sendKeys(startDate).
                sendKeys(Keys.TAB).
                sendKeys(salary).
                click(editorPage.createButton).perform();



    }

    @Then("{string} ve {string} girerek kaydin tamamlandigini test eder")
    public void veGirerekKaydinTamamlandiginiTestEder(String firstname, String lastname) {


    }
}

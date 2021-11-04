package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CHQAPage;

public class CHQAStepDefinitions {

    CHQAPage chqaPage=new CHQAPage();

    @Then("CH login linkine tiklar")
    public void ch_login_linkine_tiklar() {
        chqaPage.loginLinki.click();
    }
    @Then("CH username kutusuna {string} yazar")
    public void ch_username_kutusuna_yazar(String kullaniciAdi) {
        chqaPage.usernameKutusu.sendKeys(kullaniciAdi);

    }
    @Then("CH password kutusuna {string} yazar")
    public void ch_password_kutusuna_yazar(String sifre) {
        chqaPage.passwordKutusu.sendKeys(sifre);
    }
    @Then("CH login butonuna basar")
    public void ch_login_butonuna_basar() {
        chqaPage.loginButonu.click();
    }
    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(chqaPage.girisYapilamadiYazisiElementi.isDisplayed());

    }

    @Then("CH basarili giris yapildigini test eder")
    public void chBasariliGirisYapildiginiTestEder() {

        Assert.assertTrue(chqaPage.girisYapildiKontrolYazi.isDisplayed());
    }
}

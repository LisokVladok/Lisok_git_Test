package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class QaAutotests extends BaseTest{

    MainPage mainPage = new MainPage();
    @Test
    public  void CheckLoginFromTitle() {
        mainPage.open();
        mainPage.clickSignInBtn();
        mainPage.checkLoginFormTitle("Log in");
    }
    @Test
    public  void CheckLogin() {
        mainPage.open()
                .clickSignInBtn()
                .checkLoginFormTitle("Log in")
                .setEmail("liso4ekvlado4ek@gmail.com")
                .setPassword("83a1KRhZz7")
                .clickLoginBtn()
                .checkMyProfile("My profile");
    }
    @Test
    public void checkAddCar() {
        new MainPage().open()
                .clickSignInBtn()
                .checkLoginFormTitle("Log in")
                .setEmail("liso4ekvlado4ek@gmail.com")
                .setPassword("83a1KRhZz7")
                .clickLoginBtn()
                .checkAddCar("Add car");
    }
    @Test
    public void checkFuel() {
        new MainPage().open()
                .clickSignInBtn()
                .checkLoginFormTitle("Log in")
                .setEmail("liso4ekvlado4ek@gmail.com")
                .setPassword("83a1KRhZz7")
                .clickLoginBtn()
                .checkFuelexpenses("Fuel expenses");
    }
    @Test
    public void checkGarage() {
        new MainPage().open()
                .clickSignInBtn()
                .checkLoginFormTitle("Log in")
                .setEmail("liso4ekvlado4ek@gmail.com")
                .setPassword("83a1KRhZz7")
                .clickLoginBtn()
                .checkCarage("Garage");
    }

}

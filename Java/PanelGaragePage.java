package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PanelGaragePage {


    private SelenideElement myProfile = $("#userNavDropdown");
    private SelenideElement AddCar = $(" .d-flex.justify-content-between > button");
    private SelenideElement  Settings = $(".col-3.d-none.d-lg-block.sidebar-wrapper > nav > a:nth-child(2)");
    private SelenideElement Carage = $(" a.btn.btn-white.btn-sidebar.sidebar_btn.-active");

    public PanelGaragePage checkMyProfile(String profileText) {
        myProfile.shouldHave(Condition.text(profileText));
        return this;
    }
    public PanelGaragePage checkAddCar(String profileText) {
        AddCar.shouldHave(Condition.text(profileText));
        return this;
    }
    public PanelGaragePage checkFuelexpenses(String profileText){
        Settings.shouldHave(Condition.text(profileText));
        return this;
    }
    public PanelGaragePage checkCarage(String profileText){
        Carage.shouldHave(Condition.text(profileText));
        return this;
    }

}

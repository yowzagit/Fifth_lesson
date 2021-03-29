import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AnnotatedStepsPage {

    String siteName = "https://github.com/",
            tab = "Issues";

    @Step
    public void openMainPage() {
        open(siteName);
    }

    @Step
    public void searchForRepository(String repository){
        $(byName("q")).setValue(repository).pressEnter();
    }

    @Step
    public void goToRepository(String repository){
        $(byLinkText(repository)).click();
    }

    @Step
    public void clickOnIssueTab(){
        $(withText(tab)).click();
    }

    @Step
    public void shouldSeeIssueWithNumber(int issueNumber){
        $(withText("#" + issueNumber)).should(Condition.exist);
    }
}

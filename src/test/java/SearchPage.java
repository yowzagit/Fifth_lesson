import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPage {
    String siteName = "https://github.com/",
            repository = "eroshenkoam/allure-example",
            tab = "Issues";
    Integer issueNumber = 68;


    public SearchPage openPage() {
        open(siteName);

        return this;
    }

    public SearchPage inputSearch() {
        $(byName("q")).setValue(repository).pressEnter();

        return this;
    }

    public SearchPage goToRepo() {
        $(byLinkText(repository)).click();

        return this;
    }

    public SearchPage goToIssue() {
        $(withText(tab)).click();

        return this;
    }

    public SearchPage issueVer() {
        $(withText("#" + issueNumber)).should(Condition.exist);

        return this;
    }

}

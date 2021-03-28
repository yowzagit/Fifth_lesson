import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchIssuePage {
    String siteName = "https://github.com/",
            repository = "eroshenkoam/allure-example",
            tab = "Issues";
    Integer issueNumber = 68;


    public SearchIssuePage openPage() {
        open(siteName);

        return this;
    }

    public SearchIssuePage inputSearch() {
        $(byName("q")).setValue(repository).pressEnter();

        return this;
    }

    public SearchIssuePage goToRepo() {
        $(byLinkText(repository)).click();

        return this;
    }

    public SearchIssuePage goToIssue() {
        $(withText(tab)).click();

        return this;
    }

    public SearchIssuePage issueVer() {
        $(withText("#" + issueNumber)).should(Condition.exist);

        return this;
    }

}

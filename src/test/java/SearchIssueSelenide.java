import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchIssueSelenide {
    String site = "https://github.com/",
            repository = "eroshenkoam/allure-example",
            element = "Issues";
    Integer ISSUE_NUMBER = 68;

    @Test
    void selenideSearchTest() {
        open(site);
        $(byName("q")).setValue(repository).pressEnter();
        $(byLinkText(repository)).click();
        $(withText(element)).click();
        $(withText("#" + ISSUE_NUMBER)).should(Condition.exist);
    }
}

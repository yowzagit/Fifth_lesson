import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SelenideSearch {

    SearchPage searchPage = new SearchPage();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void searchIssueSelenide() {
        searchPage
                .openPage()
                .inputSearch()
                .goToRepo()
                .goToIssue()
                .issueVer();
    }
}

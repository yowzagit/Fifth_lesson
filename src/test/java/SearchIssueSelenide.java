import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SearchIssueSelenide {

    SearchIssuePage searchIssuePage = new SearchIssuePage();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void searchIssueSelenide() {
        searchIssuePage
                .openPage()
                .inputSearch()
                .goToRepo()
                .goToIssue()
                .issueVer();
    }
}

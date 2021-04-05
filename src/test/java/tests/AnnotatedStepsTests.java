package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.AnnotatedStepsPage;

public class AnnotatedStepsTests {

    private final static String repository = "eroshenkoam/allure-example";
    private final static int issueNumber = 68;

    private AnnotatedStepsPage steps = new AnnotatedStepsPage();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    public void testSearch() {
        steps.openMainPage();
        steps.searchForRepository(repository);
        steps.goToRepository(repository);
        steps.clickOnIssueTab();
        steps.shouldSeeIssueWithNumber(issueNumber);
    }
}

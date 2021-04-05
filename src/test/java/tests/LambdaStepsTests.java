package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.SearchPage;

import static io.qameta.allure.Allure.step;

public class LambdaStepsTests {
    SearchPage searchPage = new SearchPage();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void searchIssueStepsAllure() {
        step("Открываем главную страницу", () -> {
            searchPage.openPage();
        });
        step("Вводим в поиск название репозитория", () -> {
            searchPage.inputSearch();
        });
        step("Переходим в репозиторий", () -> {
            searchPage.goToRepo();
        });
        step("Переходим в таб Issue", () -> {
            searchPage.goToIssue();
        });
        step("Проверяем значение Issue", () -> {
            searchPage.issueVer();
        });

    }
}


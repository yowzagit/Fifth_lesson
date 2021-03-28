import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class SearchIssueSteps {
    SearchIssuePage searchIssuePage = new SearchIssuePage();

    @Test
    void SearchIssueStepsAllure() {
        step("Открываем главную страницу", () -> {
            searchIssuePage.openPage();
        });
        step("Вводим в поиск название репозитория", () -> {
            searchIssuePage.inputSearch();
        });
        step("Переходим в репозиторий", () -> {
            searchIssuePage.goToRepo();
        });
        step("Переходим в таб Issue", () -> {
            searchIssuePage.goToIssue();
        });
        step("Проверяем значение Issue", () -> {
            searchIssuePage.issueVer();
        });

    }
}


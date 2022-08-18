package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Fix price test")
    void generatedTest() {
        step("open 'https://fix-price.com/'", () -> {
            step("// todo: just add selenium action");
        });

        step("click on login button", () -> {
            step("// todo: just add selenium action");
        });

        step("login modal should be visible", () -> {
            step("// todo: just add selenium action");
        });

        step("click on 'корзина' button", () -> {
            step("// todo: just add selenium action");
        });

        step("text 'Выберите способ получения заказа' shoud be visible", () -> {
            step("// todo: just add selenium action");
        });

        step("click on 'Карта Fix Price' button", () -> {
            step("// todo: just add selenium action");
        });

        step("click on 'Зарегистрировать карту' button", () -> {
            step("// todo: just add selenium action");
        });

        step("phone number enter modal should appear", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://fix-price.com/'", () ->
            open("https://fix-price.com/"));

        step("Page title should have text 'Интернет-магазин Fix Price'", () -> {
            String expectedTitle = "Интернет-магазин Fix Price";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://fix-price.com/'", () ->
            open("https://fix-price.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
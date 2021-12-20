
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта DNS
 */
public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@name='q']");

    public MainPage(String url){
        Selenide.open(url);
    }

    /**
     * Выполняется поиск среди товаров на сайте и нажимается кнопка Enter
     * @param searchString
     */
    public void clickOnSearch(String searchString){
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);

    }


}

import org.junit.Assert;
import org.junit.Test;

public class logic extends BaseTest{
    private final static String BASE_URL = "https://www.dns-shop.ru/compare/";
    private final static String SEARCH_STRING = "Защитное стекло для Apple iphone 13/13 Pro";
    private final static String EXPECTED_WORD = "iphone-13";

    @Test
    public void checkHrefArticle(){
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.clickOnSearch(SEARCH_STRING);
        SearchPage searchPage = new SearchPage();
        String href = searchPage.getHrefFromFirstArticle();
        Assert.assertTrue(href.contains("Защитное стекло для Apple iphone 13/13 Pro"));
    }




}

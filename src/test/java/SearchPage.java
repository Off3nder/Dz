import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    private final ElementsCollection articalTitles = $$x("<input class=\"ui-input-search__input ui-input-search__input_presearch\" name=\"q\" value=\"\" type=\"search\" placeholder=\"Поиск по сайту\" autocomplete=\"off\">");

    public String getHrefFromFirstArticle(){
       return articalTitles.first().getAttribute("href");

    }




}

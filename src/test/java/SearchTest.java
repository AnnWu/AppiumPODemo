import org.junit.Test;
import pages.MainPage;
import pages.MySearchPage;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchTest {
    @Test
    public void searchTest01(){
        MainPage mainPage=MainPage.start();
        MySearchPage mySearchPage=mainPage.gotoSearchPage();
        mySearchPage.searchGupiao("pdd");
        assertThat(mySearchPage.getFirtGupiaoName(),equalTo("拼多多"));
    }
}

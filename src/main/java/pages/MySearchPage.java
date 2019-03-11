package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MySearchPage extends BasePage{
    private By searchtext = By.id("search_input_text");
    private By first = By.xpath("//*[@resource-id='com.xueqiu.android:id/ll_stock_result_view']//*[@resource-id='com.xueqiu.android:id/stockName']");
    //String firtGupiaoName;
    public void searchGupiao(String name){
        find(searchtext).sendKeys(name);
    }
    public String getFirtGupiaoName(){
        List <WebElement> webElements = (ArrayList<WebElement>) Driver.getCurrentDriver().findElements(first);
        System.out.println(webElements.get(0).getText());
        return webElements.get(0).getText();
        //return find(first).getText();
    }
}

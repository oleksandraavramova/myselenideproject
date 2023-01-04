import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Yasnotest {
    public Yasnotest() {
    }

    @Test
    public void checkLogo() {
        Selenide.open("https://kyiv.yasno.com.ua/");
        Selenide.$(By.xpath("//*[@id='header']/div[1]/div/a[1]")).shouldBe(new Condition[]{Condition.visible});
    }

    @Test
    public void checkHeaderButton() {
        Selenide.open("https://kyiv.yasno.com.ua/");
        Selenide.$(By.xpath("//*[@id='header']/div[2]/div/a")).click();
        Selenide.$(By.xpath("//*[@id='header']/div[2]/div/a")).shouldHave(new Condition[]{Condition.attribute("https://kyiv.yasno.com.ua/LK")});
    }

    @Test
    public void checkSearchField() {
        Selenide.open("https://kyiv.yasno.com.ua/");
        Selenide.$(By.xpath("//*[@id='header']//input")).click();
        Selenide.$(By.xpath("//*[@id='header']//input")).shouldHave(new Condition[]{Condition.type("text")});
    }

    @Test
    public void checkTopButtonMenu() {
        Selenide.open("https://kyiv.yasno.com.ua/");
        Selenide.$(By.xpath("//*[@id='header']/div[1]/div/button/img")).isDisplayed();
        Selenide.$(By.xpath("//*[@id='header']/div[1]/div/button/img")).shouldBe(new Condition[]{Condition.image});
    }

    @Test
    public void checkMenuButton() {
        Selenide.open("https://kyiv.yasno.com.ua/");
        Selenide.$(By.xpath("//div[@class = 'main-menu']//span[contains(text(), 'Електроенергія')]")).click();
        Selenide.$(By.xpath("//div[@class = 'main-menu']//span[contains(text(), 'Електроенергія')]")).shouldHave(new Condition[]{Condition.exist});
    }

    @Test
    public void checkTileDisplayed() {
        Selenide.open("https://kyiv.yasno.com.ua/");
        Selenide.$(By.xpath("//a[contains(@href,'payment-by-address')]")).click();
        Selenide.$(By.xpath("//a[contains(@href,'payment-by-address')]")).shouldBe(new Condition[]{Condition.attribute("https://yasno.com.ua/payment-by-address")});
    }
}

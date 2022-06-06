package lib.ui;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartPageObject extends MainPageObject
{

    private static final String
        START_TV_TITLE = "ru.sravni.android.bankproduct.debug:id/tvTitle",
        START_TV_MESSAGE = "ru.sravni.android.bankproduct.debug:id/tvMessage",
        CLICK_BUTTON = "ru.sravni.android.bankproduct.debug:id/btnNextButton",
        TITLE_PHONE = "ru.sravni.android.bankproduct.debug:id/tvTitlePhone",
        TITLE_PHONE_DESC = "ru.sravni.android.bankproduct.debug:id/tvDescriptionPhone",
        ET_PHONE = "ru.sravni.android.bankproduct.debug:id/etPhone",
        SEND_CODE = "//*[contains(@text,'ПОЛУЧИТЬ КОД')]",
        TITLE_SMS = "ru.sravni.android.bankproduct.debug:id/tvTitleSms",
        TITLE_SMS_DESC = "ru.sravni.android.bankproduct.debug:id/tvDescriptionSms",
        ET_SMS = "ru.sravni.android.bankproduct.debug:id/etSmsCode",
        MAIN_TITLE = "ru.sravni.android.bankproduct.debug:id/title";

    public StartPageObject(AppiumDriver driver)
    {
        super(driver);
    }

    public void promoElementTitle(String title)
    {
        WebElement promo_title =  waitForElementPresent(
                By.id(START_TV_TITLE),
                "Не найден элемент заголовка"
        );

        String article_title = promo_title.getText();
        Assert.assertEquals(
                "Не найден заголовок",
                title,
                article_title
        );
    }

    public void promoElementMessage(String message) {

        WebElement promo_message = waitForElementPresent(
                By.id(START_TV_MESSAGE),
                "Не найден элемент описания"
        );
        String article_message = promo_message.getText();
        Assert.assertEquals(
                "Не найдено описание",
                message,
                article_message
        );

    }
    public void mainElementTitle(String message)
    {

        WebElement promo_message =  waitForElementPresent(
                By.id(MAIN_TITLE),
                "Не найден элемент ГЛАВНАЯ"
        );
        String article_message = promo_message.getText();
        Assert.assertEquals(
                "Не найдено ГЛАВНАЯ",
                message,
                article_message
        );

    }
    public void promoClickButton(String button)
    {
        WebElement promo_button =  waitForElementPresent(
                By.id(CLICK_BUTTON),
                "Не найден элемент кнопки"
        );
        String article_button = promo_button.getText();
        Assert.assertEquals(
                "Не найдена кнопка",
                button,
                article_button
        );
        this.waitForElementAndClick(By.id(CLICK_BUTTON),"Не удалось нажать на кнопку");
    }

    public void phoneElementTitle(String title)
    {
        WebElement promo_title =  waitForElementPresent(
                By.id(TITLE_PHONE),
                "Не найден элемент заголовка"
        );

        String article_title = promo_title.getText();
        Assert.assertEquals(
                "Не найден заголовок",
                title,
                article_title
        );
    }

    public void phoneElementMessage(String message)
    {

        WebElement promo_message =  waitForElementPresent(
                By.id(TITLE_PHONE_DESC),
                "Не найден элемент описания"
        );
        String article_message = promo_message.getText();
        Assert.assertEquals(
                "Не найдено описание",
                message,
                article_message
        );
    }
    public void writePhone(String phone)
    {
        this.waitForElementAndSendKeys(By.id(ET_PHONE), phone,"Номер не введен");
    }

    public void sendPhone()
    {
        this.waitForElementAndClick(By.xpath(SEND_CODE),"СМС не отправлено");
    }

    public void smsElementTitle(String title)
    {
        WebElement promo_title =  waitForElementPresent(
                By.id(TITLE_SMS),
                "Не найден элемент заголовка"
        );

        String article_title = promo_title.getText();
        Assert.assertEquals(
                "Не найден заголовок",
                title,
                article_title
        );
    }

    public void smsElementMessage(String message)
    {

        WebElement promo_message =  waitForElementPresent(
                By.id(TITLE_SMS_DESC),
                "Не найден элемент описания"
        );
        String article_message = promo_message.getText();
        Assert.assertEquals(
                "Не найдено описание",
                message,
                article_message
        );
    }
    public void writeSMS(String phone)
    {
        this.waitForElementAndSendKeys(By.id(ET_SMS), phone,"СМС не введен");
    }

    public void promoSwipe(String Swipe_element)
    {
        this.swipeElementToLeft(By.xpath(Swipe_element),"Свайп не удался");
    }

    public void LogOut()
    {
        this.waitForElementAndClick(By.id("ru.sravni.android.bankproduct.debug:id/actionProfile"),"");
        this.waitForElementAndClick(By.id("ru.sravni.android.bankproduct.debug:id/arrow"),"");
        this.swipeUpToFindElement(By.xpath("//*[contains(@text,'Выход')]"),"",1);
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Выход')]"),"");
        this.waitForElementAndClick(By.id("android:id/button1"),"");
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/tvTitlePhone"),"");

    }

}

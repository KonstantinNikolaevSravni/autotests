package lib.ui;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartPageObject extends MainPageObject
{

    private static final String


        ELEMENT_TEXT = "//*[contains(@text,'{SUBSTRING}')]",
        TITLE_PHONE = "ru.sravni.android.bankproduct.debug:id/tvTitlePhone",
        TITLE_PHONE_DESC = "ru.sravni.android.bankproduct.debug:id/tvDescriptionPhone",
        ET_PHONE = "ru.sravni.android.bankproduct.debug:id/etPhone",
        SEND_CODE = "//*[contains(@text,'ПОЛУЧИТЬ КОД')]",
        TITLE_SMS = "ru.sravni.android.bankproduct.debug:id/tvTitleSms",
        TITLE_SMS_DESC = "ru.sravni.android.bankproduct.debug:id/tvDescriptionSms",
        ET_SMS = "ru.sravni.android.bankproduct.debug:id/etSmsCode",
        MAIN_TITLE = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View";

    public StartPageObject(AppiumDriver driver)
    {
        super(driver);
    }


    public void AuthCredit(String PhoneNumber, String SMSCode)
    {
        writePhone(PhoneNumber);
        sendPhone();
        writeSMS(SMSCode);
        findOneElement("Главная");
    }

    private static String getTextInXpath (String substring) {
        return ELEMENT_TEXT.replace("{SUBSTRING}", substring);
    }

    public void promoScreen(String title, String description)
    {
        String promo = getTextInXpath(title);
        this.waitForElementPresent(By.xpath(promo), "Не найден заголовок промо " + title, 5);

        String promo_desc = getTextInXpath(description);
        this.waitForElementPresent(By.xpath(promo_desc), "Не найдено описание промо " + description, 5);
    }

    public void pressButton(String button) throws InterruptedException {

        String Button_Next = getTextInXpath(button);
        this.waitForElementAndClick(By.xpath(Button_Next),"Не могу найти " + button,5);

        Thread.sleep(3000);
    }

    public void findOneElement(String text){

        String message = getTextInXpath(text);
        this.waitForElementPresent(By.xpath(message), "Не найден элемент " + text, 5);
    }

    public void findOneElementAndClick(String text){

        String message = getTextInXpath(text);
        this.waitForElementAndClick(By.xpath(message), "Не найден элемент " + text, 5);
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
        this.waitForElementAndClick(By.xpath(SEND_CODE),"СМС не отправлено",5);
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
        String Swipe_Next = getTextInXpath(Swipe_element);
        this.swipeElementToLeft(By.xpath(Swipe_Next),"Не могу найти " + Swipe_element);
    }

    public void LogOut()
    {
        this.waitForElementAndClick(By.id("ru.sravni.android.bankproduct.debug:id/actionProfile"),"",5);
        this.waitForElementAndClick(By.id("ru.sravni.android.bankproduct.debug:id/arrow"),"",5);
        this.swipeUpToFindElement(By.xpath("//*[contains(@text,'Выход')]"),"",1);
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Выход')]"),"",5);
        this.waitForElementAndClick(By.id("android:id/button1"),"",5);
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/tvTitlePhone"),"");

    }

}



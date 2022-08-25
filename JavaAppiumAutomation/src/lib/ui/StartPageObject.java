package lib.ui;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartPageObject extends MainPageObject
{

    private static final String

            START_TITLE = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]",
            START_DESCRIPTION = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]",
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
        StartPageObject StartPageObject = new StartPageObject(driver);
        StartPageObject.writePhone(PhoneNumber);
        StartPageObject.sendPhone();
        StartPageObject.writeSMS(SMSCode);
        StartPageObject.mainElementTitle("Главная");
    }
    public void promoScreen(String title, String description)
    {
        WebElement promo_title =  waitForElementPresent(
                By.xpath(START_TITLE),
                "Не найден элемент заголовка",
                15
        );

        String article_title = promo_title.getText();
        Assert.assertEquals(
                "Не найден заголовок",
                title,
                article_title
        );

        WebElement promo_description =  waitForElementPresent(
                By.xpath(START_DESCRIPTION),
                "Не найден элемент описания",
                15
        );

        String article_description = promo_description.getText();
        Assert.assertEquals(
                "Не найдено описание",
                description,
                article_description
        );
    }

    public void promoButtonNext() throws InterruptedException {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'ДАЛЕЕ')]"),"button next not found",5);
        Thread.sleep(3000);
    }

    public void promoButtonNextFinal() throws InterruptedException {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'НАЧНЁМ')]"),"button next not found",5);
        Thread.sleep(3000);
    }

    public void mainElementTitle(String message)
    {
        WebElement promo_message =  waitForElementPresent(
                By.xpath(MAIN_TITLE),
                "Не найден элемент ГЛАВНАЯ"
        );
        String article_message = promo_message.getText();
        Assert.assertEquals(
                "Не найдено ГЛАВНАЯ",
                message,
                article_message
        );
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
        this.swipeElementToLeft(By.xpath(Swipe_element),"Свайп не удался");
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



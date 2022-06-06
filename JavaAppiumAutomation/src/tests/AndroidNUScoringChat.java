package tests;

import lib.CoreCreditTestCase;
import lib.ui.CreditPageObject;
import lib.ui.MainPageObject;
import lib.ui.StartPageObject;
import org.junit.Test;

public class AndroidNUScoringChat extends CoreCreditTestCase {
    private lib.ui.MainPageObject MainPageObject;

    protected void setUp() throws Exception
    {
        super.setUp();

        MainPageObject = new MainPageObject(driver);
    }

    String PhoneNumber = "9575290403";
    String SMSCode = "1234";

    @Test
    public void testAuth()
    {
        StartPageObject StartPageObject = new StartPageObject(driver);

        StartPageObject.writePhone(PhoneNumber);
        StartPageObject.sendPhone();
        StartPageObject.writeSMS(SMSCode);
        StartPageObject.mainElementTitle("Главная");
    }

    @Test
    public void testCreditScoringChatNewUser()
    {
        lib.ui.CreditPageObject CreditPageObject = new CreditPageObject(driver);

        CreditPageObject.creditScoringMainAndClick();
        CreditPageObject.creditWriteEtMessageAndSendMessage("testprocessor.1234567890.200.3000@sravni.ru");
        CreditPageObject.creditWriteActvMessage("Николаев Константин Дмитриевич");
        CreditPageObject.creditSendMessage();
        // Ручной ввод паспорта
        CreditPageObject.creditManualScoring();
        // Дата рождения
        CreditPageObject.creditWriteEtMessageAndSendMessage("09.08.1990");
        // Паспорт
        CreditPageObject.creditWriteEtMessageAndSendMessage("5816258899");
        // Код подразделения
        CreditPageObject.creditWriteEtMessageAndSendMessage("600005");
        // Дата выдачи паспорта
        CreditPageObject.creditWriteEtMessageAndSendMessage("10.08.2020");
        // Кем выдан
        CreditPageObject.creditWriteEtMessageAndSendMessage("Отдел УФМС по Росии в г.Санкт-Петербург");
        // Место рождения
        CreditPageObject.creditWriteEtMessageAndSendMessage("г. Москва");
        // Адрес прописки
        CreditPageObject.creditWriteActvMessage("Ленина 45 8");
        CreditPageObject.creditReg();
        CreditPageObject.creditSendMessage();
        // Место жительства совпадает с регистрацией
        CreditPageObject.creditYesButton();
        // Все верно
        CreditPageObject.creditAllRight();
        // Кредитный рейтинг
        CreditPageObject.creditScoring();
    }

    @Test
    public void testLogOut()
    {
        StartPageObject StartPageObject = new StartPageObject(driver);
        StartPageObject.LogOut();
    }
}

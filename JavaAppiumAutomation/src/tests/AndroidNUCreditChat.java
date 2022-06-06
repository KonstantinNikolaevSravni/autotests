package tests;

import lib.CoreCreditTestCase;
import lib.ui.CreditPageObject;
import lib.ui.MainPageObject;
import lib.ui.StartPageObject;
import org.junit.Test;

public class AndroidNUCreditChat extends CoreCreditTestCase {
    private lib.ui.MainPageObject MainPageObject;

    protected void setUp() throws Exception
    {
        super.setUp();

        MainPageObject = new MainPageObject(driver);
    }

    String PhoneNumber = "9575503022";
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
    public void testCreditNewUser()
    {
        lib.ui.CreditPageObject CreditPageObject = new CreditPageObject(driver);
        CreditPageObject.creditBigButtonTap();
        CreditPageObject.creditParams();
        CreditPageObject.creditTap();
        CreditPageObject.creditNext();
        // ФИО
        CreditPageObject.creditWriteActvMessage("Николаев Константин Дмитриевич");
        CreditPageObject.creditSendMessage();
        // E - mail
        CreditPageObject.creditWriteEtMessageAndSendMessage("testprocessor.1234567890.200.3000@sravni.ru");
        // Местонахождение
        CreditPageObject.creditAutoCity();
        CreditPageObject.creditSendMessage();
        // Адрес прописки
        CreditPageObject.creditWriteActvMessage("Ленина 45 8");
        CreditPageObject.creditReg();
        CreditPageObject.creditSendMessage();
        // Дата прописки
        CreditPageObject.creditWriteEtMessageAndSendMessage("03.02.1995");
        // Место жительства совпадает с регистрацией
        CreditPageObject.creditYesButton();
        // Место рождения
        CreditPageObject.creditWriteEtMessageAndSendMessage("г. Москва");
        // Ручной ввод паспорта
        CreditPageObject.creditManualInput();
        // Дата рождения
        CreditPageObject.creditWriteEtMessageAndSendMessage("09.08.1990");
        // Паспорт
        CreditPageObject.creditWriteEtMessageAndSendMessage("5816258899");
        // Код подразделения
        CreditPageObject.creditWriteEtMessageAndSendMessage("600005");
        // Дата выдачи паспорта
        CreditPageObject.creditWriteEtMessageAndSendMessage("10.08.2021");
        // Кем выдан
        CreditPageObject.creditWriteEtMessageAndSendMessage("Отдел УФМС по Росии в г.Санкт-Петербург");
        // Место работы - не работаю
        CreditPageObject.creditNotWork();
        // Причина - Судья в отсавке
        CreditPageObject.creditRetiredJudge();
        //
        CreditPageObject.creditYesButton();
        // СНИЛС
        CreditPageObject.creditWriteEtMessageAndSendMessage("19124548471");
        // Образование
        CreditPageObject.creditEducation();
        // Доход
        CreditPageObject.creditWriteEtMessageAndSendMessage("120000");
        //
        CreditPageObject.creditIncome();
        // Доп номер
        CreditPageObject.creditWriteEtMessageAndSendMessage("79505005050");
        // Доп номер - мой номер
        CreditPageObject.creditMyPhone();
        // Семейное положение - холост
        CreditPageObject.creditSingle();
        // Дети до 18 - нет
        CreditPageObject.creditNoButton();
        CreditPageObject.creditFlat();
        // Перейти к результатам
        CreditPageObject.creditFinal();
        CreditPageObject.creditSavedSearch();
    }

    @Test
    public void testLogOut()
    {
        StartPageObject StartPageObject = new StartPageObject(driver);
        StartPageObject.LogOut();
    }
}

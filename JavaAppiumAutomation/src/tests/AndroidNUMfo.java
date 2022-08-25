package tests;

import lib.CoreTestCase;
import lib.ui.CreditPageObject;
import lib.ui.MainPageObject;
import lib.ui.StartPageObject;
import org.junit.Test;

public class AndroidNUMfo extends CoreTestCase {

    private lib.ui.MainPageObject MainPageObject;

    protected void setUp() throws Exception
    {
        super.setUp();

        MainPageObject = new MainPageObject(driver);
    }

    String PhoneNumber = "9575000050";
    String SMSCode = "1234";

    @Test
    public void testAuth()
        {
            lib.ui.StartPageObject StartPageObject = new StartPageObject(driver);

            StartPageObject.AuthCredit(PhoneNumber, SMSCode);
        }

    @Test
    public void testMfoFlow()
    {


    }
}


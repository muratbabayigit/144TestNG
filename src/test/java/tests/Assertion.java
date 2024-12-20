package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.babayigitPage;
import utilties.ConfigReader;
import utilties.Driver;

public class Assertion {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("babayigiturl"));
        babayigitPage obj=new babayigitPage();

        String expectedIcerik="Texting!";
        String actualTitle=Driver.getDriver().getTitle();

            String expectedUrl="https://www.babayigit.net/test/";
        String actualUrl=Driver.getDriver().getCurrentUrl();

       // Assert.assertTrue(actualTitle.contains(expectedIcerik));

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actualTitle.contains(expectedIcerik));
        softAssert.assertEquals(actualUrl,expectedUrl);
        Driver.quitDriver();
        softAssert.assertAll();




    }

}

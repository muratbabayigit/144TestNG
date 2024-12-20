package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.babayigitPage;
import utilties.ConfigReader;
import utilties.Driver;

public class NutellaSearch {
        @Test
            public void nutellaSearch(){
            Driver.getDriver().get(ConfigReader.getProperty("babayigiturl"));
            babayigitPage obj=new babayigitPage(); //bu obje page clasındaki locatelere ulaşmak içindir


            obj.searchBox.sendKeys("Nutella"+ Keys.ENTER);
        }
        @Test
            public void wiseSearch(){
            Driver.getDriver().get(ConfigReader.getProperty("babayigiturl"));
            babayigitPage obj=new babayigitPage(); //bu obje page clasındaki locatelere ulaşmak içindir


            obj.searchBox.sendKeys("Wise Quarter"+ Keys.ENTER);
        }
}

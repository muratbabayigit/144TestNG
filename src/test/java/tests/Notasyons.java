package tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Notasyons {

    @Test (priority = 300)
    public void Damra(){
        System.out.println("Damra methodu Çalıştı");
    }


    @Test @Ignore
    public void Feyzanur(){
        System.out.println("Feyzanur methodu Çalıştı");
    }

    @Test(priority = -1)
    public void Sara(){
        System.out.println("Sara methodu Çalıştı");
    }

    @Test (dependsOnMethods = "Damra")
    public void Ramazan(){
        System.out.println("Ramazan methodu Çalıştı");
    }
}

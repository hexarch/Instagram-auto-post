import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
public class instagram {
    public static class actionClass {
        public static void main(String[] args) throws InterruptedException, IOException, AWTException {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
            chromeOptions.setExperimentalOption("useAutomationExtension", false);
            chromeOptions.setHeadless(false);
            chromeOptions.addArguments("start-maximized"); // open Browser in maximized mode
            chromeOptions.addArguments("disable-infobars"); // disabling infobars
            chromeOptions.addArguments("--disable-extensions"); // disabling extensions
            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
            driver.get("https://www.instagram.com/");
            WebElement refsayisi = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")));
            refsayisi.sendKeys("kullanıcıadı");
            WebElement refsayisi1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")));
            refsayisi1.sendKeys("şifre");
            WebElement btn1111 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")));
            btn1111.click();
            int i;
            for (i = 172; i < 826; ) {
                WebElement btn31111 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[3]/div/button")));
                btn31111.click();
                Thread.sleep(3000);
                WebElement upload_file = driver.findElement(By.xpath("//html/body/div[8]/div[2]/div/div/div/div[2]/div[1]/form/input"));
                //Yüklenecek dosya yolu
                upload_file.sendKeys("C:\\Users\\artemis\\IdeaProjects\\untitled\\buyuk/a ("+i+").jpg");
                Thread.sleep(1000);
                i++;
                WebElement btn31111s = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[6]/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[3]/div/div[2]/div/button")));
                btn31111s.click();
                WebElement upload_files = driver.findElement(By.xpath("//html/body/div[6]/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[3]/div/div[1]/div/div/div/div[2]/form/input"));
                upload_files.sendKeys("C:\\Users\\artemis\\IdeaProjects\\untitled\\buyuk/a ("+i+").jpg");
                i++;
                WebElement btn31111cs = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[6]/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[4]")));
                btn31111cs.click();
                Thread.sleep(4000);
                WebElement btn31111sv = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[6]/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[3]/div/div[2]/div/button")));
                btn31111sv.click();
                WebElement upload_fil = driver.findElement(By.xpath("//html/body/div[6]/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[3]/div/div[1]/div/div/div/div[2]/form/input"));
                upload_fil.sendKeys("C:\\Users\\artemis\\IdeaProjects\\untitled\\buyuk/a ("+i+").jpg");
                Thread.sleep(1000);
                i++;
                WebElement btn31111sca = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[6]/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[3]/div/div[2]/div/button")));
                btn31111sca.click();
                WebElement btn31111sc = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[6]/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div/button")));
                btn31111sc.click();
                WebElement btn31111scs = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[6]/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[1]/div/button[1]")));
                btn31111scs.click();
                Thread.sleep(2000);
                WebElement b = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[6]/div[2]/div/div/div/div[1]/div/div/div[3]/div/button")));
                b.click();
                Thread.sleep(2000);
                WebElement b1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[6]/div[2]/div/div/div/div[1]/div/div/div[3]/div/button")));
                b1.click();
                Thread.sleep(2000);
                //Postun altına girilecek açıklama
                WebElement refsayisis = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[6]/div[2]/div/div/div/div[1]/div/div/div[3]/div/button")));
                refsayisis.sendKeys("" +
                        "36-37-38-39-40 Numara Aralığı\n" +
                        "www.laboss.net\n" +
                        "whatsapp Sipariş:0544 947 25 10\n" +
                        "Türkiye'nin Her Yerine Ücretsiz Kargo\n" +
                        " %100 Yerli Üretim\n" +
                        "Kapıda Kredi Kartı Yada Nakit Ödeme Seçeneği");
                Thread.sleep(2000);
                try {
                    WebElement b1s = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[6]/div[2]/div/div/div/div[1]/div/div/div[3]/div/button")));
                    b1s.click();
                }
                catch (Exception e )
                {
                }
                Thread.sleep(30000);
                WebElement b11s = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[6]/div[1]/button")));
                b11s.click();
            }
            Thread.sleep(12312312);
        }
    }

}
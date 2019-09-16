package Test_1OpenGoogle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.setProperty("webdriver.gecko.driver", "/home/mykola/seleniun/geckodiver/geckodriver.exe");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.google.com");
    }
}

public class TakeScreenshotTester {

    public static void main(String[] args) {
        RemoteWebDriver [] browsers = { new ChromeDriver(), new FirefoxDriver(), new SafariDriver() };
        for (WebDriver browser: browsers) {
        browser.close();
        browser.open();
        System.out.println(browser.getTitle());
         }

    }
}

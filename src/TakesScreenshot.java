public interface TakesScreenshot {
    void getScreenshot(); }

interface WebDriver {
    void open();
    void close();
    String getTitle();
}

interface RemoteWebDriver extends TakesScreenshot, WebDriver {
    void Navigate(); }

class ChromeDriver implements RemoteWebDriver {

    public void getScreenshot() {
        System.out.println("This is the Screenshot of Chrome");}
    public void open() {
        System.out.println("This is how to open app in Chrome");}
    public void close() {System.out.println("the app can be closed in Chrome");}
    public String getTitle() { String title="App title in Chrome";
        return title;}
    public void Navigate() {System.out.println("you can navigate in Chrome driver");}
}

class FirefoxDriver implements RemoteWebDriver {
    public void getScreenshot() { System.out.println("This is the Screenshot of Firefox");}
    public void open() { System.out.println("This is how to open app in Firefox");}
    public void close() { System.out.println("the app can be closed in Firefox");}
    public String getTitle() {String title="App title in Firefox";
        return title; }
    public void Navigate() {System.out.println("you can navigate in Firefox driver");}
}
class SafariDriver implements RemoteWebDriver {
    public void getScreenshot() {System.out.println("This is the Screenshot of Safari");}
    public void open() {System.out.println("This is how to open app in Safari");}
    public void close() {System.out.println("the app can be closed in Safari");}
    public String getTitle() { String title="App title in Safari"; return title; }
    public void Navigate() { System.out.println("you can navigate in Safari driver"); }
}


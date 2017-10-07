//package Patterns;
//
///**
// * Created by pavlo.balyuk on 10/4/2017.
// */
// public class LoginPage {
//        By usernameLocator = By.id("username");
//        By passwordLocator = By.id("passwd");
//        By loginButtonLocator = By.id("login");
//        By backButtonLocator = By.class(back-to-doo);
//
//        private final WebDriver driver;
//
//        public LoginPage(WebDriver driver) {
//            this.driver = driver;
//
//            if (!"Als Veranstalter anmelden".equals(driver.getTitle())) {
//                throw new IllegalStateException("This is not the login page");
//            }
//        }
//
//        public LoginPage typeUsername(String username) {
//            driver.findElement(usernameLocator).sendKeys(username);
//            return this;
//        }
//
//        public LoginPage typePassword(String password) {
//            driver.findElement(passwordLocator).sendKeys(password);
//            return this;
//        }
//
//        public HomePage submitLogin() {
//            driver.findElement(loginButtonLocator).submit();
//            return new HomePage(driver);
//        }
//
//        public LoginPage submitLoginExpectingFailure() {
//            driver.findElement(loginButtonLocator).submit();
//            return new LoginPage(driver);
//        }
//        public LoginPage backButton(){
//            driver.findElement(backButtonLocator).click();
//            return new HomePage(driver);
//        }
//
//        public HomePage loginAs(String username, String password) {
//            typeUsername(username);
//            typePassword(password);
//            return submitLogin();
//        }
//    }
//}
//Теперь чтобы всё работало корректно нам нужно инициализировать наш page object. Это выглядит так:
//        package org.openqa.selenium.example;
//
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.WebElement;
//        import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//        import org.openqa.selenium.support.PageFactory;
//
//public class UsingGoogleSearchPage {
//    public static void main(String[] args) {
//        WebDriver driver = new HtmlUnitDriver();
//
//        driver.get("http://www.google.com/");
//
//        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);
//
//        page.searchFor("Cheese");
//    }
//}
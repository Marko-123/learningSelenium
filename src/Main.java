
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://bvtest.school.cubes.rs/login");
        driver.manage().window().maximize();
        
        
        
        WebElement emailField = driver.findElement(By.name("email"));
        
        emailField.sendKeys("qa@cubes.rs");
        
        WebElement passwordField = driver.findElement(By.name("password"));
        
        passwordField.sendKeys("cubesqa");
        
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();
        
        WebElement signaturesLink = driver.findElement(By.linkText("Signatures"));
        signaturesLink.click();
        
        WebElement CategoriesLink = driver.findElement(By.partialLinkText("Cate"));
        CategoriesLink.click();
        
        //driver.quit();
        
        
    }
    
}

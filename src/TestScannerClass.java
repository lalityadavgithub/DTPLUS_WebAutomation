import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class TestScannerClass {
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a URL
        System.out.println("Enter a URL to test: ");
        String url = scanner.nextLine();

        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit.pmloyal\\drivers\\chromedriver-win64\\chromedriver.exe");

        // Create a new WebDriver object
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL provided by the user
        driver.get(url);

        // Close the WebDriver
        driver.quit();

        // Close the Scanner
        scanner.close();
    }
}


package org.example.schoology.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Courses {

	@FindBy(css = "a.create-course-btn")
	private WebElement createCourseBtn;

	private WebDriver driver;

	public Courses(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public CreateCoursePopup createCourseButton() {
		createCourseBtn.click();
		return new CreateCoursePopup(driver);
	}

	public void courseActions(String courseName) {
		String courseActions = "//span[text()='%s']/ancestor::li//div[@class='action-links-unfold ']";
		driver.findElement(By.xpath(String.format(courseActions, courseName))).click();
	}

	public void endProcess() {
		driver.quit();
	}
}

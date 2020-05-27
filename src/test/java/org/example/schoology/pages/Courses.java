package org.example.schoology.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Courses {

	private WebDriver driver;

	@FindBy(css = "a.create-course-btn")
	private WebElement createCourseButton;

	public Courses(WebDriver driver) {
		this.driver = driver;
	}

	public CreateCourse clickCreateCourseBtn(){
		createCourseButton.click();
		return new CreateCourse(driver);
	}

}

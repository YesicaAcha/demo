package org.example.schoology.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCoursePopup {

	@FindBy(css = "#edit-course-name")
	private WebElement courseNameWE;

	@FindBy(css = "#edit-section-name-1")
	private WebElement sectionField;

	@FindBy(css = "#edit-subject-area")
	private WebElement subjectAreaWE;

	@FindBy(css = "#edit-grade-level-range-start")
	private WebElement levelWE;

	@FindBy(css = "#edit-submit")
	private WebElement submit;

    private WebDriver driver;

    public CreateCoursePopup(WebDriver driver) {
        this.driver = driver;
		PageFactory.initElements(driver, this);
    }

    public void createCourse(String courseName, String sectionName, String subjectAreaOption, String levelOption) {
		courseNameWE.sendKeys(courseName);
		sectionField.clear();
		sectionField.sendKeys(sectionName);
		Select subjectArea = new Select(subjectAreaWE);
		subjectArea.selectByVisibleText(subjectAreaOption);
		Select level = new Select(levelWE);
		level.selectByVisibleText(levelOption);

		submit.click();
    }

}

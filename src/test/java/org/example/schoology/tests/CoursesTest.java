package org.example.schoology.tests;

import org.example.schoology.pages.*;
import org.junit.Test;

public class CoursesTest {

	@Test
	public void editCourse() {
		Login login = new Login();
		Home home = login.loginAs("carledriss+01@gmail.com", "P@ssw0rd");
		SubMenu subMenu = home.clickMenu("Courses");
		Courses courses = subMenu.clickMyCoursesLink();
		CreateCourse createCourse = courses.clickCreateCourseBtn();
		createCourse.createCourse("Test Course","Section", "Mathematics", "Undergraduate");
		subMenu = home.clickMenu("Courses");
		courses = subMenu.clickMyCoursesLink();
//
//		String courseActions = "//span[text()='%s']/ancestor::li//div[@class='action-links-unfold ']";
//		driver.findElement(By.xpath(String.format(courseActions, courseName))).click();
	}

}

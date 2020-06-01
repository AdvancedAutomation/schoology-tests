package org.example.schoology.tests;

import java.util.HashMap;
import java.util.Map;

import org.example.schoology.entities.Course;
import org.example.schoology.pages.CoursePage;
import org.example.schoology.pages.Courses;
import org.example.schoology.pages.CreateCoursePopup;
import org.example.schoology.pages.Home;
import org.example.schoology.pages.Login;
import org.example.schoology.pages.SubMenu;
import org.junit.Test;

public class CoursesTest {

	public static final String PREFIX_AT = "AT_";

	@Test
	public void editCourseTest() {
		// Given
		Login login = new Login();
		Home home = login.loginAs("carledriss+01@gmail.com", "P@ssw0rd");
		SubMenu subMenu = home.clickMenu("Courses");
		Courses courses = subMenu.clickMyCoursesLink();
		CreateCoursePopup createCoursePopup = courses.clickCreateCourseButton();
		String courseName = PREFIX_AT + "Test Course" + System.currentTimeMillis();

		Map<String, String> courseMap = new HashMap<>();
		courseMap.put("name", courseName);
		courseMap.put("section", "Section");
		courseMap.put("area", "Mathematics");
		courseMap.put("level", "Undergraduate");
		CoursePage coursePage = createCoursePopup.create(courseMap);

		// When
		subMenu = home.clickMenu("Courses");
		courses = subMenu.clickMyCoursesLink();
		courses.clickEditCourse(courseName);

	}

}

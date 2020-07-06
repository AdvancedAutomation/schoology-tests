package org.example.schoology.pages.courses;

import java.util.Map;

public class CreateCoursePopup extends AbstractCoursePopup {

	public CoursePage create(Map<String, String> courseMap){
		fill(courseMap);
		submitButton.click();
		return new CoursePage();
	}
}
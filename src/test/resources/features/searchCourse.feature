Feature: Search

  @searchCourse @softAssert
  Scenario: Search a course
    Given I log in as "Instructor01" user
    And I create a course with:
      | Course Name  | EdgarSearchTest |
      | Section Name | New Section     |
      | Subject Area | Mathematics     |
      | Level        | Undergraduate   |
    When I search "EdgarSearchTest" course
    Then I navigate to "Courses"
    And I should see the "New Section" section on "EdgarSearchTest" course item
    And I assert all


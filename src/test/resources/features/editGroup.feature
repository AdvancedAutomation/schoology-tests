Feature: Groups

  Scenario: Edit a Group
    Given I log in as "Instructor01" user
    And I create a group with:
      | name | FirstGroup |
      | description | Description01 |
      | privacy | Group |
      | access | Open |
      | category | Musical Groups |
    When I navigate to "Groups"
    And I edit the "FirstGroup" group with:
      | name | FirstGroupEdited |
      | description | Description01Edited |
      | code | CodeEdited20 |
      | privacy | No One |
      | access | Allow Requests |
      | category | Faculty Groups |
    Then I should see the "FirstGroupEdited has been saved." message
    And I should see the "FirstGroupEdited" group name

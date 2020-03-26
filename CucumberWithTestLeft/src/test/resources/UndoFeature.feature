Feature: Run the "Undo" command using hotkeys
  In order to check the undo functionality
  As a user
  I want Notepad to run the "Undo" command using the hotkeys Ctrl + z

 Scenario: Run the "Undo" command using hotkeys
    Given I open Notepad
    And there is no text in Notepad
    When I type "Some text"
    And I press [Ctrl + z]
    Then I should see no text in Notepad
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/UndoFeature.feature");
formatter.feature({
  "name": "Run the \"Undo\" command using hotkeys",
  "description": "  In order to check the undo functionality\n  As a user\n  I want Notepad to run the \"Undo\" command using the hotkeys Ctrl + z",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Run the \"Undo\" command using hotkeys",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I open Notepad",
  "keyword": "Given "
});
formatter.match({
  "location": "UndoFeatureSteps.i_open_Notepad()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is no text in Notepad",
  "keyword": "And "
});
formatter.match({
  "location": "UndoFeatureSteps.there_is_no_text_in_Notepad()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Some text\"",
  "keyword": "When "
});
formatter.match({
  "location": "UndoFeatureSteps.i_type(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press [Ctrl + z]",
  "keyword": "And "
});
formatter.match({
  "location": "UndoFeatureSteps.i_press_Ctrl_z()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see no text in Notepad",
  "keyword": "Then "
});
formatter.match({
  "location": "UndoFeatureSteps.i_should_see_no_text_in_Notepad()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/co/natoora/resources/featurefile/home.feature");
formatter.feature({
  "line": 1,
  "name": "Natoor page functionality",
  "description": "As a user\r\nI want to navigate to Natoor website",
  "id": "natoor-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18643488400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to events page successfully",
  "description": "",
  "id": "natoor-page-functionality;user-should-navigate-to-events-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on community link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on  events",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see events page",
  "keyword": "Then "
});
formatter.match({
  "location": "EventsSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 513185600,
  "status": "passed"
});
formatter.match({
  "location": "EventsSteps.iClickOnCommunityLink()"
});
formatter.result({
  "duration": 824589000,
  "status": "passed"
});
formatter.match({
  "location": "EventsSteps.iClickOnEvents()"
});
formatter.result({
  "duration": 605907400,
  "status": "passed"
});
formatter.match({
  "location": "EventsSteps.iShouldSeeEventsPage()"
});
formatter.result({
  "duration": 43900,
  "status": "passed"
});
formatter.after({
  "duration": 1764852900,
  "status": "passed"
});
});

@Test
Feature: Login
  @Test
  Scenario: Test login with credentials
    Given that i am on the "live" environment
    And I log in using "valid" as username and "valid" credentials
    Then i "will" be redirected to news feed

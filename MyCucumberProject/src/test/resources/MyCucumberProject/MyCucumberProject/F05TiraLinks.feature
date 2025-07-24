@AllLinks
Feature: Test links on Tirabeauty site

  Background: 
    Given Open the site "https://www.tirabeauty.com/"

  @MakeupLink
  Scenario: To validate Makeup Link
    When I Click on Makeup Link
    Then Makepup page should display

  @SkinLink
  Scenario: To validate Skin Link
    When I Click on Skin Link
    Then Skin page should display

  @MenLink
  Scenario: To validate Men Link
    When I Click on Men Link
    Then Men page should display

  @MomLink
  Scenario: To validate Mom & Baby Link
    When I Click on Mom & Baby Link
    Then Mom & Baby page should display

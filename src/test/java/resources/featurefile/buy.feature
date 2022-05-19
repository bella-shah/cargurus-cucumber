@Smoke
Feature: Search functionality
  As a user, I want to check search functionality of Carsguide website


  Scenario: Search the used car with model
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab
    And I click 'Used' used car link
    Then I navigate to "Used Cars For Sale" used car page


  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab
    And I click 'Search Cars' link
    Then I navigate to "New and Used Car Search" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      | make       | model     | location     | price   |
      | BMW        | X3        | Any Location | $50,000 |
      | Kia        | Niro      | QLD - All    | $90,000 |
      | Jeep       | Wrangler  | WA - All     | $50,000 |
      | Volkswagen | Polo      | NSW - All    | $60,000 |
      | Tesla      | Model S   | Any Location | $80,000 |
      | Mitsubishi | Outlander | NT - All     | $90,000 |

  @test1
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab
    And I click 'Used' used car link
    Then I navigate to "Used Cars For Sale" used car page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      | make       | model     | location     | price   |
      | BMW        | X3        | Any Location | $50,000 |
      | Kia        | Niro      | QLD - All    | $90,000 |
      | Jeep       | Wrangler  | WA - All     | $50,000 |
      | Volkswagen | Polo      | NSW - All    | $60,000 |
      | Tesla      | Model S   | Any Location | $80,000 |
      | Mitsubishi | Outlander | NT - All     | $90,000 |
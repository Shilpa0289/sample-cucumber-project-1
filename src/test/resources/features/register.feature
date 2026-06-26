@Register
Feature: Register

  @author_ShilpaP
  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I enters following users details
      | Shilpa | Patel      | skpatel@yahoo.com | 07878451263 | London |
#      | Amit | Sharma     | amit@gmail.com | 07878451285 | Luton  |
#      | Amita| Vaghani    | aum@gmail.com  | 07878454585 | Harrow |
    Then registration successful
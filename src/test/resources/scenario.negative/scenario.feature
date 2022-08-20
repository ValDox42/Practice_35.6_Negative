Feature: Human confirmation
  Scenario: Authorisation page doesn't let enter without confirmation that you are human
    Given authorisation page url of e2e4 'https://id.e2e4.ru/auth'
    When trying to input login '123321'
    And trying to input password '123321'
    Then send data
    Then check for warning 'Подтвердите, что вы человек'
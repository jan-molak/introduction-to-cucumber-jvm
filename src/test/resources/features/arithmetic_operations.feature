Feature: Free-text entry arithmetic operations support

  Scenario: Recognises order of operations

    Given I have a calculator
     When I request to calculate 2 + 2 * 2
     Then I should receive a result of 6

  Scenario Outline: Complex expressions

    Given I have a calculator
     When I request to calculate <expression>
     Then I should receive a result of <result>

    Examples:
      | expression        | result | rule                           |
      | 2 + 2 * 2         | 6      | multiplication before addition |
      | 2 * (3 + 3)       | 12     | parentheses                    |
      | 2 * (3 * (2 - 1)) | 6      | nested parentheses             |

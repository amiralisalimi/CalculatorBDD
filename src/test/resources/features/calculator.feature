Feature: Calculator Operations
  Scenario Outline: Perform arithmetic operations
    Given I have a calculator
    When I enter <number1> and <number2> and the operator '<operator>'
    Then the result should be '<result>'

  Examples:
    | number1 | number2 | operator | result |
    | 5       | 3       | +        | 8      |
    | 5       | 3       | -        | 2      |
    | 5       | 3       | *        | 15     |
    | 6       | 3       | /        | 2      |
    | 5       | 0       | /        | Infinity |
    | -5      | 3       | *        | -15    |
    | 5.5     | 2       | +        | 7.5    |
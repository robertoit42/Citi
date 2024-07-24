#Author: your.email@your.domain.com
## (Comments)
@Regresion
Feature: Login

  @Login
  Scenario Outline: 
    Given abrir el navegador
    And to enter user<username> and password<password>

    Examples: 
      | username | password |
      | admin    | admin123 |

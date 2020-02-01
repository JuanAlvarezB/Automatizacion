#actor: juan

@All
Feature: perform tests of the Jobs section of the choucair website
  I as a web user want perform tests of the Jobs section of the choucair website


  @RunnerOne
  Scenario: verify the correct functioning of the jobs button
    Given that juan want access to page of choucair
    When  he enters the jobs option
    Then he verify message Convocatorias


    Scenario: Verify correct keyword search
      Given that juan want access to page of choucair
      When he enters the jobs option
      And perform a search for keyword
      |keyword|
      |Manager|
      Then he verify the text Service Manager
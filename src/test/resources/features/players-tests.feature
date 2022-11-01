@Player
Feature: features gestion players

  Scenario: create a player
    When i create player
    Then the created user
    And statut result is 200
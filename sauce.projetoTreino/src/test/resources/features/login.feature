#Author: empresaarialmaia1@gmail.com

@regressivos
Feature: Login 
Como usuario
Quero acessar o site
Para fazer compras

  @positivo
  Scenario: Login com sucesso
    When informar username correto
    And  informar password correto
    Then login efetuado com sucesso
    

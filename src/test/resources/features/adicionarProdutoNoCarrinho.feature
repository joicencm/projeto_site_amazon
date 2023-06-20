#Author: joicencm@gmail.com

@teste
Feature: Title of your feature
  I want to use this template for my feature file

  @carrinho
  Scenario: Como usuario quero selecionar o produto para uma possivel compra
    Given pesquisar o produto desejado
    When clicar em pesquisar
    And clicar no produto desejado
    And clicar em adicionar no carrinho    
    And escolher a opção de seguro
    Then valido mensagem "Adicionado ao carrinho"
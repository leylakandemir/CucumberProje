@urunarama
Feature: Amazon Arama

  Background: Oncesinde caliscak method(BeforeMethod)
    Given kullanici amazon sayfasina gider

  @amazonheadphones
  Scenario: TC_01 kullanici amazonda arama yapar
    And kullanici arama kutusuna headphones yazar
    Then kac sayfa buldugu bilgisini alir

@amazoncamera
   Scenario: TC_02 kullanici amazonda arama yapar
     And kullanici arama kutusuna camera yazar
     Then kac sayfa buldugu bilgisini alir

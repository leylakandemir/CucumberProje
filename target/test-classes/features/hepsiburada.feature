@hepsiburadaarama
  Feature: hepsiburada da arama yapma
    Scenario Outline: Firin kelimesini arama
      Given kullanici "http://hepsiburada.com" sayfasina gider
      And kullanici "<words>" kelimesini sayfada arar
      Then sonuc sayisini ekrana yazar
      Examples:
      |words|
      |firin|
      |utu |
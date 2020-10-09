@walmart
  Feature: Walmart sitesinde arama yapma
    Scenario Outline: TC08 kullanici Walmart sitesinde arama yapma

      Given kullanici "https://www.walmart.com" sayfasina gider
      And kullanici walmart aramakutusuna "<kelimeler>" yazar ve arar
      Then kullanici walmart sonuc sayisini ekrana yazdirir

      Examples: aranacak kelimeler
        |kelimeler|
        |calculator |
        |watch      |
        |flower     |

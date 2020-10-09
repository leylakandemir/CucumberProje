@teknolojikarama
  Feature: Amazon Birden Fazla Arama
    Scenario Outline: TC_04 kullanici amazonda arama yapar
      Given kullanici amazon sayfasina gider
      And kullanici aramakutusuna "<urunler>" yazar ve arar
      Then kullanici buldugu sonuc sayisini alir

      Examples:Urun Isimleri
      |urunler|
      |headphones|
      |camera    |
      |drone     |
      |pencil    |
      |tv        |
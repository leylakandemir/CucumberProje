@urunarama1 @amazon
  Feature: Amazon Urun Arama
    Scenario: TC_03 kullaniciamazonda urun aramasi yapar
      Given kullanici amazon sayfasina gider
      And kullanici aramakutusuna "drone" yazar ve arar
      Then kullanici buldugu sonuc sayisini alir

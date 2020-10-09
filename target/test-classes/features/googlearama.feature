Feature: Google Arama
  Scenario: TC01_kullanici googleda arama yapar
    #Yorum satiri icin bu isaret kullanilir
  Given kullanici google safasina gider
    And techproeducation aramasi yapar
    Then sayfa basligini kontrol eder

@dbupdate
Feature: Hotel verilerini guncelleme
  Scenario:kullanici hotel verilerini gunceller
    Given kullanici dbutils ile veritabanina baglanir
    And kullanici id degeri "1" olan verinin "ContactNameSurname" bilgisini "Batch5Esra" ile gunceller

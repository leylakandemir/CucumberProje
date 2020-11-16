@dbokuma
  Feature: Veri Okuma
    Scenario: kullanici hotel tablosundaki verileri okur
      Given kullanici veritabanina baglanir
      And kullanici "tHOTEL" tablosundaki "Name" verilerini alir
      And kullanici "Name" sutunundaki verileri okur


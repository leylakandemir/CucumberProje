$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/dbokuma.feature");
formatter.feature({
  "name": "Veri Okuma",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dbokuma"
    }
  ]
});
formatter.scenario({
  "name": "kullanici hotel tablosundaki verileri okur",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dbokuma"
    }
  ]
});
formatter.step({
  "name": "kullanici veritabanina baglanir",
  "keyword": "Given "
});
formatter.match({
  "location": "database_stepdefinitions.DbReadStepDef.kullanici_veritabanina_baglanir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"tHOTEL\" tablosundaki \"Name\" verilerini alir",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinitions.DbReadStepDef.kullanici_tablosundaki_verilerini_alir(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"Name\" sutunundaki verileri okur",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinitions.DbReadStepDef.kullanici_sutunundaki_verileri_okur(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});
Feature: US006 Google Testi
  Scenario: TC01 Google Sayfasinda Arama Yapilir
    Given kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then arama kutusunda propertiesden "arac1" aratir
    When sayfa basliginin propertiesden "arac1" icerdigini test eder
    And kullanici 2 saniye bekler
    And sayfayi kapatir

  Scenario: TC02 Google sayfasinda Arama yapilir
    Given kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then arama kutusunda propertiesden "arac2" aratir
    When sayfa basliginin propertiesden "arac2" icerdigini test eder
    And kullanici 3 saniye bekler
    And sayfayi kapatir
  @google
  Scenario: TC03 Google sayfasinda Arama yapilir
    * kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    * arama kutusunda propertiesden "arac3" aratir
    * sayfa basliginin propertiesden "arac3" icerdigini test eder
    * kullanici 4 saniye bekler
    * sayfayi kapatir
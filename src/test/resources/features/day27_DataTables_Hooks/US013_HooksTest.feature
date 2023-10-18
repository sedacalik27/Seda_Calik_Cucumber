Feature: US013 Google Testi
  @arac
  Scenario: TC01 Google sayfasinda Arama kutusunda arac aratilir
    Given kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then arama kutusunda propertiesden "arac1" aratir
    And sayfa basliginin propertiesden "arac2" icerdigini test eder
    But kullanici 2 saniye bekler

  @arac2
  Scenario: TC02 Google sayfasinda Arama kutusunda arac aratilir
    * kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then arama kutusunda propertiesden "arac2" aratir
    And sayfa basliginin propertiesden "arac3" icerdigini test eder
    But kullanici 2 saniye bekler


  @arac3
  Scenario: TC03 Google sayfasinda Arama kutusunda arac aratilir
    Given kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then arama kutusunda propertiesden "arac3" aratir
    And sayfa basliginin propertiesden "arac3" icerdigini test eder
    But kullanici 2 saniye bekler


Feature: US016 Google Testi
  @a1
  Scenario: TC01 Google sayfasinda Arama kutusunda arac aratilir
    Given kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then arama kutusunda propertiesden "arac1" aratir
    And sayfa basliginin propertiesden "arac1" icerdigini test eder
    But kullanici 2 saniye bekler

  @a2
  Scenario: TC02 Google sayfasinda Arama kutusunda arac aratilir
    * kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then arama kutusunda propertiesden "arac2" aratir
    And sayfa basliginin propertiesden "arac2" icerdigini test eder
    But kullanici 2 saniye bekler


  @a3
  Scenario: TC03 Google sayfasinda Arama kutusunda arac aratilir
    Given kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then arama kutusunda propertiesden "arac3" aratir
    And sayfa basliginin propertiesden "arac3" icerdigini test eder
    But kullanici 2 saniye bekler
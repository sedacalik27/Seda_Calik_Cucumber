Feature: US008 Google Testi

  Scenario Outline: TC01 Google Sayfasinda Arama Yapilir
    Given kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then arama kutusunda propertiesden belirtilen "<araclari>" aratir
    And kullanici 2 saniye bekler
    When kullanici sayfa basliginin propertiesden "<araclari>" icerdigini test eder
    And kullanici 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | araclari |
      | arac1    |
      | arac2    |
      | arac3    |
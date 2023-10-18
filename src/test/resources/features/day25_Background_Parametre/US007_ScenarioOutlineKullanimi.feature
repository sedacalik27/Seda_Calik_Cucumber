Feature: US007 Google Testi

  Scenario Outline: TC01 Google Sayfasinda Arama Yapilir
    Given kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then arama kutusunda belirtilen "<araclari>" aratir
    When kullanici sayfa basliginin "<araclari>" icerdigini test eder
    And kullanici 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | araclari |
      | volvo    |
      | audi     |
      | mercedes |
      | ford     |
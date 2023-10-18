Feature: US001 Amazon Sayfasi Testi
  @iphone
  Scenario: TC01 Arama Kutusunda iphone aratilir
    Given kullanici amazon sayfasina gider
    Then arama kutusunda iphone aratir
    And sayfayi kapatir
    @gr1
    Scenario: TC02 Arama Kutusunda samsung aratilir
      Given kullanici amazon sayfasina gider
      Then Arama kutusunda samsung aratir
      And sayfayi kapatir
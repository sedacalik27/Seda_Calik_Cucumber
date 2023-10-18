Feature: US002 BlueRentalCar Login Test
  Scenario: TC01 BlueRentalCar Sayfasinda Login olunur
    Given kullanici blueRentalCar sayfasina gider
    Then kullanici login butonuna tiklar
    And kullanici adi ve password girer
    And sayfayi kapatir

  @gr1
  Scenario: TC02 BlueRentalCar Sayfasinda Login olunur
    Given kullanici blueRentalCar sayfasina gider
    Then kullanici login butonuna tiklar
    But kullanici farkli bir email ve password girer
    And sayfayi kapatir
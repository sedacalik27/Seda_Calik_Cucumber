Feature: US012 BlueRentalCar Sayfasinda Login Islemi
  Scenario: TC01 Verilen Email ve Password bilgileri ile Login olunur
    Given kullanici blueRentalCar sayfasina gider
    Then kullanici login butonuna tiklar
    But kullanici 3 saniye bekler
    And verilen kullanici bilgileri ile login olur
      | email                          | password |
      | raj.khan@bluerentalcars.com    | v7Hg_va^ |
      | pam.raymond@bluerentalcars.com | Nga^g6!  |
    And sayfayi kapatir
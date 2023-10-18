Feature: US011 Google Testi

  Scenario: TC01 Google sayfasinda Arama kutusunda arac aratilir
    Given kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then kullanici verilen bilgiler ile arama yapar
      | Araclar |
      | volvo   |
      | audi    |
      | bmw     |
    And sayfayi kapatir










    #DataTables kullanımında Scenario Outline'dan farklı olarak her stepten sonra yukarıdaki örnekteki gibi
#tablo oluşturabiliriz. Yazdığımız step'in methodunu stepDefinition class'ında oluşturduğumuzda, feature file daki
#yazdığımız step'in altındaki tablodaki verilere ulaşabilmek için methoda parametre olarak io.cucumber.dataTable'dan
#DataTable parametresi ekleriz. Bu parametre sayesinde verileri bir liste (asList()) dönüştürüp for döngüsü ile
#çok rahat alabiliriz.
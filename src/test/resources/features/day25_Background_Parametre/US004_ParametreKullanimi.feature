Feature: US004 Amazon Testi

  Background: Ana sayfaya gidilir
    Given kullanici parametreli method ile "https://amazon.com" sayfasina gider

  Scenario: TC01 arama kutusunda java aratir
    Then kullanici parametreli method ile "java" aratir

  Scenario: TC02 arama kutusunda sql aratir
    Then kullanici parametreli method ile "sql" aratir

  Scenario: TC03 arama kutusunda php aratir
    Then kullanici parametreli method ile "php" aratir
    And sayfayi kapatir


     #Feature file'i daha dinamik hale getirebilmek için gitmek istediğimiz url yada aratmak istediğimiz
#bir kelimeyi "" tırnak içinde yazarak dinamik hale getirebiliriz. "" içinde yazdığımız step'in methodunu
#oluşturduğumuzda parametreli bir method oluşturur. Dolayısıyla başka bir scenario da herhangi bir sayfaya
#gitmek istediğizde bu oluşturmus olduğumuz parametreli method sayesinde sadece feature file dan url'i
#değiştirerek istediğimiz sayfaya tekrar tekrar method oluşturmadan gidebiliz

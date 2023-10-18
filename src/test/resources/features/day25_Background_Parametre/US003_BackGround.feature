@all
Feature: US003 Amazon Sayfasi Testi

  #Feature file daki scenario'larımızda ortak adımlarımız var ise bunun için Feature: anahtar kelimesinden sonra
  #Background: anahtar kelimesini kullanabiliriz. Background @Before notasyonuna sahip bir method gibi
  #scenario'lardan önce çalışır.

  Background: Ana Sayfaya Gider
    * kullanici amazon sayfasina gider
    @iphone @samsung
    Scenario: TC01 aramakutusunda iphone aratilir
      * arama kutusunda iphone aratir
    @samsung
    Scenario: TC02 aramakutusunda samsung aratilir
      * Arama kutusunda samsung aratir
      * sayfayi kapatir

      #Given,Then,When,And gibi anahtar kelimeleri ile stepDefinition class'ında oluşturduğumuz methodu
      #tekrar farklı bir scenario da kullanmak istediğimizde bu anahtar kelimeler yerine *(yıldız) sembolu kullanabiliriz
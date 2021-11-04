Feature:US1011 kullanici dogru bilgilerle sayfaya girebilmeli

  @CH1
  Scenario: TC17 positive login testi
    When kullanici "CHQAUrl" sayfasina gider
    Then CH login linkine tiklar
    And CH username kutusuna "manager" yazar
    And CH password kutusuna "Manager1!" yazar
    And CH login butonuna basar
    Then CH basarili giris yapildigini test eder
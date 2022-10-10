Feature: Namba Test
  @Test

  Scenario: Зарегистрироваться
    Given user click on "https://nambafood.kg/?language=ru" web page
    And user click on button
    And Пользователь заполняет строку Email
    And Пользователь заполняет строку Пароль
    Then Пользователь наживает кнопку Войти
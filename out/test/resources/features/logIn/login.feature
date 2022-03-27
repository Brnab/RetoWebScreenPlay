Feature: Inicio de sesion en la pagina web
  Yo como usuario ya registrado de la pagina
  Quiero poder iniciar sesion en el sistema
  Para poder realizar compras


  Scenario: Inicio de sesion exitoso
    Given me encuentro en la pagina
    When voy a iniciar sesion
    When ingreso mis datos
    Then el sistema deberia dejarme ingresar a la cuenta




  Scenario: Inicio de sesion fallido
    Given estoy en la pagina web
    When me dispongo a iniciar sesion
    When ingreso los datos de un usuario no registrado
    Then el sistema debe mostrar error al iniciar



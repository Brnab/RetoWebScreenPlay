Feature: Registro en la pagina web
  Yo como usuario de la pagina
  Quiero podeer registrarme en esta
  Para asi poder realizar compras


  Scenario: Registro exitoso en la pagina
    Given me encuentro en la pagina web
    When navego a la opcion de inicion de sesion
    When ingreso los datos solicitados de manera correcta
    Then el sistema debe crearme una cuenta


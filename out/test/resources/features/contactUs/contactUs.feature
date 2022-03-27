Feature: Contacto con la pagina web
  Yo como usuario de la pagina
  Quiero poder contactarme con servicio al cliente
  Para pedir informacion sobre productos

  Scenario: Envio exitoso de la informacion
    Given me encuentro en la pagina web para contactarme
    When voy a la opcion de contactarme con la pagina
    When ingreso la informacion necesaria
    Then el sistema debe enviar el mensaje

    Scenario: Envio incorrecto de la informacion
      Given estoy en la pagina para enviar la info
      When voy a la opcion de contactar con la empresa
      When no lleno el campo de mensaje
      Then el sistema debe mostrar un error
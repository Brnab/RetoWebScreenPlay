Feature: Contacto con la pagina web
  Yo como usuario de la pagina
  Quiero poder contactarme con servicio al cliente
  Para pedir informacion sobre productos

  Scenario: Envio exitoso de la informacion
    Given me encuentro en la pagina web para contactarme
    When voy a la opcion de contactarme con la pagina
    When ingreso la informacion necesaria
    Then el sistema debe enviar el mensaje
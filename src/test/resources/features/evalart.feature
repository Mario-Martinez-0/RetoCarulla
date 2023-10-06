#language: es



Característica: Diligenciar formulario

  como usuario de Evalart
  quiero ingresar a la aplicacion
  para diligenciar formulario con iteracion


  @testEvalart
  Escenario: Diligenciar formulario exitosamente
    Dado que Cristina ingresa a la aplicacion de Evalart
      | Usuario    | 706471                                           |
      | Contrasena | 10df2f32286b7120Mi00LTE3NDYwNw==30e0c83e6c29f1c3 |
    Cuando Diligencia formulario de pruebas
      | Multiplos                                      |  Secuencia | Operacion | Fecha      |
      | 91,21,63                                       | 10              | -24234    | 18/12/2023 |
      | 80,90                                          | 10              | -53938    | 15/01/2024 |
      | 117,189                                        | 12              | 16064     | 05/11/2023 |
      | 108,156,196,88                                 | 18              | 2587398   | 13/06/2023 |
      | 164,172,80,44,112                              | 9               | 2201968   | 02/08/2023 |
      | 108,40                                         | 14              | 866815    | 06/07/2023 |
      | 155,15,60,65,125                               | 10              | 80858     | 14/12/2023 |
      | 52,76,192,110,130,42,114,152,80,120,122,62,194 | 15              | 24747     | 31/08/2023 |
      | 98,140                                         | 16              | 877       | 04/12/2023 |
      | 24,168,198,132,144,114                         | 11              | 358       | 21/12/2023 |
    Entonces puede visualizar el mensaje Felicidades, has terminado la prueba exitosamente


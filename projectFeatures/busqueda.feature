Feature: Busqueda Hotel en la pagina de Expedia
  Yo como usuario recurrente 
  Quiero poder buscar un hotel 4 estrellas
  Para reservarlo.

  Scenario: Busqueda Exitosa Parametrizado
    Given Dado que el usuario esta en la pagina de busqueda
    When el usuario haga click en el boton Hotel
    And y elija el destino
    And y defina la Fecha Inicial
    And y defina la Fecha Final
    And y haga click en el boton Buscar
    Then el usuario puede ver las lista de hoteles consultados

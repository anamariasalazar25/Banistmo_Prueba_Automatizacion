Feature: Acceso al sitio web de Banistmo

	@EscenarioPrincipal
  Scenario: Acceso al sitio web de banistmo y realizar el evento
    Given que un usuario esta en la pagina de banistmo
    When selecciona la opcion acerca de nosotros
    And selecciona la opcion informacion corporativa
    And selecciona la opcion proveedores del menu desplegado
    And selecciona el boton conoce mas
    Then valida que la pantalla emergente sea la correcta

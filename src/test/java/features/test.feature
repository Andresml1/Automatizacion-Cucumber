Feature: Registrar Usuario
  Como usuario quiero registrarme en el sitio web demoblaze.

  Scenario Outline: Registar un usuario en la pantalla home
    Given El usuario se ubica en la pagina home de demoblaze
    When Hace click sobre el boton Sing Up
    And Abre ventana emergente de Sing Up
    And Ingresa <UserName> and <Password>
    Then Hace click en el boton Sing Up

  Examples:

    | UserName | Password |
    | Usuario | Contraseña |


  Scenario Outline: Ingresar a al sitio web con usuario
    Given El usuario se ubica en la pagina home de demoblaze
    When Hace click sobre el boton Log In
    And Abre ventana emergente de Log In
    And Ingresa el <UserName> and <Password>
    Then Hace click en el boton Log In

    Examples:

      | UserName | Password |
      | Usuario | Contraseña |


  Scenario Outline: Registrar un contacto
    Given El usuario se encuentra en la pagina home de demoblaze
    When Hace click sobre la categoria Laptops
    And Ingresa los datos de contacto <Email> and <Name> and <Message>
    Then Hace click en el boton Send Message

    Examples:

      | Email | Name | Message |
      | prueba@gmail.com | Andres |  prueba |

  Scenario : Agregar una Lapto MacBook
    Given El usuario se encuentra en la pagina Home Page
    When Hace click sobre la categoria Laptops
    And Hace click en MackBook Pro
    Then Hace click en Add To Cart

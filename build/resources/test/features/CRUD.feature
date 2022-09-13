Feature: Yo como usuario del servicio necesito Crear, Buscar, Actualizar y Eliminar computadores de la Database

  Background: Abrir la pagina de computer database
    Given el usuario esta en la pagina principal
  @Crear
    Scenario Outline: Crear un registro de un computador
      Given el usuario selecciona Add a new computer
      When Llena toda la informacion del formulario
      |Nombre|fechaintroduccion|fechadescontinuacion|
      |<nombre>|<introduccion> | <descontinuacion>  |
      Then el usuario da click en create this computer
      And se vizualiza el mensaje Done! Computer asd has been created
      Examples:
      |nombre|introduccion|descontinuacion|
      |1aprueba|1995-10-10|1996-11-11|
      |1aprueba1|1994-18-24||
      |1aprueba2||1996-10-25|
      |1aprueba3|||
      @borrar
      Scenario Outline: Borrar un registro
        Given el usuario selecciona el computador con nombre <nombre>
        When el usuario da click en el boton Delete
        Then se vizualiza el mensaje Done! Computer has been deleted
        Examples:
        |nombre|
        |1aprueba|
        #|1aprueba2|
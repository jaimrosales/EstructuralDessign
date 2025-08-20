wrapper: envoltorio // no es lo mismo que el adapter, pueden o no hace rreferencia en documentacion a el patron adapter

Adapter: Realiza implementaciones a interfaces ya definidas,tomar en cuenta que no se hace referencia a una interface de programacion sino al concepto del vocablo interface

    Agrega una capa adicional en la practica
    Trabaja con clases existentes y que no tienen la interface

Elementos del adapter:
    -Client: define la conformacion de los objetos, trabajara en conjunto con el target
    -Target: define la interface que utilizara el cliente
    -Adaptee: Es la clase adaptada, Define la interface existente que necesita adaptarse
    -Adapter: El adaptador, Es la interface que trabajara con el target, se encarga de la funcionalidad.

Lo que busca es adaptar diferentes metodos o metodos que ya existen dentro de tu programa a nuevas metodologias o requerimientos

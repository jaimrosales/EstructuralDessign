Sirve para anadir funcionalidades o responsabilidades

Es similar a aplicar herencia
Sirve para agregar o quitar dinamicamente la funcionalidad

Un detalle a tener en cuenta es que es necesario la creacion de clases
ademas de que al tener una gran cantidad de clases se eleva la complejidad

Los elementos son:
    -Componente: puede ser una clase abstracta o una interface, se define de manera que tendra funcionalidades o responsabilidades
    -Componente Concreto: Un objeto con funcionalidades o responsabilidades adicionales
    -Decorador: Mantiene la referencia al componente asociado, 
        implementa el componente, pero no implementa los metodos devido a que de esto se hara cargo el decorador concreto, para lo cual se puede configurar como clase abstracta,    y
        Se necesita la referencia al componente, basta con declararlo
        ademas de un metodo constructor
        y normalmente tambien se agrega un metodo que devuelva al componente
    -Decorador Concreto: Anade las funcionalidades al componente
        -Se necesita almenos un decorador concreto pero pueden ser cuantos se quieran
        -extiende de decorador
        -sobreescribe los metodos de decorador al menos los de la interface
        - tiene su constructor, el cual usa un componente como argumento, el cual jalara con el super
        -modificas los metodos anadiendoles funcionalidades a cada metodo
        -estas funcionalidades se correran cuando se llame al metodo del componente como extra, corre el codigo y veras que se anaden las funciones del decorador, y no se corren los metodos extras en el decorador
        -Se pueden anadir infinidad de decoradores
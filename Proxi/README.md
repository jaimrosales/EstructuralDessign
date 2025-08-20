Patron de Diseno Proxi

Proxi- porlo gneeral siempre va acompanado de alguna otra, como proxiserver, proxiX,proxiY

Se puede definir como 
-Sustituto
-Control de Acceso

O igual como un intermedario, ofrece un sustituto para controlar el acceso a un elemento

Dentro del patron proxy se cuentan con 3 elementos
    -Proxy: mantiene una referencia que permite acceder a el elemento real y provee una interface identica al objeto real, esto sirve para poder controlar los accesos, peticiones y trabajar con el formato
    -Subject: Es una interface que implementara el elemento real para interactuar con el proxy
    -RealSubject: Define el objeto real que el proxi va a representar

Existen distintos tipos de proxi dos muy usados son el Proxi de produccion y el proxi virtual

El Proxy otorga un intermediario
    Un caso comun de utilizacion de intermediario es cuando se necesita interceptar peticiones para saber que necesitamos hacer

    Tambien se puede enmascarar lo que esta pasando, o trabajar con invocaicones de metodos, esto sucede mucho cuando se esta trabajando con java, al utilizar los framesworks para no trabajar directamente con los objetos y que se modifique algo y luego no se tenga registro de que fue lo que paso

El proxi otorga una interface del objeto subyacente identica, mientras que el decorator otorga una interface decorada

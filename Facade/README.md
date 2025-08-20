Permite al cliente desentenderse de una complejidad del sistema

Problema:
    Si esta sutilizando un auto automatico, solo es necesario seleccionar drive y soltar el freno y el carro andara, sin embargo el auto realiza una serie de procesos complejos tanto en el cambio de marcha como dentro de la inyeccion de combustible, el conductor esta totalmente desentendido de lo que esta pasando dentro del automobil

El objetivo de este patron de diseno es generar esa interface para que el cliente no necesite de comprender que esta pasando dentro del programa    


                      -----------------------> ModuleB
                      |                      ^      ^
                      |                     /       |         
                      |                    v        |
Facade(fachada)-------|---------------> ModuleA     |
                      |                    ^        |
                      |                     \       |
                      |                      v      v
                      -----------------------> ModuleC 

Aunque al generar la fachada escribes mucho codigo, la ventaja es que esta cfachada la puedes utilizar con cualquier cliente que la llame, lo que permitira que cualquier cliente que la llame no necesitara conocer como funciona o la complejidad del proceso para ser capas de implementarla

Es bastante simple conciente en una clase que realizara todos los procesos necesarios y devuelve un resultado

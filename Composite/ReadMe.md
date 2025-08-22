Permite crear de manera flexible estructuras jerarquicas de arbol de complejidad arbitraria

En espanol

Permite crear arboles gerarquicos que comparten al menos un metodo y que en el que de mayor jerarquia puede ordenar a sus subordinados

                                                  -------------------
                                                  | Graphic         |<--------------------------
                                                  | Draw()          |                          |
                                                  | Add(Graphic)    |                          |
                                                  | Remove(Graphic) |                          |
                                                  | GetChild(int)   |                          |
                                                  -------------------                          |
                                                        |                                      |             
_ _ _ _ ________________________________________________^___________                           |
            |                   |               |                   |                          |
      ----------       -------------       ----------       -------------------     graphics   |
      | line   |       | Rectangle |       | Text   |       | Picture          |@---------------          
      | Draw() |       | Draw()    |       | Draw() |       | Draw()           |<--forall in grapics g.Draw        
      ----------       -------------       ----------       | Add(grafhic g)   |<---add g to list of graphics
                                                            | Remove (Grafhic) |
                                                            | GetChild(int)    |
                                                            -------------------


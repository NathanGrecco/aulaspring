## Problema - Não é possível salvar um animal, pois precisa de um tutor. Porém não é interessante passar um objeto tutor no body, então deve ser passado apenas o id do tutor no payload.

### Como fazer

**1** - Passar id do tutor via pathParams, junto com o body do animal

**2** - No TutorService criar o método buscarTutorPorId e utilizar o método findById (O método retornará um Optional)

**3** - No método salvar do service, buscar o tutor por id (será necessário criar o método buscarTutorPorId no TutorService) 

**4** - Salvar o tutor buscado no objeto animal que será salvo com o método setTutor()

**5** - Animal salvo com sucesso e retornando o tutorId correto


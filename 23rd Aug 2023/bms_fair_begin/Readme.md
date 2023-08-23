Major Annotations

0. Getter, Setter => Lombok
1. Entity
2. MappedSuperClass
3. Id
4. GeneratedValue(strategy = GenerationType.IDENTITY)
5. relation
    5.1 OnetoMany (mappedBy = ?)
    5.2 ManyToOne
6. enums

-> All relationships have been expressed twice and used mappedBy on one side to prevent duplicacy


-> Decorate controllers, services and repositories with appropriate annotations
-> SpringBoot will use these annotations to figure out topolgoical sort and create the objects
-> We will not need to create objects (and worry about topological sort of dependencies)
-> We will receive data directly in methods of controllers which is sent via HTTP requests (using Postman)
# Crear el proyecto en Eclipse para JPA y Maven.

En Eclipse:

1. New>Dynamic Web Project
2. Project Name: Nombre del proyecto que queramos.
3. Target runtime: Seleccionamos Tomcat la Versión que hayamos instalado.
4. Dinamic web module version: 6.0
5. Seleccionar>Generate web.xml deployment descriptor

En **pom.xml** añado:  
- propierties: Encoding y Compiler.
- dependencies>dependency>mysql-connector-java
- [Maven Repositorio]( https://mvnrepository.com/artifact/mysql/mysql-connector-java)
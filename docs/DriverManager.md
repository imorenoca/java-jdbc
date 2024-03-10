El Ide Eclipse me aconseja usar otra clase del paquete y no la que viene en el ejercicio de práctica.

java.sql.DriverManager


The basic service for managing a set of JDBC drivers. 

NOTE: The javax.sql.DataSource interface, provides another way to connect to a data source.The use of a DataSource object is the preferred means ofconnecting to a data source. 

Un paso más allá:

The **javax.* packages were recently renamed to jakarta.* ** for some Java EE specifications due to legal reasons. The DataSource interface is now part of the jakarta.sql package. This change applies to newer versions of Jakarta EE (successor to Java EE).

Quedaría investigar como se puede realizar con DataSource.

[Información sobre Drive Manager](https://download.java.net/java/early_access/loom/docs/api/java.sql/java/sql/DriverManager.html)  
[Información sobre DataSource en java.net ](https://download.java.net/java/early_access/loom/docs/api/java.sql/javax/sql/DataSource.html)
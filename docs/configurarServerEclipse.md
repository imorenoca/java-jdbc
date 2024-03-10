# Configurar un servidor en Eclipse IDE.

1. Descargar versión de Tomcat en [Apache Tomcat](https://tomcat.apache.org)
2. Elegir versión y sistema operativo.
3. En Core seleccionar sistema operativo: 64-bit Windows zip (pgp, sha512)
4. Descargar y descomprimir en una carpeta en el disco duro.

## Configurar Eclipse

1. Abrir Windows>Perspective>Open Perspective, seleccinar JAVA EE, OPEN.
2. Windows>Show View>Servers. En esta nueva ventana clic en el link 
3. En la nueva ventana, seleccionamos la versión de Tomcat que queremos usar y pulsamos **Next**.
4. Se abre otra ventana, seleccionamos el directorio donde hemos descomprimido Tomcat en **Browse**.
7. Seleccionar JRE, en mi caso JR17 y Finish.

Con esto ya tenemos creado nuestro servidor en Eclipse. Desde la pestaña Server lo podemos iniciar, parar y configurar.  

Para configurarlo solo debemos clicar en el servidor y se nos abrirá el menú de configuración donde podemos cambiar el puerto de configuración si fuera necesario.  


**Fuente**  
[How to Configure Tomcat Web Serve in Eclipse IDE by CS Corner Sunita Rai](https://www.youtube.com/watch?v=0CsWW1Ni8jA)
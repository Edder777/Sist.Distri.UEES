Grupo: Juan Castaneda y Edder Parra
Para instalar las dos aplicaciones deben seguir las siguientes instrucciones:

1.- Las dos computadoras que una va a tener el servidor y el otro el cliente deben estar en la misma red.

2.- Despues deben instalar java en  las dos computadoras para que se pueda ejecutar el aplicativo en el siguiente link estan las instrucciones indicadas:

	https://phoenixnap.com/kb/how-to-install-java-ubuntu\

3.- En lado del servidor se debe colocar el programa Server.java. Despues sacar la direccion ip de la computadora host con ifconfig para Linux.

4.- En lado del cliente se debe colocar el programa Client.java , se debe cambiar el codigo donde dice:

 	ia = InetAddress.getByName("100.100.50.21");//get local host address

	Ahi se debe poner la direccion ip del host donde enviara las variables para realizar la logica.

5.-Despues en el terminal de servidor corra el siguiente comando: ( por su puesto tiene que haber completado la instalacion de java que esta en el paso 2)
java Server.java y en el lado del cliente java Cliente.java

6.- Al momento de ejecutar en lado de cliente le aparecera que ingrese un numero lo cual ingresa el numero que desea, solo acepta numero si pone letra le saldra el error de scanner.

Termina la implementacion.

El codigo se baso en el siguiente respositorio que se encuentra en GitHub:

https://github.com/Edder777/Sist.Distri.UEES


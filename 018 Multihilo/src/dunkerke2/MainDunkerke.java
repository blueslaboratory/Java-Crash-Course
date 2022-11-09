// HACER/VER PRIMERO EL DE NAUFRAGO

/*

OPERACION DINAMO
CONTEXTO (TRIVIAL):
La evacuacion de Dunkerque
En 1939, tras la invasion de Polonia por parte de la Alemania nazi, que supuso el inicio de la
Segunda Guerra Mundial, los britanicos enviaron la Fuerza Expedicionaria Britanica (BEF)
para ayudar en la defensa de Francia. En mayo de 1940, la fuerza estaba formada por diez
divisiones pertenecientes a tres cuerpos. Asimismo, tanto el Ejercito belga como el Primer,
Segundo y Tercer Ejercito franceses colaboraron con la BEF.
El 10 de mayo de 1940, Alemania lanzo una ofensiva contra Belgica y los Paises Bajos. La
BEF avanzo desde la frontera belga hasta el rio Dyle, donde, a partir del 10 de mayo, se
enfrento a una parte del ejercito aleman. Cuatro dias despues, el 14 de mayo, cuando los
belgas y franceses no pudieron resistir mas en sus posiciones, la BEF recibio la orden de
iniciar la retirada hacia el rio Escalda.
Durante una visita realizada a Paris el 17 de mayo, el primer ministro britanico Winston
Churchill recibio de parte del general frances Maurice Gamelin, comandante en jefe de las
fuerzas francesas, la noticia de que los franceses habian destinado todas sus tropas a los
enfrentamientos que estaban en curso y que, por tanto, ya no les quedaban reservas.
Billotte, comandante del Primer Ejercito frances y coordinador global de las fuerzas Aliadas,
le desvelo que a los franceses ya no les quedaba tropas situadas entre los alemanes y el
mar. En consecuencia, la mejor opcion consistia en llevar a cabo una evacuacion a traves
del canal de la Mancha y comenzo a planear la retirada hacia Dunkerque, la localidad con
instalaciones portuarias mas cercana. Rodeada de humedales, Dunkerque disponia de
antiguas fortificaciones y contaba con la playa de arena de mayor longitud de Europa.
Tras varios enfrentamientos y un intento fallido por parte de los Aliados de atacar el flanco
de las fuerzas alemanas el 21 de mayo en Arras, la BEF quedo atrapada junto con los
restos de las fuerzas belgas y los tres ejercitos franceses en un area situada en la costa
norte francesa. 


ENUNCIADO:
400.000 soldados de los aliados estaban a merced del ejercito aleman.
La evacuacion comenzaria el 26 de Mayo de 1940. Bajo un intenso fuego de artilleria de las
baterias alemanas y bombardeos de aparatos de la Luftwaffe, miles de soldados britanicos,
franceses y belgas hacian colas en la playa, mientras siete divisiones francesas ofrecian
resistencia en los ochenta kilometros del frente.

La Armada britanica habia preparado una flota con cuarenta destructores y ciento treinta
barcos mercantes y de pasajeros, que debian embarcar las tropas en condiciones muy
precarias, pues el puerto de Dunkerque habia sido devastado por la Luftwaffe. Para
transportar a los soldados desde la playa hasta los barcos de la Royal Navy, que
permanecian en alta mar defendiendose de los bombardeos de la aviacion alemana con sus
propias baterias antiaereas, se utilizaron todos los medios disponibles.
Para el rescate se utilizaran las lanchas y los botes salvavidas de los barcos que esperan
en alta mar.

Para reducir el riesgo en caso de ataque, se coordinara que en la playa embarcando
soldados solo esten, en un momento dado, las lanchas o los botes salvavidas, nunca todos
a la vez.
De igual manera, cuando estan desembarcando los soldados en los barcos de alta mar, solo
podran hacerlo en las lanchas o los botes, nunca los 2 a la vez.
Embarcar a los soldados en la playa dura media hora tanto en lanchas como en botes
salvavidas. En cada viaje embarcan un numero variable de entre 500 y 1000 soldados en
las lanchas y entre 1.500 y 2.000 soldados en los botes salvavidas.
Desembarcar a los soldados en las naves que esperan en alta mar dura otra media hora.
Nuestras naves no podran aguantar mas de 6 dias el fuego enemigo, por lo que la
operacion acabara cuando no queden mas soldados que rescatar o cuando se cumplan
estos 6 dias.
Pasados estos 6 dias, los soldados que queden en la playa deben rendirse al ejercito
aleman.
El alto mando necesita informacion constante y actualizada del transcurso de la operacion.
1 h = 1000 milisegundos


Ejemplo de salida:
1 - Han embarcado 906 soldados de la playa en LANCHAS
2 - Quedan 399094 soldados en la playa
1 - Han embarcado 1784 soldados de la playa en BOTES SALVAVIDAS
2 - Quedan 397310 soldados en la playa
3 - Han desembarcado en los barcos de alta mar 906 soldados desde LANCHAS
4 - Han embarcado 906 soldados en total 
3 - Han desembarcado en los barcos de alta mar 1784 soldados desde BOTES SALVAVIDAS
4 - Han embarcado 2690 soldados en total 
1 - Han embarcado 738 soldados de la playa en LANCHAS
2 - Quedan 396572 soldados en la playa
1 - Han embarcado 1917 soldados de la playa en BOTES SALVAVIDAS
2 - Quedan 394655 soldados en la playa

4 - Han embarcado 178484 soldados en total
3 - Han desembarcado en los barcos de alta mar 959 soldados desde LANCHAS
4 - Han embarcado 179443 soldados en total

5 - HAN PASADO 3 DIAS DE COMBATE

1 - Han embarcado 1582 soldados de la playa en BOTES SALVAVIDAS
2 - Quedan 218975 soldados en la playa
1 - Han embarcado 669 soldados de la playa en LANCHAS
2 - Quedan 218306 soldados en la playa

4 - Han embarcado 357910 soldados en total
1 - Han embarcado 1832 soldados de la playa en BOTES SALVAVIDAS
2 - Quedan 40258 soldados en la playa

5 - HAN PASADO 6 DIAS DE COMBATE

1 - Han embarcado 865 soldados de la playa en LANCHAS
2 - Quedan 39393 soldados en la playa

OPERACION DINAMO - STATUS: FINALIZADA 
** Se han salvado 357910 soldados en total **
** Se han quedado en la playa 39393 soldados que deberan rendirse al ejercito aleman **



OPERACION DINAMO - Lo que pudo ser
Aunque la evacuacion de Dunkerque ha pasado a la historia como un milagro y el rescate/
retirada mas famoso de la 2ª guerra mundial, un alumno de FP analizando los datos cree
que se pudo mejorar. Para ello se debieron seguir los siguientes pasos:
- La playa era muy grande, pero no tenia capacidad para que todas lanchas y barcas
salvavidas entraran a la vez y se molestaban. Se debio dividir tanto a las barcas
como a las lanchas en 5 grupos (5 grupos de cada)
- Cada grupo de botes tenia capacidad para rescatar entre 300-400 soldados
- Cada grupo de lanchas tenia capacidad para rescatar entre 100-200
soldados.
- Se debio controlar que el acceso a la playa se hiciera por un maximo de 7 grupos
(da igual si de barcas o de lanchas, pero no mas de 7 grupos a la vez). Eso permitia
reducir el tiempo de embarque en la playa a los 24 minutos (400 milisegundos).
- En caso de que en el acceso a la playa estuvieran esperando barcas y lanchas,
habia que priorizar a las barcas puesto que caben mas soldados en ellas.
- El desembarque en los soldados en los soldados en alta mar sigue tardando media
hora (500 milisegundos), pero se distribuye la llegada entre los distintos barcos de
forma que pueda que ningun grupo de barcas o lanchas tenga que esperar a otro
grupo.

¿¿Lleva razon el estudiante de FP??
Haz una simulacion con las hipotesis de partida comentadas.
Incluye en el resumen el total de personas rescatadas por cada grupo de barcas o lanchas.
NOTA: Piensa que el contador necesita un hilo para funcionar y debe ser el mas prioritario
de todos.

*/

package dunkerke2;
//DUNKERQUE LO QUE PUDO SER

import java.util.concurrent.Semaphore;


public class MainDunkerke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libreria lib = new Libreria();
		
		Playa dunkerquePlaya = new Playa();
		Semaphore semaforoRescate = new Semaphore(7);
		
		
		RoyalNavy royalNavy = new RoyalNavy();
		// se distribuye la llegada entre los distintos barcos de forma que pueda que 
		// ningun grupo de barcas o lanchas tenga que esperar a otron grupo: todos a la vez
		Semaphore semaforoDesembarco = new Semaphore(10);
		
		
		Embarcacion lancha1 = new Embarcacion("LANCHAS", 100, 200, 
											  dunkerquePlaya, royalNavy,
											  semaforoRescate, semaforoDesembarco);
		Embarcacion lancha2 = new Embarcacion("LANCHAS", 100, 200, 
				   							  dunkerquePlaya, royalNavy,
				   							  semaforoRescate, semaforoDesembarco);
		Embarcacion lancha3 = new Embarcacion("LANCHAS", 100, 200, 
				   							  dunkerquePlaya, royalNavy,
				   							  semaforoRescate, semaforoDesembarco);
		Embarcacion lancha4 = new Embarcacion("LANCHAS", 100, 200, 
				   							  dunkerquePlaya, royalNavy,
				   							  semaforoRescate, semaforoDesembarco);
		Embarcacion lancha5 = new Embarcacion("LANCHAS", 100, 200, 
				   							  dunkerquePlaya, royalNavy,
				   							  semaforoRescate, semaforoDesembarco);
		
		
		Embarcacion bote1 = new Embarcacion("BOTES SALVAVIDAS", 300, 400,
											dunkerquePlaya, royalNavy,
											semaforoRescate, semaforoDesembarco);
		Embarcacion bote2 = new Embarcacion("BOTES SALVAVIDAS", 300, 400,
											dunkerquePlaya, royalNavy,
											semaforoRescate, semaforoDesembarco);
		Embarcacion bote3 = new Embarcacion("BOTES SALVAVIDAS", 300, 400,
											dunkerquePlaya, royalNavy,
											semaforoRescate, semaforoDesembarco);
		Embarcacion bote4 = new Embarcacion("BOTES SALVAVIDAS", 300, 400,
											dunkerquePlaya, royalNavy,
											semaforoRescate, semaforoDesembarco);
		Embarcacion bote5 = new Embarcacion("BOTES SALVAVIDAS", 300, 400,
											dunkerquePlaya, royalNavy,
											semaforoRescate, semaforoDesembarco);
		
		
		System.out.println("CONDICIONES INICIALES EN LA PLAYA");
		System.out.println("\tHay " +dunkerquePlaya.getSoldadosAliadosLuchando() + " soldados luchando en Dunkerque");
		System.out.println();
		
		System.out.println("EMBARCACIONES");
		
		System.out.println(lancha1);
		System.out.println(lancha2);
		System.out.println(lancha3);
		System.out.println(lancha4);
		System.out.println(lancha5);
		
		System.out.println(bote1);
		System.out.println(bote2);
		System.out.println(bote3);
		System.out.println(bote4);
		System.out.println(bote5);
		System.out.println();
		
		System.out.println("***COMIENZA LA OPERACION DINAMO***");
		System.out.println();
		
		
		// NUNCA INICIARLOS CON RUN, SIEMPRE CON START
		lib.start();
		
		/*
		En los botes caben mas que en las lanchas: aumentamos la prioridad
		10: max_priority
		5: norm_priority
		0: min_priority
		*/
		bote1.start();
		bote2.start();
		bote3.start();
		bote4.start();
		bote5.start();
		
		bote1.setPriority(3);
		bote2.setPriority(3);
		bote3.setPriority(3);
		bote4.setPriority(3);
		bote5.setPriority(3);
	
		
		lancha1.start();
		lancha2.start();
		lancha3.start();
		lancha4.start();
		lancha5.start();
		
		lancha1.setPriority(1);
		lancha2.setPriority(1);
		lancha3.setPriority(1);
		lancha4.setPriority(1);
		lancha5.setPriority(1);
		
		
		
		
		// que no pase de aqui hasta que la guerra haya acabado o todos hayan sido rescatados
		boolean todosRescatados = false;
		while(Libreria.COUNTER == true) {
			try {
				Thread.sleep(1);
				
				if(royalNavy.getSoldadosAliadosRescatados() >= 400000 ||
				   dunkerquePlaya.getSoldadosAliadosLuchando() <= 0) {
					
					Libreria.COUNTER = false;
					todosRescatados = true;
					
					royalNavy.setSoldadosAliadosRescatados(400000);
					dunkerquePlaya.setSoldadosAliadosLuchando(0);
					
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		// Ahogados o todosRescatados
		/*
		lib.interrupt();
		*/
		lib.stop();
		
		/*
		bote1.interrupt();
		bote2.interrupt();
		bote3.interrupt();
		bote4.interrupt();
		bote5.interrupt();
		*/
		bote1.stop();
		bote2.stop();
		bote3.stop();
		bote4.stop();
		bote5.stop();
		
		/*
		lancha1.interrupt();
		lancha2.interrupt();
		lancha3.interrupt();
		lancha4.interrupt();
		lancha5.interrupt();
		*/
		lancha1.stop();
		lancha2.stop();
		lancha3.stop();
		lancha4.stop();
		lancha5.stop();
		
		
		
		
		int ahogados = 0;
		int totalLanchas, totalBotes, totalSoldados;
		
		if(todosRescatados) {
			
			totalLanchas = lancha1.getRescatados()+
					   	   lancha2.getRescatados()+
					   	   lancha3.getRescatados()+
					   	   lancha4.getRescatados()+
					   	   lancha5.getRescatados();
			
			totalBotes = bote1.getRescatados()+
					 	 bote2.getRescatados()+
					 	 bote3.getRescatados()+
					 	 bote4.getRescatados()+
					 	 bote5.getRescatados();
	
			totalSoldados = totalLanchas + totalBotes;
		}
		else {
			
			totalLanchas = lancha1.getDesembarcadosEmbarcacion()+
					   	   lancha2.getDesembarcadosEmbarcacion()+
					   	   lancha3.getDesembarcadosEmbarcacion()+
					   	   lancha4.getDesembarcadosEmbarcacion()+
					   	   lancha5.getDesembarcadosEmbarcacion();
			
			totalBotes = bote1.getDesembarcadosEmbarcacion()+
						 bote2.getDesembarcadosEmbarcacion()+
						 bote3.getDesembarcadosEmbarcacion()+
						 bote4.getDesembarcadosEmbarcacion()+
						 bote5.getDesembarcadosEmbarcacion();
			
			ahogados = 400000 - (royalNavy.getSoldadosAliadosRescatados()+dunkerquePlaya.getSoldadosAliadosLuchando());
			
			totalSoldados = ahogados + royalNavy.getSoldadosAliadosRescatados() + dunkerquePlaya.getSoldadosAliadosLuchando();
		}
				
		
		
		
		System.out.println("\n***OPERACION DINAMO FINALIZADA***");
		System.out.println("Se han salvado " +royalNavy.getSoldadosAliadosRescatados() +" soldados en total");
		System.out.println("Se han quedado en la playa " +dunkerquePlaya.getSoldadosAliadosLuchando() + " que deberan rendirse al ejercito aleman");
		System.out.println("Se han ahogado " +ahogados +" soldados");
		
		// No funciona del todo bien cuando todosRescatados = true
		System.out.println("\nLas lanchas salvaron " +totalLanchas);
		System.out.println("Los botes salvavidas salvaron " +totalBotes);
		
		System.out.println("\nParticiparon un total de " +totalSoldados +" soldados");
	}

}

/*UVG
 * Estructuras de datos
 * Autores:
 *Diego Estrada 18540
 *Esteban del Valle 18221
 *Main
 */
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String [] arg) {

        //Factory
        MapFactory<String,String> MapFactory = new MapFactory<>();

        String FILENAME = "cards_desc.txt";

        BufferedReader br = null;
        FileReader fr = null;
        String msg ="";
        String typeSelected = "";

        //Primer Menu
        System.out.println(">> Bienvenido, seleccione el tipo de Map a utilizar:\n" +
                "1. HashMap\n" +
                "2. TreeMap\n" +
                "3. LinkedHashMap\n");
        Scanner sc = new Scanner(System.in);
        int numOp = sc.nextInt();
        sc.nextLine();
        if(numOp == 1){
            typeSelected = "HashMap";
        }else if(numOp == 2){
            typeSelected = "TreeMap";
        }else if(numOp == 3){
            typeSelected = "LinkedHashMap";
        }

        //Colecciones de cartas
        Map<String, String> globalDeck = MapFactory.getMap(typeSelected);
        Map<String, String> personalDeck = MapFactory.getMap(typeSelected);

        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            // Lectura del fichero
            while((msg=br.readLine())!=null){
                int split = msg.indexOf("|");
                String cardName = msg.substring(0, split);
                String cardType = msg.substring(split+1);
                //Almacenar en el deck global
                globalDeck.put(cardName, cardType);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        
        System.out.println(">> Seleccione la accion a realizar:\n" +
                "1. Agregar una carta a su colección\n" +
                "2. Mostrarel tipo de una carta específica.\n" +
                "3. Mostrar el nombre,tipo y cantidad de cada carta en su coleccion.\n" +
                "4. Mostrarel nombre, tipo y cantidad de cada carta en su colección, ordenadas por tipo.\n" +
                "5. Mostrar el nombre y tipo de todas las cartas existentes.\n" +
                "6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.\n" + 
                "7. Salir");
      
        int op = sc.nextInt();
        sc.nextLine();
        while (op != 7) { 
        if(op == 1){
            System.out.println("Ingresa el nombre de la carta que desea agregar");
            String carta = sc.nextLine();
            String value = globalDeck.get(carta);
            personalDeck.put(carta, value);
            System.out.println("La carta " + carta + " de tipo " + value + " ha sido agregada a su coleccion");
      
        }
        
        else if(op == 2){
        	System.out.println("Ingresare el nombre de la carta");
        	String carta = sc.nextLine();
        	 String value = globalDeck.get(carta);
        	 System.out.println("el tipo de la carta es " + value);
        }
        
        else if(op == 3){
        	Iterator it = personalDeck.entrySet().iterator();
        	
        	while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                System.out.println(pair.getKey() + " = " + pair.getValue());
        	}
        }
        else if(op == 4){
  
        	Iterator it = personalDeck.entrySet().iterator();
        	Iterator it1 = personalDeck.entrySet().iterator();
        	Iterator it2 = personalDeck.entrySet().iterator();
        	
        	while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                String a = (String) pair.getValue();
                if (a.equals("Monstruo")) {
                	System.out.println(pair.getKey() + " = " + pair.getValue());
                	}
                }
        	
        	while (it1.hasNext()) {
                Map.Entry pair = (Map.Entry)it1.next();
                String b = (String) pair.getValue();
                if (b.equals("Hechizo")) {
                	System.out.println(pair.getKey() + " = " + pair.getValue());
                	}
                }
        	
        	while (it2.hasNext()) {
                Map.Entry pair = (Map.Entry)it2.next();
                String c = (String) pair.getValue();
                if (c.equals("Trampa")) {
                	System.out.println(pair.getKey() + " = " + pair.getValue());
                	}
                }
        	
        }
        
        else if(op == 5){
        	Iterator it = globalDeck.entrySet().iterator();
        	
        	while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                System.out.println(pair.getKey() + " = " + pair.getValue());

        	}
        	
            
        }
        
        else if(op == 6){
        	Iterator it = globalDeck.entrySet().iterator();
        	Iterator it1 = globalDeck.entrySet().iterator();
        	Iterator it2 = globalDeck.entrySet().iterator();
        	
        	while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                String a = (String) pair.getValue();
                if (a.equals("Monstruo")) {
                	System.out.println(pair.getKey() + " = " + pair.getValue());
                	}
                }
        	
        	while (it1.hasNext()) {
                Map.Entry pair = (Map.Entry)it1.next();
                String b = (String) pair.getValue();
                if (b.equals("Hechizo")) {
                	System.out.println(pair.getKey() + " = " + pair.getValue());
                	}
                }
        	
        	while (it2.hasNext()) {
                Map.Entry pair = (Map.Entry)it2.next();
                String c = (String) pair.getValue();
                if (c.equals("Trampa")) {
                	System.out.println(pair.getKey() + " = " + pair.getValue());
                	}
                }
        	
  
        }
        
        else if (op != 7){
        	System.out.println("Opcion no reconocida");
        }
        
        System.out.println(">> Seleccione la accion a realizar:\n" +
                "1. Agregar una carta a su colección\n" +
                "2. Mostrarel tipo de una carta específica.\n" +
                "3. Mostrar el nombre,tipo y cantidad de cada carta en su coleccion.\n" +
                "4. Mostrarel nombre, tipo y cantidad de cada carta en su colección, ordenadas por tipo.\n" +
                "5. Mostrar el nombre y tipo de todas las cartas existentes.\n" +
                "6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.\n" + 
                "7. Salir");
      
        op = sc.nextInt();
        sc.nextLine();
        
        }
        System.out.println("ADIOS");
        
        
    }
}

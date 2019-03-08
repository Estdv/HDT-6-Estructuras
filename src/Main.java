/*UVG
 * Estructuras de datos
 * Autores:
 *Diego Estrada 18540
 *Esteban del Valle 18221
 *Main
 */
import java.io.*;
import java.util.*;

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
                "3. Mostrar el nombre,tipo y cantidad de una carta en su coleccion.\n" +
                "4. Mostrarel nombre, tipo y cantidad de cada cartaque en su colección, ordenadas por tipo.\n" +
                "5. Mostrar el nombre y tipo de todas las cartas existentes.\n" +
                "6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.\n");
        
        int op = sc.nextInt();
        if(op == 1){
            // opcion 1
      
        }
        
        else if(op == 2){
            // opcion 2
            
        }
        
        else if(op == 3){
            // opcion 3
        }
        
        else if(op == 4){
            // opcion 4
        	
        }
        
        else if(op == 5){
            // opcion 5
            
        }
        
        else if(op == 6){
            // opcion 6
        }
        
        
    }
}

import java.io.*
import java.util.*

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
        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}

/*Autores:
 *Diego Estrada 18540
 *Esteban del Valle 18221
 *Modelo de Carta
 */
public class Card {
    //Atributos
    private String name;
    private String type;

    //Constructor
    public Card(String name, String type){
        this.name = name;
        this.type = type;
    }

    //Obtener nombre
    public String getName(){
        return this.name;
    }

    //Obtener tipo
    public String getType(){
        return this.type;
    }

}

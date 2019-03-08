import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*Autores:
 *Diego Estrada 18540
 *Esteban del Valle 18221
 *Patrón de diseño Factory
 */

public class MapFactory<K,V> {
    public Map<K,V> getMap(String mapType){
        if(mapType == null){
            return null;}
        if(mapType.equals("HashMap")){
            return new HashMap<K, V>();
        }else if (mapType.equals("TreeMap")){
            return  new TreeMap<K, V>();
        } else if (mapType.equals("LinkedHashMap")){
            return new LinkedHashMap<K, V>();
        }
        return null;
    }
}

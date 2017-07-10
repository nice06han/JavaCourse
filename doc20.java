public class MapExample {

 public static void main(String[] args){
 Map <String, String> list = new TreeMap<>();
 list.put(“001", "A item");
 list.put(“002", "B item");
 list.put(“003", "C item");
 list.put(“001", "D item"); //A item gets overwritten
 Set<String> keys = list.keySet();

  for (String key:keys){
	System.out.println("item key: " + key + " " + list.get(key));
  }
 }
}
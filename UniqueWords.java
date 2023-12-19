import java.util.HashMap;
import java.util.Map;
public class UniqueWords {
    public static void main(String[] args) {
        String s = "Hello I am Mohit. I am from satara";
        UniqueWords un = new UniqueWords();
        un.getCount(s);
    }
    public Map<String, Integer> getCount(String s){
        Map<String, Integer> map = new HashMap<>();
        String[] arr = s.split(" ");

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        return map;
        
    }
}

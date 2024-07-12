 import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(3);
        a1.add(2);
        a1.add(1);
        a1.add(2);

        HashMap<Integer,Integer> frequencyNumber=new HashMap<>();

        for(int i=0;i<a1.size();i++){
        Integer number=a1.get(i);
        if(frequencyNumber.containsKey(number)) { //use containsKey for check values
            frequencyNumber.put(number,frequencyNumber.get(number)+1);
        } else {
            frequencyNumber.put(number, 1);
        }
        }
        System.out.println("Frequency numbers:");
        for(Map.Entry<Integer,Integer> entry : frequencyNumber.entrySet()){
            System.out.println(entry.getKey() + " : " +entry.getValue());
        }
        int mostFrequentElement=0;
        int maxFrequency=0;
        for(Map.Entry<Integer,Integer> entry : frequencyNumber.entrySet()){
            if(entry.getValue()>maxFrequency){
                maxFrequency=entry.getValue();
                mostFrequentElement=entry.getKey();
            }}
            System.out.println("Most Frequent Element is:"+mostFrequentElement);

    }}


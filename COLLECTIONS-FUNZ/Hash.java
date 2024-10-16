import java.util.*;
class Hash{
    public static void main(String[] args){
        HashMap<Character,Integer> freq=new HashMap<>();
        freq.put('z',100);
        int a=freq.get('z');
        System.out.println(a);
        String str="arjun";
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println(freq);
        freq.remove('z');
        System.out.println(freq);
        System.out.println("coatians z?:"+freq.containsKey('z'));
        System.out.println("coatians z?:"+freq.containsValue('3'));
        Set<Character> chars=freq.keySet();
        Collection<Integer> vals=freq.values();
        Set<Map.Entry<Character,Integer>> entry=freq.entrySet();
        Set<Character> chars1 = new HashSet<>();
        Set<Integer> vals1 = new HashSet<>();
        for (Map.Entry<Character, Integer> e : entry) {
            chars1.add(e.getKey());  // Get the key
            vals1.add(e.getValue()); // Get the value
        }
        System.out.println(chars+" "+vals+""+entry+""+chars1+""+vals1+"size?:"+freq.size());
        freq.clear();
        System.out.println(freq);
        System.out.println("empty?:"+freq.isEmpty());
    }
}
import java.util.*;
class AandB3003{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003");
        System.out.print("Enter a number:");
        Scanner input=new Scanner(System.in);
        Random r=new Random();
        int n=input.nextInt();
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> m=new ArrayList<>();
        for (int i=0;i<n;i++){
            l.add(r.nextInt(10));
        }
        System.out.println(l);
        for (int i=0;i<n;i++){
            m.add(r.nextInt(10));
        }
        System.out.println(m);
        HashMap<Integer,Integer> mapp=new HashMap<>();//put,get,containskey
        for(int i:l){
            if(mapp.containsKey(i)){
                mapp.put(i,mapp.get(i)+1);
            }
            else{
                mapp.put(i,1);
            }
        }
        //System.out.println(mapp);
        HashMap<Integer,Boolean> mappi=new HashMap<>();
        for(int i:m){
                mappi.put(i,true);
        }
        //System.out.println(mappi);
        for(int i:m){
            //System.out.println(mappi);
            if(mapp.containsKey(i) && mappi.get(i)){
                System.out.println(i+" from B is present "+mapp.get(i)+" times in A");
                mappi.put(i,false);
            }
            else if(mappi.get(i)){
                System.out.println(i+" from B is NOT present in A");
                mappi.put(i,false);
            }
        }
        
    }
}
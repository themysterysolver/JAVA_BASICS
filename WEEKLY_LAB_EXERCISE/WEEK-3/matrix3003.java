import java.util.*;
class matrix{
    ArrayList<ArrayList<Integer>> m=new ArrayList<>();
    Random ri=new Random();
    matrix(int r,int c){
        for(int i=0;i<r;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<c;j++){
                row.add(ri.nextInt(10));
            }
            m.add(row);
        }
        //System.out.println(m);
        print(m);
    }
    matrix(int r){
        for(int i=0;i<r;i++){
            ArrayList<Integer> row=new ArrayList<>();
            m.add(row);
        }
        System.out.println(m);
    }
    void print(ArrayList<ArrayList<Integer>> m){
        for(int i=0;i<m.size();i++){
            for(int j=0;j<m.get(i).size();j++){
                System.out.printf("%d ",m.get(i).get(j));
            }
            System.out.println();
        }
    }
    ArrayList<ArrayList<Integer>> transpose(ArrayList<ArrayList<Integer>> x){
        if (x.isEmpty() || x.get(0).isEmpty()) {
            return new ArrayList<>(); 
        }
        for(int i=0;i<x.size();i++){
            for(int j=0;j<i;j++){
                int temp=x.get(i).get(j);
                x.get(i).set(j,x.get(j).get(i));
                x.get(j).set(i,temp);
            }
        }
        return x;
    }
    int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int num : list) {
            total += num;
        }
        return total;
    }
    void sumi(ArrayList<ArrayList<Integer>> a,ArrayList<ArrayList<Integer>> b){
        a=transpose(a);
        b=transpose(b);
        print(a);
        System.out.println();
        print(b);
        ArrayList<ArrayList<Integer>> c=new ArrayList<>();
        for(int i=0;i<a.size();i++){
            ArrayList<Integer> row=new ArrayList<>();
            c.add(row);
        }
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(i).size();j++){
                c.get(i).add((a.get(i).get(j)+b.get(i).get(j)));
            }
        }
        System.out.println();
        print(c);
        ArrayList<Integer> columnSums = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();
        
        for (int i = 0; i < c.size(); i++) {
            columnSums.add(sum(c.get(i))); 
            indices.add(i); 
        }

        for (int i = 0; i < columnSums.size() - 1; i++) {
            for (int j = i + 1; j < columnSums.size(); j++) {
                if (columnSums.get(i) > columnSums.get(j)) {
                    int tempSum = columnSums.get(i);
                    columnSums.set(i, columnSums.get(j));
                    columnSums.set(j, tempSum);

                    int tempIndex = indices.get(i);
                    indices.set(i, indices.get(j));
                    indices.set(j, tempIndex);
                }
            }
        }
        ArrayList<ArrayList<Integer>> sortedMatrix = new ArrayList<>();
        for (int index : indices) {
            sortedMatrix.add(c.get(index));
        }
        System.out.println();
        print(sortedMatrix);
        sortedMatrix=transpose(sortedMatrix);
        System.out.println();
        print(sortedMatrix);
    }
}
class matrix3003{
    public static void main(String[] args){
        Random r=new Random();
        int row=2+r.nextInt(5);
        int col=row;
        matrix a=new matrix(row,col);
        System.out.println();
        matrix b=new matrix(row,col);
        matrix c=new matrix(row);
        c.sumi(a.m,b.m);
    }
}
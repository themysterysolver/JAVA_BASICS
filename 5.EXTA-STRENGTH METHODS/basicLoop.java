class basicLoop{
    public static void main(String[] args){
        System.out.println("NON-ENHANCED FOR LOOP:");
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        System.out.println("WHILE LOOP:");
        int i=0;
        while(i<5){
            System.out.println(i);
            i++;
        }
        String[] a={"abi","parbha","hars","deepu"};
        System.out.println("String contains:"+a);
        System.out.println("ENHANCED FOR LOOP:");
        for(String b:a){
            System.out.println(b);
        }


    }
}
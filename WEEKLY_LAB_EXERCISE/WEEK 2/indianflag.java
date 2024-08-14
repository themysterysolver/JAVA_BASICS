
class indianflag{
    static void o_line(){
        for(int i=0;i<20;i++){
            System.out.print("- ");
        }
        System.out.println();
    }
    static void v_line(){
        System.out.printf("|%38s|\n","");
    }
    static void m_line(){
        System.out.printf("|%15s******%17s|\n","","");
    }
    static void b_line(){
        for(int i=0;i<15;i++){
            System.out.println("|");
        }
    }
    public static void main(String[] args){
        o_line();
        v_line();
        v_line();
        o_line();
        m_line();
        m_line();
        m_line();
        o_line();
        v_line();
        v_line();
        o_line();
        b_line();
    } 

}
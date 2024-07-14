//class for the before test.ie)SimpleDotCom class
class SimpleDotCom{
    int[] locations;
    int NoHits=0;
    void SetLocation(int[] loc){
        locations=loc;
    }
    String ChekGuess(String guess){
        String result="Miss";
        int guessint=Integer.parseInt(guess);
        for(int cell:locations){ //int cells: //should initialse the iteratble!
            if(cell==guessint){
                NoHits++;
                result="Hit";
                break;
            }
            if(NoHits==locations.length){
                result="kill";
            }
        }
        return result;
    }
}

class SimpleDotComTestDrive{
    public static void main(String[] args){
        int[] location={1,2,3}; //consecutive location for a single SHIP===dotcom
        SimpleDotCom dot=new SimpleDotCom();//creating a location in array
        dot.SetLocation(location);
        String guess="2"; 
        String result=dot.ChekGuess(guess);
        Boolean testresult=false;
        if(result.equals("Hit")){
            testresult=true;
        }
        System.out.println("THE TEST RESULT:"+testresult);
    }
}
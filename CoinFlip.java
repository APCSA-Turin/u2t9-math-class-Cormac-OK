public class CoinFlip {
    public CoinFlip(){}

    public String flip(){
        if ((int) (Math.random() * 2) == 0){
            return "heads";
        }
        else {
            return "tails";
        }
    }

    public double simulate(int numOfFlips){
        int numOfHeads = 0;
        for (int i = 0; i < numOfFlips; i++){
            if (flip().equals("heads")){
                numOfHeads++;
            }
        }
        return (double) numOfHeads/numOfFlips;
    }
}

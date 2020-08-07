package replits;

public class replit166 {


    public String c_profits(int buyPrice, int sellPrice) {
        String result = "";
        if(buyPrice<sellPrice){
            result = "profit";
        }else if(buyPrice>sellPrice){
            result = "loss";
        }else if(buyPrice==sellPrice){
           result = "no loss";
        }
        return result;
    }
}
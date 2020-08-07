package replits;

public class replit168 {










    public double waterTax(double units) {
        double bill = 0.0;

        if(units<100){
            if(units>50){
                bill=units*0.9;
            }else{
                bill = units*0.6;
            }
        }else if(units>=100&units<150){
            bill = (units*0.90)+50;
        }else if(units>=150){
            bill = (units*0.90)+100;
        }

        return bill;



    }
}

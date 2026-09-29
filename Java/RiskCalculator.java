public class RiskCalculator{
    public static void main(String[] args){
        int age=50;
        double cholesterolLevel=6.0;
        boolean isHighRisk=false;

        if(age>45 && cholesterolLevel> 5.5){
            isHighRisk=true;
        }
        if(isHighRisk){
            System.out.println("Patient is at high risk heart attack");
        }else{
            System.out.println("Patient is at low risk");
        }
    }
}
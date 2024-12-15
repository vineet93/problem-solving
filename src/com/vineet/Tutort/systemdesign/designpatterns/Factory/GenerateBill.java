package com.vineet.Tutort.systemdesign.designpatterns.Factory;

public class GenerateBill {

    public static void main(String[] args) {

        GetPlanFactory gt = new GetPlanFactory();
        Plan plan = gt.getPlan("INTERNATIONALPLAN");
        plan.getRate();
        plan.calculateBill(100);

        Plan plan1 = gt.getPlan("COMMERCIALPLAN");
        plan1.getRate();
        plan1.calculateBill(50);

        Plan plan2 = gt.getPlan("DOMESTICPLAN");
        plan2.getRate();
        plan2.calculateBill(150);



    }

}

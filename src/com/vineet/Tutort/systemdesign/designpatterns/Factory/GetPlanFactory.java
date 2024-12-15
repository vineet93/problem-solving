package com.vineet.Tutort.systemdesign.designpatterns.Factory;

public class GetPlanFactory {

    public Plan getPlan(String planType){
        if(planType == "COMMERCIALPLAN"){
            return new CommercialPlan();
        } else if(planType == "DOMESTICPLAN"){
            return new DomesticPlan();
        } else if(planType == "INTERNATIONALPLAN"){
            return new InternationalPlan();
        }
        return null;
    }
}

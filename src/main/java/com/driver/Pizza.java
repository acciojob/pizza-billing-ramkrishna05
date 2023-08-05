package com.driver;

public class Pizza {

    private int totalprice;
    private Boolean isVeg;
    private String bill;
    private int cheeseprice;
    private  int toppingprice;
    private int baseprice;
    private int paperbagprice;

    private boolean istopping;
    private boolean ischees;
    private boolean istakeway;
    private boolean isbillgenrated;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true)
        {
            baseprice=300;
            toppingprice=70;

        }
        else
        {
            baseprice=400;
            toppingprice=120;
        }
        cheeseprice=80;
        paperbagprice=20;
        totalprice=baseprice;
        bill="Base Price Of The Pizza:"+baseprice+"\n";


    }

    public int getPrice(){

        return this.totalprice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischees==false)
        {
            totalprice=totalprice+cheeseprice;
            ischees=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(istopping==false)
        {
            totalprice=totalprice+toppingprice;
            istopping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(istakeway==false)
        {
            totalprice=totalprice+paperbagprice;
            istakeway=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(isbillgenrated==false)
        {
            isbillgenrated=true;
            if(ischees==true)
            {
                bill=bill+"Extra Cheese Added: "+cheeseprice+"\n";
            }
            if(istopping==true)
            {
                bill=bill+"Extra Toppings Added: "+toppingprice+"\n";
            }
            if(istakeway=true)
            {
                bill=bill+"Paperbag Added: "+paperbagprice+"\n";
            }
            bill=bill+"Total Price: "+totalprice;
        }
        return this.bill;

    }
}

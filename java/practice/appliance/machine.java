abstract class appliance{
    abstract void switch_on();
    abstract void switch_off();
}

class washingmachine extends appliance{
    void switch_on(){
        System.out.println("wahing machine on");
    }
    void switch_off(){
        System.out.println("wahing machine off");
    }
}

class fridge extends appliance{
    void switch_on(){
        System.out.println("fridge on");
    }
    void switch_off(){
        System.out.println("fridge off");
    }
}

class machine{
    public static void main(String[] args){
        washingmachine wm=new washingmachine();
        wm.switch_on();
        wm.switch_off();
        //error
        appliance ap = new appliance();
        ap.switch_off();

    }
}
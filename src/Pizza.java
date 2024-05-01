public class Pizza {
    private int price;
    private boolean veg;
    private boolean isExtraCheese;
    private boolean isExtraTopping;
    Pizza(boolean veg){
        this.veg = veg;
        if(veg==true){
            price = 300;
        }
        else {
            price =400;
        }

    }
    public void getPizza(){
        System.out.println("Price "+ price);

    }
    public void addExtraCheese(){
        isExtraCheese=true;
        this.price = this.price+100;
    }
    public void addExtraTopping(){
        isExtraTopping=true;
        this.price = this.price+200;
    }
    public void getBill(){
        if(isExtraCheese){
            System.out.println("Extra cheese added "+100);
        } if(isExtraTopping){
            System.out.println("Extra topping added "+200);
        }
        System.out.println("Your total is "+ this.price);
    }



}

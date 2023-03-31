import java.util.ArrayList;

public class Server {

//    public boolean canServeGuest(Guest guest){
//        if(isOldEnough(guest)){
//            return true;
//        }
//        return false;
//    }
//
//    public boolean isOldEnough(Guest guest){
//        // check age of guest
//        // if over 18 - can make drink
//        // if not over 18 - cannot make drink
//        if(guest.getAge() >= 18) {
//            return true;
//        }
//        return false;
//    }

    private ArrayList<String> menu;


    // array list of drink the server can make
    public Server(ArrayList<String> menu){
        this.menu = menu;

    }


    // check each condition that will fail e.g. we would not be able to serve
    // if we pass all these if statements, the default would be True
    public boolean canServeGuest(Guest guest){
        if (guest.getAge() <18){
            return false;
        }
        if(guest.getWallet() < 5.00){
            return false;
        }
        if(guest.getSobriety() < 50){
            return false;
        }
        if(guest.getIsBanned()){
            return false;
        }
        if(guest.getCurrency() != '£'){
            return false;
        }
        if(!menu.contains(guest.getFavouriteDrink())){
            return false;
        }
        return true;
    }


}

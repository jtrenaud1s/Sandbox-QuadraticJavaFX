package me.jtrenaud1s;

public class Main {

    public static void main(String[] args) {
	    EntityPlayer player = new EntityPlayer("Jordan",20, 20);
	    EntityMosquito mosquito = new EntityMosquito(5, 5);
	    mosquito.attack(player);
	    mosquito.attack(player);
	    for(int i = 0; i < 5; i++) {
	        player.attack(mosquito);
        }
        System.out.println(mosquito.getName());
	    System.out.println(player.getName());
    }
}

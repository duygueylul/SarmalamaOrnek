package Encapsulation;

public class Main2 {

	public static void main(String[] args) {
		SarmalamaOrnek market = new SarmalamaOrnek();
		
		market.setÜrün_Adi("yumurta");
		market.setTüketim_ömrü("1 ay");
		market.setÜrün_kodu(4593);
		
		
		System.out.println("Ürünün Adı: " + market.getÜrün_Adi());
		System.out.println("Ürünün Tüketim Ömrü: " +  market.getTüketim_ömrü());
        System.out.println("Ürün Kodu: " + market.getÜrün_kodu());		

	}

}

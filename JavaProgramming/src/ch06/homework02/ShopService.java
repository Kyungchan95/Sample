package ch06.homework02;

public class ShopService {
	private static ShopService shopservice = new ShopService();

	private ShopService() {

	}

	static ShopService getInstance() {
		return shopservice;
	}

}

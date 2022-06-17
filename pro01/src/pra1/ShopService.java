package pra1;

public class ShopService {
	private static ShopService obj = new ShopService();
	
	
	static ShopService getInstance() {
		return obj;
	}
}

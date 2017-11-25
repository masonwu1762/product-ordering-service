package unit.test.sample.product_ordering_service;

public class ProductService {
	private ProductDao productDao;
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public boolean buy(Product product, int orderedQuantity) {
		boolean transactionStatus=false;
		
		//取得庫存量
		int availableQuantity = productDao.getAvailableProducts(product);
		
		if (orderedQuantity > availableQuantity) {  //購買量大於庫存量
			productDao.orderProduct(product, 0);
			transactionStatus = false;
		}
		else {  //購買量小於庫存量
		    productDao.orderProduct(product, orderedQuantity);
		    transactionStatus=true;
		}
		
		return transactionStatus;
	}
}

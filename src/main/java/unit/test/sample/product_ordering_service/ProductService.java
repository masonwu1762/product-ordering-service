package unit.test.sample.product_ordering_service;

public class ProductService {
	private ProductDao productDao;
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public boolean buy(Product product, int orderedQuantity) {
		boolean transactionStatus=false;
		int availableQuantity = productDao.getAvailableProducts(product);
		
		if (orderedQuantity > availableQuantity) {
			productDao.orderProduct(product, 0);
			transactionStatus = false;
		}
		else {
		    productDao.orderProduct(product, orderedQuantity);
		    transactionStatus=true;
		}
		
		return transactionStatus;
	}
}

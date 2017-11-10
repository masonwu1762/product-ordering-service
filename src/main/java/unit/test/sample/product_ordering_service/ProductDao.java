package unit.test.sample.product_ordering_service;

public interface ProductDao {
	int getAvailableProducts(Product product);
	int orderProduct(Product product, int orderedQuantity);
}

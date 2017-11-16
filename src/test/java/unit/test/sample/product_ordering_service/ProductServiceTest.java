package unit.test.sample.product_ordering_service;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class ProductServiceTest{
	private ProductService productService;
    private ProductDao productDao;
    private Product product;
    
    @Before
    public void setupMock() {
    	    productService = new ProductService();
    	    
    	    //Construct
        product = mock(Product.class);
        //Construct
        productDao = mock(ProductDao.class);
        productService.setProductDao(productDao);
    }
    
    @Test
    public void testBuySufficient() {
        //Set behavior , handle dependency
        when(productDao.getAvailableProducts(product)).thenReturn(30);
        
        //Call logic
        productService.buy(product, 5);
        
        //Verify behavior
        verify(productDao).orderProduct(product, 5);
        
        //Assert correctness
    }
    
    /*
    @Test
    public void testBuyInsufficient() {
        when(productDao.getAvailableProducts(product)).thenReturn(30);
        
        productService.buy(product, 5);
        verify(productDao).orderProduct(product, 5);
    }
    */
}

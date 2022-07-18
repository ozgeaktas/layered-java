package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	//dependency injection
	private ProductDao productDao;
	private LoggerService loggerService;
	
	//hibernateye ba�l� de�iliz ama onun referans�n� tutabilen
	//productdao ya ba�l�y�z.

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		//i� kodlar� yaz�l�r.
		if(product.getCategoryId()==1) {
			System.out.println("bu kategoride �r�n kabul edilmiyor.");
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi: "+product.getName());
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

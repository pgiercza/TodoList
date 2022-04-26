package pl.edu.wszib.http2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.http2.service.common.CrudService;
import pl.edu.wszib.http2.service.dao.ProductDao;
import pl.edu.wszib.http2.service.dao.ProductDao;
import pl.edu.wszib.http2.service.exception.NotFoundException;
import pl.edu.wszib.http2.service.model.Plec;
import pl.edu.wszib.http2.service.model.Product;
import pl.edu.wszib.http2.service.model.Product;

import java.util.List;

@Service
public class ProduktService extends CrudService<Product, Integer> {
  public ProduktService() {
    super(Integer.class);
  }
/*
  @Autowired
  private ProductDao dao;
   

  public void delete(Integer id){
    dao.deleteById(id);
  }

  public Product create(Product newProduct){
    newProduct.setId(null);
    return dao.save(newProduct);
  }

  public Product update(Product updateProduct){
    Product existing=get(updateProduct.getId());
    return dao.save(updateProduct);
  }
*/

}

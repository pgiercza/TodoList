package pl.edu.wszib.http2.service;

import org.springframework.stereotype.Service;
import pl.edu.wszib.http2.service.common.CrudService;
import pl.edu.wszib.http2.service.model.Product;

@Service
public class ProduktService extends CrudService<Product, Integer> {
  public ProduktService() {
    super(Integer.class);
  }
}

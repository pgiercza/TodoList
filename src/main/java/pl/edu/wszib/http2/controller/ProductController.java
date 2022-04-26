package pl.edu.wszib.http2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import pl.edu.wszib.http2.service.ProduktService;
import pl.edu.wszib.http2.service.model.Product;
import pl.edu.wszib.http2.service.model.Profile;

import javax.validation.Valid;
import java.io.IOException;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProduktService productService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("prod", productService.list());
        return "product/list-product";
    }

    @GetMapping("/create")
    public String createProfileView(Model model) {
        model.addAttribute("newProduct", new Product());
        return "product/create-product";
    }

    @PostMapping("/create")
    public String createProductAction(Product newProduct, Model model) {
        productService.create(newProduct);
        return "redirect:list";
    }

    @GetMapping("/get")
    public String get(@RequestParam Integer id, Model model){
        model.addAttribute("product", productService.get(id));
        return "product/get-product";
    }

    @GetMapping("/update")
    public String update(@RequestParam Integer id, Model model){
        model.addAttribute("updateProduct", productService.get(id));
        return "product/update-product";
    }
    @PostMapping("/update")
    public String get(Product updatedProduct, Model model){
        updatedProduct=productService.update(updatedProduct);
        return "redirect:/product/get?id="+updatedProduct.getId();
    }

    @GetMapping("/delete")
    public String delete(@RequestParam Integer id, Model model) {
        model.addAttribute("product", productService.get(id));
        return "product/delete-product";
    }

    @PostMapping("/delete")
    public String deleteProduct(@RequestParam Integer id, Model model) {
        productService.delete(id);
        return "redirect:/product/list";
    }


}

package ra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ra.model.Product;
import ra.sevice.IProductService;

import java.util.List;
import java.util.Scanner;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping
    public ModelAndView showListProduct(){
        ModelAndView modelAndView = new ModelAndView("product/list");
        List<Product> productList = productService.findAll();
        modelAndView.addObject("listProduct", productList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("product/create");
        return modelAndView;
    }

    @PostMapping("/create")
    public String actionCreate(@RequestParam("name") String name,
                               @RequestParam("catalog") String catalog,
                               @RequestParam("des") String des,
                               @RequestParam("price") double price,
                               @RequestParam("status") boolean status){
        long id;
        id = productService.findAll().isEmpty() ? 1L : productService.findAll().get(productService.findAll().size()-1).getProductId() + 1;
        Product product = new Product(id,name,catalog,des,price,status);
        productService.save(product);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public ModelAndView showFormEdit(@PathVariable Long id){
        Product product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("product/edit");
        modelAndView.addObject("product",product);
        return modelAndView;
    }
    @PostMapping("/update/{id}")
    public String actionEdit(@PathVariable Long id,
                              @RequestParam("name") String name,
                              @RequestParam("catalog") String catalog,
                              @RequestParam("des") String des,
                              @RequestParam("price") double price,
                              @RequestParam("status") boolean status){
        Product product = productService.findById(id);
        product.setProductName(name);
        product.setCatalogName(catalog);
        product.setDescription(des);
        product.setPrice(price);
        product.setStatus(status);
        productService.save(product);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public ModelAndView showFormDelete(@PathVariable Long id){
        Product product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("product/delete");
        modelAndView.addObject("product",product);
        return modelAndView;
    }
    @PostMapping("/delete/{id}")
    public String actionDelete(@PathVariable Long id){
        productService.delete(id);
        return "redirect:/";
    }
    @GetMapping("/{id}")
    public ModelAndView detailProduct(@PathVariable Long id){
        Product product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("product/detail");
        modelAndView.addObject("product",product);
        return modelAndView;
    }
}

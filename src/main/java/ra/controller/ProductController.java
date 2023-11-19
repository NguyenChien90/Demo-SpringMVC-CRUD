package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ProductController {
    @GetMapping
    public ModelAndView showListProduct(){
        ModelAndView modelAndView = new ModelAndView("product/list");
        return modelAndView;
    }
}

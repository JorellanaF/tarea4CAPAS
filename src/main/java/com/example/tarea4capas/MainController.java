package com.example.tarea4capas;

import com.example.tarea4capas.domain.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class MainController {

    @RequestMapping("/productos")
    public ModelAndView form(@Valid @ModelAttribute Producto producto, BindingResult result){
        ModelAndView mod = new ModelAndView();
        mod.addObject("producto", new Producto());
        mod.setViewName("index");

        return mod;
    }

    @RequestMapping("/resultado")
    public ModelAndView procesform(@Valid @ModelAttribute Producto producto, BindingResult result){
        ModelAndView mod = new ModelAndView();

        if(result.hasErrors()){
            mod.setViewName("index");
        }else {
            mod.addObject("nombre", "Producto " + producto.getNombre() + " guardado con exito");
            mod.setViewName("resultado");
        }

        return mod;
    }
}

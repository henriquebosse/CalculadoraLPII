package br.edu.usj.lpii.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Calculadora {

    @PostMapping(value="/calcula")
    public ModelAndView postCalcular(
        @RequestParam String numero1, 
        @RequestParam String numero2,
        @RequestParam String operador) {
        
        ModelAndView modelAndView = new ModelAndView("index");
        Double resultado = 0.0;
            //Henrique
        switch (operador) {
            case "+":
                resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
                break;
            case "-":
                resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
                break;
            case "*":
                resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
                break;
            case "/":
                resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);
                break;                                    
            default:
                // code block
            }

        String txtResultado = "O Resultade é: " + resultado;

        modelAndView.addObject("mensagem", txtResultado);

        return modelAndView;
    }
    

}
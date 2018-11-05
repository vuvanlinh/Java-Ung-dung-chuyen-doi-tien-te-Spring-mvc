package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyExchangeController {

    public double vnd;


    @RequestMapping("exchange")
    public String exchange(@RequestParam double usd, @RequestParam double rate, Model model) {
        vnd = usd * rate;
        model.addAttribute("VND", vnd);
        return "index";
    }
}

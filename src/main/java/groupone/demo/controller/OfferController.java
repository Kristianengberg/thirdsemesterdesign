package groupone.demo.controller;

import groupone.demo.model.Offer;
import groupone.demo.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class OfferController {

    private OfferService offerService;

    public OfferController(OfferService offerService){
        this.offerService = offerService;
    }

    @GetMapping("/offers")
    public String offerIndex(Model model){
        model.addAttribute("offers", offerService.findAll());
        return "/offers/offers";
    }


}

package com.example.CabBooking.Controller;

import java.util.List;

import com.example.CabBooking.Service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.CabBooking.Booking;

@Controller
public class CabController {

    @Autowired
    CabService cabService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Booking> listbooking = cabService.listAll();
        model.addAttribute("listbooking", listbooking);
        System.out.print("Get / ");
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("booking", new Booking());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveBooking(@ModelAttribute("booking") Booking cbk) {
        cabService.save(cbk);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String deletebooking(@PathVariable(name = "id") int id) {
        cabService.delete(id);
        return "redirect:/";
    }

    /*@RequestMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Booking cbk = cabService.get(id);
        mav.addObject("booking", cbk);
        return mav;

    }*/
}
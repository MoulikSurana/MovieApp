package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Movie;
import com.service.MovieService;

@Controller
@RequestMapping("/customer")
public class control {


    @Autowired
    private MovieService moviesService;

    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List < Movie > theCustomers = moviesService.getMovies();
        theModel.addAttribute("customers", theCustomers);
        return "list-movies";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Movie theCustomer = new Movie();
        theModel.addAttribute("customer", theCustomer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Movie theCustomer) {
        moviesService.saveMovie(theCustomer);
        return "redirect:/customer/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("customerId") int theId,
        Model theModel) {
        Movie theCustomer = moviesService.getMovie(theId);
        theModel.addAttribute("customer", theCustomer);
        return "customer-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int theId) {
        moviesService.deleteMovie(theId);
        return "redirect:/customer/list";
    }
	
}

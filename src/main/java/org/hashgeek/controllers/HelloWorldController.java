package org.hashgeek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: Basu
 * Date: 3/25/12
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/welcome")
public class HelloWorldController  {

    @RequestMapping(method = RequestMethod.GET)
    protected ModelAndView helloWorld() {
        ModelAndView modelAndView = new ModelAndView("welcomePage");
        modelAndView.addObject("msg", "Hello World");
        return modelAndView;
    }

}

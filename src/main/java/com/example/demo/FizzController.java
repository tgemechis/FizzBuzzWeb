package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;

@Controller
public class FizzController {

    @RequestMapping("/fizzbuzz")
    public String myFizzBuzz(Model model) {

        Scanner num = new Scanner(System.in);

        StringBuilder fizzbuzzString = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {

                //System.out.println("fizzbuzz");
                fizzbuzzString.append("fizzbuzz<br />");

            } else if (i % 5 == 0) {

                // System.out.println("buzz ");
                fizzbuzzString.append("buzz<br />");

            } else if (i % 3 == 0) {
                //  System.out.println("fizz");
                fizzbuzzString.append("fizz<br />");

            }
        }
        model.addAttribute("ourstring", fizzbuzzString);

        return "index";


    }

}
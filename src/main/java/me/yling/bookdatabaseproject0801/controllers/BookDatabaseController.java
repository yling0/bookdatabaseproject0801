package me.yling.bookdatabaseproject0801.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookDatabaseController {

    @RequestMapping ("/")
    public @ResponseBody String firstRequest()
    {
        return "Welcome to the book database!";
    }

    @RequestMapping ("/findbooks")
    public @ResponseBody String Findbooks()
    {
        return "Select category";
    }

    @RequestMapping ("/findbooksbyauthor")
    public @ResponseBody String Findbooksbyauthor()
    {
        return "Select author";
    }

    @RequestMapping ("/findbooksbySKU")
    public @ResponseBody String FindbooksbySKU()
    {
        return "Select SKU";
    }

    @RequestMapping ("/addbook")
    public @ResponseBody String Addbook()
    {
        return "This is where to add books";
    }

    @RequestMapping ("/deletebook")
    public @ResponseBody String Deletebook()
    {
        return "This is where to delete books";
    }

    @RequestMapping ("/showallbooks")
    public @ResponseBody String Showallbooks()
    {
        return "This is a list of all books";
    }

}

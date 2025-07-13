package com.bitsbytes.eazyschool.controller;

import com.bitsbytes.eazyschool.model.Contact;
import com.bitsbytes.eazyschool.service.ContactService;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ContactController {

    public static Logger log= LoggerFactory.getLogger(ContactController.class);
    private final ContactService contactService;


    @Autowired
    public ContactController(ContactService contactService){
        this.contactService=contactService;
    }

    @RequestMapping(value = {"/contact"})
    public String displayContactPage(){
        return "contact.html";
    }

//    @RequestMapping(value= "/saveMsg",  method=POST)
//    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum, @RequestParam String email, @RequestParam String subject, @RequestParam String message )
//    {
//        log.info("Name: "+name);
//        log.info("Mobile number: "+mobileNum);
//        log.info("email: "+email);
//        log.info("subject: "+subject);
//        log.info("message: "+message);
//        return new ModelAndView("redirect:/contact");
//    }

    @RequestMapping(value= "/saveMsg",  method=POST)
    public ModelAndView saveMessage(Contact contact)
    {
        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }
}

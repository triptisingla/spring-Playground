package com.bitsbytes.eazyschool.service;

import com.bitsbytes.eazyschool.controller.ContactController;
import com.bitsbytes.eazyschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContactService {

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved=true;
        log.info(contact.toString());
        return isSaved;
    }
}

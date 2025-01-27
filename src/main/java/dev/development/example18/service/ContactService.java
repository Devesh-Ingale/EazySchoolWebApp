package dev.development.example18.service;


import dev.development.example18.model.Contact;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/*
@Slf4j, is a Lombok-provided annotation that will automatically generate an SLF4J
Logger static property in the class at compilation time.
* */
//@Slf4j
@Service
public class ContactService {

    /**
     * Save Contact Details into DB
     * @param contact
     * @return boolean
     */
    private static Logger log = Logger.getLogger(ContactService.class.getName());

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        //TODO - Need to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }

}

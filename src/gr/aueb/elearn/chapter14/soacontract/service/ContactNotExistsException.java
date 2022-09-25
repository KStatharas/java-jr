package gr.aueb.elearn.chapter14.soacontract.service;

import gr.aueb.elearn.chapter14.soacontract.model.Contact;

public class ContactNotExistsException extends Exception{
    public ContactNotExistsException(Contact contact){
        super("Contact with id: " + contact.getId() + "not exists.");
    }

    public ContactNotExistsException(long id){
        super("Contact with id: " + id + "not exists.");
    }
}

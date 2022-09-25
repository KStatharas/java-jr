package gr.aueb.elearn.chapter14.soacontract.service;

import gr.aueb.elearn.chapter14.soacontract.model.Contact;

public class ContactAlreadyExistsException extends Exception{
    public ContactAlreadyExistsException(Contact contact){
        super("Contact with id: " + contact.getId() + "already exists.");
    }
}

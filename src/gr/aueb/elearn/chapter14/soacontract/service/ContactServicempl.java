package gr.aueb.elearn.chapter14.soacontract.service;

import gr.aueb.elearn.chapter14.soacontract.dao.IContactDAO;
import gr.aueb.elearn.chapter14.soacontract.dto.ContactDTO;
import gr.aueb.elearn.chapter14.soacontract.model.Contact;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ContactServicempl implements IContactService{
    private final IContactDAO dao;

    public ContactServicempl(IContactDAO dao) {
        this.dao = dao;
    }

    @Override
    public Optional<Contact> insertContact(ContactDTO contactDTO) throws ContactAlreadyExistsException {

       try {
           Contact contact = convertDTO(contactDTO);
           Optional<Contact> optionalContact = dao.update(contact);
           if (optionalContact.isEmpty()) {
               throw new ContactNotExistsException(contact);
           }
           else {
               return optionalContact;
           }
       }

       catch (ContactNotExistsException e) {
           throw new RuntimeException(e);
       }
    }

    @Override
    public Optional<Contact> updateContact(ContactDTO contactDTO) throws ContactNotExistsException {
        return Optional.empty();
    }

    @Override
    public void deleteContact(long id) throws ContactNotExistsException {

       try{
           if(!dao.delete(id)){
               throw new ContactNotExistsException(id);
           }
       }
       catch (ContactNotExistsException e){
           System.err.println("Contact not exists excepton " + LocalDateTime.now());
           throw e;
       }
    }

    @Override
    public List<Contact> getAllContacts() {
        return dao.getAll();
    }

    @Override
    public Optional<Contact> getOneContact(long id) throws ContactNotExistsException {


        try{
            Optional<Contact> contact = dao.getOne(id);
            if(contact.isPresent()){
                return contact;
            }
            else {
                throw new ContactNotExistsException(id);
            }
        }
        catch (ContactNotExistsException e){
            System.err.println("Contact not exists excepton " + LocalDateTime.now());
            throw e;
        }
    }

    private Contact convertDTO (ContactDTO contactDTO){
        return new Contact(contactDTO.getId(), contactDTO.getFirstname(), contactDTO.getLastname());
    }
}

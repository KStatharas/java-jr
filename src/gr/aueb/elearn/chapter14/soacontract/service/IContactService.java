package gr.aueb.elearn.chapter14.soacontract.service;

import gr.aueb.elearn.chapter14.soacontract.dto.ContactDTO;
import gr.aueb.elearn.chapter14.soacontract.model.Contact;

import java.util.List;
import java.util.Optional;

public interface IContactService {
    Optional<Contact> insertContact (ContactDTO contactDTO) throws ContactAlreadyExistsException;
    Optional<Contact> updateContact (ContactDTO contactDTO) throws ContactNotExistsException;
    void deleteContact(long id) throws ContactNotExistsException;
    List<Contact> getAllContacts();
    Optional<Contact> getOneContact(long id) throws ContactNotExistsException;
}


package gr.aueb.elearn.chapter14.soacontract.dao;

import gr.aueb.elearn.chapter14.soacontract.model.Contact;

import java.util.List;
import java.util.Optional;

public interface IContactDAO {
    boolean insert (Contact contact);
    Optional<Contact> update(Contact contact);
    boolean delete(long id);
    List<Contact> getAll();
    Optional<Contact> getOne(long id);
}

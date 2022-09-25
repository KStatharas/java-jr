package gr.aueb.elearn.chapter14.soacontract.dao;

import gr.aueb.elearn.chapter14.soacontract.model.Contact;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class ContractDAOimpl implements IContactDAO{

    private static final List<Contact> contacts = new LinkedList<>();

    @Override
    public boolean insert(Contact contact) {
        if (contact == null) return false;
        if (contacts.contains(contact)) return false;
        contacts.add(contact);
        return true;
    }

    @Override
    public Optional<Contact> update(Contact contact) {
        if (contact == null) return Optional.empty();
        int positionToUpdate = getPosition(contact.getId());
        if (positionToUpdate != -1){
            Contact contactToReturn = contacts.get(positionToUpdate);
            contacts.set(positionToUpdate,contact);
            return Optional.of(contactToReturn);
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(long id) {
        int positionToDelete = getPosition(id);
        if (positionToDelete != -1){
            contacts.remove(positionToDelete);
            return true;
        }

        return false;
    }

    @Override
    public List<Contact> getAll() {
        return new ArrayList<Contact>(contacts);
    }

    @Override
    public Optional<Contact> getOne(long id) {
        int positionToReturn = getPosition(id);
        if (positionToReturn != -1){
            return Optional.of(contacts.get(positionToReturn));
        }
        else {
            return Optional.empty();
        }
    }

    private int getPosition(long id){
        int positionToReturn = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId() == id){
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}

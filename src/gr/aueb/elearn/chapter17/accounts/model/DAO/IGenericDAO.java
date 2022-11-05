package gr.aueb.elearn.chapter17.accounts.model.DAO;

import java.util.Map;

public interface IGenericDAO<T> {
    T insert(long id, T t);
    void delete(long id);
    void replace (long id, T t);
    T get(long id);
    Map<Long,T> getAll();
}

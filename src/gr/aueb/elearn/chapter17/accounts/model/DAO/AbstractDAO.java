package gr.aueb.elearn.chapter17.accounts.model.DAO;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDAO<T> implements IGenericDAO<T> {
    protected Map<Long,T> entities = new HashMap<>();

    @Override
    public T insert(long id, T t) {
        if (entities.containsKey(id)) return null;
        entities.put(id,t);
        return t;
    }

    @Override
    public void delete(long id) {
      entities.remove(id);
    }

    @Override
    public void replace(long id, T t) {
        entities.replace(id,t);
    }

    @Override
    public T get(long id) {
        return entities.get(id);
    }

    @Override
    public Map<Long, T> getAll() {
        return new HashMap<>(entities);
    }
}

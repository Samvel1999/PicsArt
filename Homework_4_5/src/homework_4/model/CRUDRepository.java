package homework_4.model;

public interface CRUDRepository<T> {
    T get(int id);
    void save(T t);
    void update(T t);
    void delete(T t);
}

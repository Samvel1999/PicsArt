package homework_4.interfaces;

import java.util.List;

public interface DeviceService<T> {
    T create();
    List<T> getAll();
    T getById(Integer id);
    List<T> getByModel(String model);
    List<T> getByColor(String color);
    List<T> getByPrice(Integer price);
    void save();
    void save(T t);
    void update(Integer id, T t);
    void delete(Integer id);
    void print(List<T> tList);

}

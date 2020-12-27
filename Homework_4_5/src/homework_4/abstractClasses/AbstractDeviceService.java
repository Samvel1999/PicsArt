package homework_4.abstractClasses;

import homework_4.interfaces.DeviceService;

import java.util.List;

public abstract class AbstractDeviceService<T> implements DeviceService<T> {
    public void print(List<T> tList) {
        for(T t : tList) {
            System.out.println(t);
        }
    }
}

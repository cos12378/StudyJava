package service;

import java.util.ArrayList;
import java.util.List;

//single ton : 혼자 돌아갈수 있게 하는것
public class Service {
    private final List<Integer> list = new ArrayList<>();

    public void insert(int number) {
        list.add(number);
    }
    private static Service instance;
    public static Service getInstance(){
        if(instance == null) {
            instance = new Service();
        }
        return instance;
    }

}

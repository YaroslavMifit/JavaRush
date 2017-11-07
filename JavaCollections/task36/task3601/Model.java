package com.javarush.task.task36.task3601;

import java.util.List;

/**
 * Created by ЯРОСЛАВ on 26.09.2017.
 */
public class Model {

    Service service = new Service();

    public List<String> getStringDataList() {
        return service.getData();
    }
}

package com.kingmhar;

import java.util.List;

/**
 * Created by Kingmhar on 7/23/16.
 */
public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);

}

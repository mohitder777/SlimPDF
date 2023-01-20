package com.jicsoftwarestudio.slimpdfapp.dao;

import com.jicsoftwarestudio.slimpdfapp.models.ConfigModel;

public interface ConfigDao {
    ConfigModel getConfigBykey(int i);

    void incrementConfigValue(int i);

    void insert(ConfigModel configModel);

    void setRewarded(int i, int i2);
}

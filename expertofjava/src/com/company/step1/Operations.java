package com.company.step1;

public interface Operations {
    void save(User user);
    void update(Long id,User user);
    boolean delete(Long id);
}

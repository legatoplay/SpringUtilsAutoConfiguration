package com.gary.demo;

import org.springframework.stereotype.Service;

@Service
public interface IHelloService {
    void sayHello(String word);
}

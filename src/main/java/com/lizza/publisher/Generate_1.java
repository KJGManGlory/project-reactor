package com.lizza.publisher;

import org.junit.Test;
import reactor.core.publisher.Flux;

public class Generate_1 {

    @Test
    public void test1() {
        Flux.generate(
                () -> 0,
                (state, sink) -> {

                }
        );
    }
}

package com.devleandro.EventClean.infra.services.id;

import com.devleandro.EventClean.core.services.EventIdGenerator;

import java.util.Random;
public class RandomIdGenerator implements EventIdGenerator {

    private static final Random RANDOM = new Random();

    @Override
    public String generate() {

        String letters = RANDOM.ints(3, 65, 91)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();

        String numbers = String.format("%03d", RANDOM.nextInt(1000));

        return letters + numbers;
    }
}

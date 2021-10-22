package com.lunatech.builders;

import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void testBuilder() {
            ImmutableMyClass.builder()
                    .foo("Hey")
                    .build();
    }

}

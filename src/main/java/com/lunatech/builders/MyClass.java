package com.lunatech.builders;

import org.immutables.value.Value;

@Value.Immutable
public interface MyClass {
    String foo();
    Integer bar();
}

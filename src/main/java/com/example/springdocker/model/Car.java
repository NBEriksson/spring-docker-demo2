package com.example.springdocker.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {
    String id;
    String model;
    boolean inUse;

    public String getModel() {
        return model;
    }
}

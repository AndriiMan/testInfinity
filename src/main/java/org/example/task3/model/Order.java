package org.example.task3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order extends Document {
    private Date deadline;

    @Override
    public double getRabat() {
        return 0.0;
    }
}
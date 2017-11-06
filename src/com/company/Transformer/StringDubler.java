package com.company.Transformer;

public class StringDubler implements Transformer {

    @Override
    public Object transform(Object o) {
        return o.toString() + o.toString();
    }

}

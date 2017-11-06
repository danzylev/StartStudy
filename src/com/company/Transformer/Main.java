package com.company.Transformer;

public class Main {

    public static void main(String[] args){
        Item head = new Item();
        head.value = 0;
        List list = new List(head);
        for (int i = 1; i < 7; i++) {
            list.add(i);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(list.get(i));
        }
        StringDubler dubler = new StringDubler();
        //List res = transform(dubler);


    }

    public List trasform(Transformer transformer, List list) {
        List ret = new List();
/**
        for (int i = 0; i < 5; i++) {
            int o = list.get(i);
            res = transformer.transform(o);

            ret.add(res.value);
        }
 **/

        return ret;
    }
}

package com.company.collections;

import com.company.collections.inner.MessageGenerator;
import com.company.collections.inner.Message;
import com.company.collections.inner.MessagePriority;

import java.util.Collection;
import java.util.List;

import static com.company.collections.inner.MessagePriority.LOW;

/**
 * Created by xmitya on 17.10.16.
 */
public class Tasks1 {

    public static void main(String[] args) {
        MessageGenerator generator = new MessageGenerator();
        List<Message> messages = generator.generate(10);

        countEachPriority(messages);
        /*countCountEachCode(messages);
        countUniqueMessages(messages);

        System.out.println("Genuine messages in natural order: \n" + genuineMessagesInOriginalOrder(messages));

        removeEach(generator.generate(100), MessagePriority.LOW);
        removeOther(generator.generate(100), MessagePriority.URGENT);
        */
    }

    private static void countEachPriority(List<Message> messages) {
        // Сосчитайте количество сообщений для каждого приоритета.
        // Ответ необходимо вывести в консоль.

        int l = 0, m = 0, h = 0, u = 0;

        for (Message mess : messages) {
            MessagePriority p = mess.getPriority();
            switch (p) {
                case LOW:
                    l++;
                case HIGH:
                    h++;
                case MEDIUM:
                    m++;
                case URGENT:
                    u++;
            }
        }
        System.out.println("LOW - " + l + " " + "MEDIUM - " + m + " " + "HIGH - " + h + " " + "URGENT - " + u);

    }

    private static void countCountEachCode(List<Message> messages) {
        // Сосчитайте количество сообщений для каждого кода сообщения.
        // Ответ необходимо вывести в консоль.

        // TODO implement
    }

    private static void countUniqueMessages(List<Message> messages) {
        // Сосчитайте количество уникальных сообщений.
        // Ответ необходимо вывести в консоль.

        // TODO implement
    }

    private static List<Message> genuineMessagesInOriginalOrder(List<Message> messages) {
        // Здесь необходимо вернуть только неповторяющиеся сообщения и в том порядке, в котором
        // они встречаются в первоначальном списке. Например, мы на входе имеем такие сообщения:
        // [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}],
        // то на выходе должны получить:
        // [{URGENT, 4}, {HIGH, 9}, {LOW, 3}].
        // Т.е. остались только уникальные значения, и порядок их поступления сохранен.

        // TODO implement

        return messages;
    }

    private static void removeEach(Collection<Message> messages, MessagePriority priority) {
        // Удалить из коллекции каждое сообщение с заданным приоритетом.
        System.out.printf("Before remove each: %s, %s\n", priority, messages);

        // TODO implement

        System.out.printf("After remove each: %s, %s\n", priority, messages);
    }

    private static void removeOther(Collection<Message> messages, MessagePriority priority) {
        // Удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет.
        System.out.printf("Before remove other: %s, %s\n", priority, messages);

        // TODO implement

        System.out.printf("After remove other: %s, %s\n", priority, messages);
    }
}
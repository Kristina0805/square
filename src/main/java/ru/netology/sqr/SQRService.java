package ru.netology.sqr;

public class SQRService {
    public int service(int Min, int Max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= Min)
            if (i * i <= Max)

            count++;
        }
        return count;

    }

}

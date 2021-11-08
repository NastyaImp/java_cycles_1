package ru.netology.sqr;

public class SQRService {
    public long sqr( long downLimit, long upLimit) {
        int counter = 0;
        for ( int i=10; i<=99; i++){
            if ( downLimit <= i*i && i*i <= upLimit ) {
                counter = counter+1;
            }
        }
            return counter;
    }
}

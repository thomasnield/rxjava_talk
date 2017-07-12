package examples;

import io.reactivex.Observable;

public class Ch1_1A {

    public static void main(String[] args) {

        Observable<String> myStrings =
                Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");

        myStrings.subscribe(
                System.out::println,
                Throwable::printStackTrace,
                () -> System.out.println("Done!")
        );
    }
}

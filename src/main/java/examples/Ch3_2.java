/* Compilable code examples can be found at https://github.com/thomasnield/packt_learning_rxjava */

package examples;

import io.reactivex.Observable;

public class Ch3_2 {

    public static void main(String[] args) {

        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .take(3)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}
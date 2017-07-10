/* Compilable code examples can be found at https://github.com/thomasnield/packt_learning_rxjava */

package examples;

import io.reactivex.Observable;

public class Ch3_25 {
    public static void main(String[] args) {
        Observable.just(5, 3, 7, 10, 2, 14)
                .reduce((total, next) -> total + next)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
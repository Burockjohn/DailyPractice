package day52_DailyReviews;

@FunctionalInterface
public interface MergeArraylists<T, U, R> {

    R apply(T t, U u);


}

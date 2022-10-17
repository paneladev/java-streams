package pdev.com.streams.testes;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class WorkWithStreams {

    @Test
    @Disabled
    void streams() {
        List<String> estados = List.of("Paraiba", "Santa Catarina", "Rio de Janeiro", "Piaui");
        Stream<String> stream = estados.stream();
        Stream<String> streams = Stream.of("Paraiba", "Santa Catarina", "Rio de Janeiro", "Piaui");

//        Object collect = estados.stream()
//                .map(null)
//                .filter(null)
//                .filter(null)
//                .limit(null)
//                .collect(Collectors.toList());


    }
}

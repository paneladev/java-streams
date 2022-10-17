package pdev.com.streams.testes;

import org.junit.jupiter.api.Test;
import pdev.com.streams.bean.Estado;
import pdev.com.streams.bean.EstadoDTO;
import pdev.com.streams.mock.MockData;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

class MapAndReduce {

    @Test
    void mapToDto() throws IOException {
        List<Estado> estados = MockData.getEstados();

        List<EstadoDTO> estadosDto = estados.stream()
                .filter(estado -> estado.getMunicipios() > 300)
                .map(estado -> new EstadoDTO(estado.getId(), estado.getNome(), estado.getSigla()))
                .collect(Collectors.toList());

        estadosDto.forEach(System.out::println);
    }

    @Test
    void average() throws IOException {
        List<Estado> estados = MockData.getEstados();

        double average = estados.stream()
                .mapToDouble(estado -> estado.getMunicipios())
                .average()
                .orElse(0);

        System.out.println(average);
    }

    @Test
    void reduce() throws IOException {
        List<Estado> estados = MockData.getEstados();

        long reduce = estados.stream()
                .mapToInt(value -> value.getMunicipios())
                .reduce(0, Integer::sum);

        System.out.println(reduce);
    }
}

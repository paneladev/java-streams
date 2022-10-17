package pdev.com.streams.testes;

import org.junit.jupiter.api.Test;
import pdev.com.streams.bean.Estado;
import pdev.com.streams.mock.MockData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class PrimeiroTeste {

    @Test
    void imperativeCode() throws IOException {
        // 1. Encontre os estados com menos de 100 municipios
        // 2. Limite até 5 estados

        List<Estado> estados = MockData.getEstados();

        List<Estado> estadoPoucosMunicipios = new ArrayList<>();
        int limite = 5;
        int contador = 0;

        for (Estado estado : estados) {
            if (estado.getMunicipios() <= 100) {
                estadoPoucosMunicipios.add(estado);
                contador++;
                if (contador == limite) {
                    break;
                }
            }
        }
        estadoPoucosMunicipios.forEach(System.out::println);
    }

    @Test
    void declarativeCodeUsandoStreams() throws Exception {
        List<Estado> estados = MockData.getEstados();

        List<Estado> estadosMenores = estados.stream()
                .filter(estado -> estado.getMunicipios() <= 100)
                .limit(10)
                .collect(Collectors.toList());

        estadosMenores.forEach(System.out::println);
    }
}

/**
 *  @see https://mit-license.org/
 *  The MIT License (MIT)
 * Copyright © 2019 <copyright holders>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the “Software”), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions: The above copyright
 * notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package buscas;

import grafocidades.Adjacente;
import grafocidades.Cidade;
import grafocidades.Mapa;
import java.util.ArrayList;
import static java.util.Comparator.comparingInt;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/**
 * 30/10/2019 00:40:30
 *
 * @author murilotuvani
 */
public class AEstrela {

    private final Cidade objetivo;
    private boolean achou;

    public AEstrela(Cidade objetivo) {
        this.objetivo = objetivo;
        this.achou = false;
    }

    public void buscar(Cidade atual) {
        System.out.println("Atual : " + atual.getNome());
        atual.setVisitado(true);

        Predicate<Adjacente> predicate = (Adjacente t) -> !t.getCidade().isVisitado();
        ToIntFunction<Adjacente> distancias = a -> a.getDistanciaAEstrela();

        if (atual.equals(this.objetivo)) {
            achou = true;

        } else {
            List<Adjacente> fronteira = new ArrayList<>(atual.getAdjacentes()
                    .stream().filter(predicate)
                    .sorted(comparingInt(distancias))
                    .collect(Collectors.toList()));
            fronteira.forEach(f -> {
                f.getCidade().setVisitado(true);
            });

            System.out.println(fronteira);
            if (!fronteira.isEmpty()) {
                Adjacente ajacente = fronteira.get(0);
                int distancia = ajacente.getDistanciaAEstrela();
                System.out.println(ajacente + " distancia " + distancia);
                buscar(fronteira.get(0).getCidade());
            }
        }
    }

    public static void main(String args[]) {
        Mapa mapa = new Mapa();
        AEstrela g = new AEstrela(mapa.getCuritiba());
        g.buscar(mapa.getPortoUniao());
    }

}

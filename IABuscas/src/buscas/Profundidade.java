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

import estruturas.Pilha;
import grafocidades.Adjacente;
import grafocidades.Cidade;
import grafocidades.Mapa;

/**
 * 24/10/2019 22:47:43
 *
 * @author murilotuvani
 */
public class Profundidade {

    private final Pilha fronteira;
    private final Cidade inicio;
    private final Cidade objetivo;
    private boolean achou;
    private final boolean ateEncontrar;

    public Profundidade(Cidade inicio, Cidade objetivo, boolean ateEncontrar) {
        this.inicio = inicio;
        this.inicio.setVisitado(true);
        this.objetivo = objetivo;
        this.achou = false;
        this.ateEncontrar = ateEncontrar;

        fronteira = new Pilha(20);
        fronteira.empilhar(inicio);
    }

    public void buscar() {
        Cidade topo = fronteira.getTopo();
        System.out.println(topo.getNome());

        if (topo.equals(objetivo)) {
            achou = true;
        } else {
            for (Adjacente a : topo.getAdjacentes()) {
                if (!achou) {
                    System.out.println("Verificando se a cidade já foi visitada : " + a.getCidade().getNome() + " Visitada : " + a.getCidade().isVisitado());

                    if (!a.getCidade().isVisitado()) {
                        a.getCidade().setVisitado(true);
                        System.out.println("Visitando : " + a.getCidade().getNome());
                        fronteira.empilhar(a.getCidade());
                        buscar();
                    }
                }
            }
        }

        System.out.println("Desempilhou : " + fronteira.desempilhar().getNome());

    }

    public static void main(String args[]) {
        Mapa mapa = new Mapa();
        Profundidade p = new Profundidade(mapa.getPortoUniao(), mapa.getCuritiba(), true);
        p.buscar();
    }
}

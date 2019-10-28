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

import estruturas.Fila;
import grafocidades.Adjacente;
import grafocidades.Cidade;
import grafocidades.Mapa;

/**
 * 27/10/2019 21:23:06
 *
 * @author murilotuvani
 */
public class Largura {

    private Fila fronteira;
    private final Cidade inicio;
    private final Cidade objetivo;
    private boolean achou = false;

    public static void main(String args[]) {
        Mapa mapa = new Mapa();
        Largura l = new Largura(mapa.getPortoUniao(), mapa.getCuritiba(), true);
        l.buscar();
    }

    private Largura(Cidade inicio, Cidade objetivo, boolean b) {
        this.inicio = inicio;
        this.inicio.setVisitado(true);
        this.objetivo = objetivo;
        this.achou = false;

        fronteira = new Fila(20);
        fronteira.enfileirar(inicio);
    }

    private void buscar() {
        Cidade primeiro = fronteira.getPrimeiro();
        System.out.println("Primeiro : " + primeiro);
        
        
        if (primeiro.equals(this.objetivo)) {
            achou = true;
        }

        System.out.println("Desenfileirou : " + fronteira.desenfileirar());
        if (!achou) {
            for (Adjacente adj : primeiro.getAdjacentes()) {
                Cidade cidadeAdj = adj.getCidade();
                if (!cidadeAdj.isVisitado()) {
                    cidadeAdj.setVisitado(true);
                    fronteira.enfileirar(cidadeAdj);
                }
            }
            if (fronteira.getNumeroElementos() > 0) {
                buscar();
            }
            
        }

    }

}

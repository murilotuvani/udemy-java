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

import estruturas.VetorOrdenado;
import grafocidades.Adjacente;
import grafocidades.Cidade;
import grafocidades.Mapa;

/**
 * 29/10/2019 23:34:34
 *
 * @author murilotuvani
 */
public class Gulosa {
    
    private VetorOrdenado fronteira;
    private Cidade objetivo;
    private boolean achou;
    
    public Gulosa(Cidade objetivo) {
        this.objetivo = objetivo;
        achou = false;
    }
    
    public void buscar(Cidade atual) {
        System.out.println("Atual : " + atual.getNome());
        
        if (atual.equals(objetivo)) {
            achou = true;
        } else {
            fronteira = new VetorOrdenado(atual.getAdjacentes().size());
            for (Adjacente a : atual.getAdjacentes()) {
                if (!a.getCidade().isVisitado()) {
                    a.getCidade().setVisitado(true);
                    fronteira.inserir(a.getCidade());
                }
            }
            fronteira.mostrar();
            if (fronteira.getPrimeiro() != null) {
                buscar(fronteira.getPrimeiro());
            }
        }
    }
    
    public static void main(String args[]) {
        Mapa mapa = new Mapa();
        Gulosa g = new Gulosa(mapa.getCuritiba());
        g.buscar(mapa.getPortoUniao());
    }
    
}

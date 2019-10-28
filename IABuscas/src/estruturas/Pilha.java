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
package estruturas;

import grafocidades.Cidade;

/**
 * 24/10/2019 22:17:48
 *
 * @author murilotuvani
 */
public class Pilha {

    private int tamanho;
    private Cidade[] cidades;
    private int topo;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.cidades = new Cidade[this.tamanho];
        topo = -1;
    }

    public void empilhar(Cidade cidade) {
        this.cidades[++topo] = cidade;
    }

    public Cidade desempilhar() {
        return cidades[topo--];
    }

    public Cidade getTopo() {
        return cidades[topo];
    }

    public boolean pilhaVazia() {
        return (topo == -1);
    }

    public boolean pilhaCheia() {
        return (topo == tamanho - 1);
    }

}

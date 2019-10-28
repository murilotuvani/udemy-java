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
import grafocidades.Mapa;

/**
 * 27/10/2019 21:20:56
 *
 * @author murilotuvani
 */
public class Fila {

    private int tamanho;
    private Cidade[] cidades;
    private int inicio;
    private int fim;
    private int numeroElementos;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        this.cidades = new Cidade[tamanho];
        this.inicio = 0;
        this.fim = -1;
        this.numeroElementos = 0;
    }

    /**
     * Enfileirar
     *
     * @param cidade
     * @return se consiguiu enfileirar o item
     */
    public boolean enfileirar(Cidade cidade) {
        if (!filaCheia()) {
            if (fim == tamanho - 1) {
                fim = -1;
            }
            cidades[++fim] = cidade;
            numeroElementos++;
            return true;
        } else {
            System.out.println("Fila cheia");
            return false;
        }
    }

    public int getNumeroElementos() {
        return numeroElementos;
    }

    /**
     * desenfileirar
     *
     * @return Cidade
     */
    public Cidade desenfileirar() {
        if (!filaVazia()) {
            Cidade tmp = cidades[inicio++];
            if (inicio == tamanho) {
                inicio = 0;
            }
            numeroElementos--;
            return tmp;
        } else {
            System.out.println("Fila vazia");
            return null;
        }
    }

    public Cidade getPrimeiro() {
        return cidades[inicio];
    }

    public boolean filaVazia() {
        return (numeroElementos == 0);
    }

    public boolean filaCheia() {
        return (numeroElementos == tamanho);
    }
    
    public static void main(String args[]) {
        Fila fila = new Fila(5);
        Mapa mapa = new Mapa();
        
        fila.enfileirar(mapa.getAraucaria());
        fila.enfileirar(mapa.getBalsaNova());
        fila.enfileirar(mapa.getContenda());
        
        fila.desenfileirar();
        fila.desenfileirar();
        
        fila.enfileirar(mapa.getCanoinhas());
        fila.enfileirar(mapa.getIrati());
        fila.enfileirar(mapa.getPalmeira());
        fila.enfileirar(mapa.getPortoUniao());
    }

}

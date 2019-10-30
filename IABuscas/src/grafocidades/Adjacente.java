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
package grafocidades;

/**
 * 24/10/2019 21:27:46
 *
 * @author murilotuvani
 */
public final class Adjacente {

    private final Cidade cidade;
    private final int distancia;
    private final int distanciaAEstrela;

    public Adjacente(Cidade cidade, int distancia) {
        this.cidade = cidade;
        this.distancia = distancia;
        this.distanciaAEstrela = this.getCidade().getDistanciaObjetivo() + this.distancia;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public int getDistancia() {
        return distancia;
    }

    public int getDistanciaAEstrela() {
        return distanciaAEstrela;
    }

    @Override
    public String toString() {
        return "Adjacente{cidade=" + cidade.getNome() + ", distanciaAEstrela=" + distanciaAEstrela + '}';
    }

}

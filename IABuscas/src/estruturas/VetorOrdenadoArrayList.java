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
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import java.util.function.ToIntFunction;

/**
 * 28/10/2019 00:24:54
 *
 * @author murilotuvani
 */
public class VetorOrdenadoArrayList {

    public static void main(String args[]) {
        Mapa mapa = new Mapa();
        ArrayList<Cidade> cidades = new ArrayList<>();
        cidades.add(mapa.getPortoUniao());
        cidades.add(mapa.getPauloFrontin());
        cidades.add(mapa.getBalsaNova());
        
        System.out.println(cidades);
        
        ToIntFunction<Cidade> distancias = c -> c.getDistanciaObjetivo();
        cidades.sort(comparingInt(distancias));

        System.out.println(cidades);
    }

}

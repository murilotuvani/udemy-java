/**
 *  @see https://mit-license.org/
 *  The MIT License (MIT)
 * Copyright © 2019 <copyright holders>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a  copy 
 * of this software and associated documentation files (the “Software”), to deal
 * in the Software without restriction, including without limitation the  rights 
 * to use, copy, modify, merge, publish,  distribute,  sublicense,  and/or  sell 
 * copies of the Software, and  to  permit  persons  to  whom  the  Software  is 
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall  be  included  in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY  KIND,  EXPRESS  OR
 * IMPLIED, INCLUDING BUT NOT LIMITED  TO  THE  WARRANTIES  OF  MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND  NONINFRINGEMENT.  IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE  LIABLE  FOR  ANY  CLAIM,  DAMAGES  OR  OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package buscas;

import estruturas.VetorOrdenado;
import grafocidades.Adjacente;
import grafocidades.Cidade;
import grafocidades.Mapa;
import java.util.ArrayList;
import static java.util.Comparator.comparingInt;
import java.util.function.ToIntFunction;

/**
 * 29/10/2019 23:34:29
 * @author murilotuvani
 */
public class GulosaList {

    private ArrayList<Cidade> fronteira;
    private Cidade objetivo;
    private boolean achou;
    
    public GulosaList(Cidade objetivo) {
        this.objetivo = objetivo;
        achou = false;
    }
    
    public void buscar(Cidade atual) {
        System.out.println("Atual : " + atual.getNome());
        
        if (atual.equals(objetivo)) {
            achou = true;
        } else {
            fronteira = new ArrayList<>();
            for (Adjacente a : atual.getAdjacentes()) {
                if (!a.getCidade().isVisitado()) {
                    a.getCidade().setVisitado(true);
                    fronteira.add(a.getCidade());
                }
            }
            
            ToIntFunction<Cidade> distancias = c -> c.getDistanciaObjetivo();
            fronteira.sort(comparingInt(distancias));
            System.out.println(fronteira);
            
            if (!fronteira.isEmpty()) {
                buscar(fronteira.get(0));
            }
        }
    }
    
    public static void main(String args[]) {
        Mapa mapa = new Mapa();
        GulosaList g = new GulosaList(mapa.getCuritiba());
        g.buscar(mapa.getPortoUniao());
    }
}

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
package grafocidades;

import java.util.ArrayList;
import java.util.List;

/**
 * 24/10/2019 21:23:07
 * @author murilotuvani
 */
public class Cidade {
    
    private String nome;
    private boolean visitado;
    private int distanciaObjetivo;
    private final List<Adjacente> adjacentes;
    
    public Cidade(String nome, int distanciaObjetivo) {
        this.nome = nome;
        this.visitado = false;
        this.distanciaObjetivo = distanciaObjetivo;
        this.adjacentes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getDistanciaObjetivo() {
        return distanciaObjetivo;
    }

    public void setDistanciaObjetivo(int distanciaObjetivo) {
        this.distanciaObjetivo = distanciaObjetivo;
    }
    
    public boolean addCidadeAdjacente(Adjacente adjacente) {
        return this.adjacentes.add(adjacente);
    }

    public List<Adjacente> getAdjacentes() {
        return adjacentes;
    }

    @Override
    public String toString() {
        return "Cidade{nome=" + nome + '}';
    } 

}

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
 * 24/10/2019 21:35:53
 *
 * @author murilotuvani
 */
public class Mapa {

    private final Cidade portoUniao = new Cidade("Porto União", 203);
    private final Cidade pauloFrontin = new Cidade("Paulo Frontin", 172);
    private final Cidade canoinhas = new Cidade("Canoinhas", 141);
    private final Cidade irati = new Cidade("Irati", 139);
    private final Cidade palmeira = new Cidade("Palmeira", 59);
    private final Cidade campoLargo = new Cidade("Campo Largo", 27);
    private final Cidade curitiba = new Cidade("Curitiba", 0);
    private final Cidade balsaNova = new Cidade("Balsa Nova", 41);
    private final Cidade araucaria = new Cidade("Araucária", 23);
    private final Cidade saoJose = new Cidade("São José", 13);
    private final Cidade contenda = new Cidade("Contenda", 39);
    private final Cidade mafra = new Cidade("Mafra", 94);
    private final Cidade tijucas = new Cidade("Tijucas", 56);
    private final Cidade lapa = new Cidade("Lapa", 74);
    private final Cidade saoMateus = new Cidade("São Mateus", 123);
    private final Cidade tresBarras = new Cidade("Três Barras", 131);

    public Mapa() {
        portoUniao.addCidadeAdjacente(new Adjacente(pauloFrontin));
        portoUniao.addCidadeAdjacente(new Adjacente(canoinhas));
        portoUniao.addCidadeAdjacente(new Adjacente(saoMateus));
        
        pauloFrontin.addCidadeAdjacente(new Adjacente(portoUniao));
        pauloFrontin.addCidadeAdjacente(new Adjacente(irati));
        
        canoinhas.addCidadeAdjacente(new Adjacente(portoUniao));
        canoinhas.addCidadeAdjacente(new Adjacente(tresBarras));
        canoinhas.addCidadeAdjacente(new Adjacente(mafra));
        
        irati.addCidadeAdjacente(new Adjacente(pauloFrontin));
        irati.addCidadeAdjacente(new Adjacente(palmeira));
        irati.addCidadeAdjacente(new Adjacente(saoMateus));
        
        palmeira.addCidadeAdjacente(new Adjacente(irati));
        palmeira.addCidadeAdjacente(new Adjacente(saoMateus));
        palmeira.addCidadeAdjacente(new Adjacente(campoLargo));
        
        campoLargo.addCidadeAdjacente(new Adjacente(palmeira));
        campoLargo.addCidadeAdjacente(new Adjacente(balsaNova));
        campoLargo.addCidadeAdjacente(new Adjacente(curitiba));
        
        curitiba.addCidadeAdjacente(new Adjacente(campoLargo));
        curitiba.addCidadeAdjacente(new Adjacente(balsaNova));
        curitiba.addCidadeAdjacente(new Adjacente(araucaria));
        curitiba.addCidadeAdjacente(new Adjacente(saoJose));
        
        balsaNova.addCidadeAdjacente(new Adjacente(curitiba));
        balsaNova.addCidadeAdjacente(new Adjacente(campoLargo));
        balsaNova.addCidadeAdjacente(new Adjacente(contenda));
        
        araucaria.addCidadeAdjacente(new Adjacente(curitiba));
        araucaria.addCidadeAdjacente(new Adjacente(contenda));
        
        saoJose.addCidadeAdjacente(new Adjacente(curitiba));
        saoJose.addCidadeAdjacente(new Adjacente(tijucas));
        
        contenda.addCidadeAdjacente(new Adjacente(balsaNova));
        contenda.addCidadeAdjacente(new Adjacente(araucaria));
        contenda.addCidadeAdjacente(new Adjacente(lapa));
        
        mafra.addCidadeAdjacente(new Adjacente(tijucas));
        mafra.addCidadeAdjacente(new Adjacente(lapa));
        mafra.addCidadeAdjacente(new Adjacente(canoinhas));
        
        tijucas.addCidadeAdjacente(new Adjacente(mafra));
        tijucas.addCidadeAdjacente(new Adjacente(saoJose));
        
        lapa.addCidadeAdjacente(new Adjacente(contenda));
        lapa.addCidadeAdjacente(new Adjacente(saoMateus));
        lapa.addCidadeAdjacente(new Adjacente(mafra));
        
        saoMateus.addCidadeAdjacente(new Adjacente(palmeira));
        saoMateus.addCidadeAdjacente(new Adjacente(irati));
        saoMateus.addCidadeAdjacente(new Adjacente(lapa));
        saoMateus.addCidadeAdjacente(new Adjacente(tresBarras));
        saoMateus.addCidadeAdjacente(new Adjacente(portoUniao));
        
        tresBarras.addCidadeAdjacente(new Adjacente(saoMateus));
        tresBarras.addCidadeAdjacente(new Adjacente(canoinhas));        
    }

    public Cidade getPortoUniao() {
        return portoUniao;
    }

    public Cidade getPauloFrontin() {
        return pauloFrontin;
    }

    public Cidade getCanoinhas() {
        return canoinhas;
    }

    public Cidade getIrati() {
        return irati;
    }

    public Cidade getPalmeira() {
        return palmeira;
    }

    public Cidade getCampoLargo() {
        return campoLargo;
    }

    public Cidade getCuritiba() {
        return curitiba;
    }

    public Cidade getBalsaNova() {
        return balsaNova;
    }

    public Cidade getAraucaria() {
        return araucaria;
    }

    public Cidade getSaoJose() {
        return saoJose;
    }

    public Cidade getContenda() {
        return contenda;
    }

    public Cidade getMafra() {
        return mafra;
    }

    public Cidade getTijucas() {
        return tijucas;
    }

    public Cidade getLapa() {
        return lapa;
    }

    public Cidade getSaoMateus() {
        return saoMateus;
    }

    public Cidade getTresBarras() {
        return tresBarras;
    }
    
    

}

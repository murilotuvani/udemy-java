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
        portoUniao.addCidadeAdjacente(new Adjacente(pauloFrontin, 46));
        portoUniao.addCidadeAdjacente(new Adjacente(canoinhas, 78));
        portoUniao.addCidadeAdjacente(new Adjacente(saoMateus, 87));

        pauloFrontin.addCidadeAdjacente(new Adjacente(portoUniao, 46));
        pauloFrontin.addCidadeAdjacente(new Adjacente(irati, 75));

        canoinhas.addCidadeAdjacente(new Adjacente(portoUniao, 78));
        canoinhas.addCidadeAdjacente(new Adjacente(tresBarras, 12));
        canoinhas.addCidadeAdjacente(new Adjacente(mafra, 66));

        irati.addCidadeAdjacente(new Adjacente(pauloFrontin, 75));
        irati.addCidadeAdjacente(new Adjacente(palmeira, 75));
        irati.addCidadeAdjacente(new Adjacente(saoMateus, 57));

        palmeira.addCidadeAdjacente(new Adjacente(irati, 75));
        palmeira.addCidadeAdjacente(new Adjacente(saoMateus, 77));
        palmeira.addCidadeAdjacente(new Adjacente(campoLargo, 55));

        campoLargo.addCidadeAdjacente(new Adjacente(palmeira, 55));
        campoLargo.addCidadeAdjacente(new Adjacente(balsaNova, 22));
        campoLargo.addCidadeAdjacente(new Adjacente(curitiba, 29));

        curitiba.addCidadeAdjacente(new Adjacente(campoLargo, 29));
        curitiba.addCidadeAdjacente(new Adjacente(balsaNova, 51));
        curitiba.addCidadeAdjacente(new Adjacente(araucaria, 57));
        curitiba.addCidadeAdjacente(new Adjacente(saoJose, 15));

        balsaNova.addCidadeAdjacente(new Adjacente(curitiba, 51));
        balsaNova.addCidadeAdjacente(new Adjacente(campoLargo, 22));
        balsaNova.addCidadeAdjacente(new Adjacente(contenda, 19));

        araucaria.addCidadeAdjacente(new Adjacente(curitiba, 37));
        araucaria.addCidadeAdjacente(new Adjacente(contenda, 18));

        saoJose.addCidadeAdjacente(new Adjacente(curitiba, 15));
        saoJose.addCidadeAdjacente(new Adjacente(tijucas, 49));

        contenda.addCidadeAdjacente(new Adjacente(balsaNova, 19));
        contenda.addCidadeAdjacente(new Adjacente(araucaria, 18));
        contenda.addCidadeAdjacente(new Adjacente(lapa, 26));

        mafra.addCidadeAdjacente(new Adjacente(tijucas, 99));
        mafra.addCidadeAdjacente(new Adjacente(lapa, 57));
        mafra.addCidadeAdjacente(new Adjacente(canoinhas, 66));

        tijucas.addCidadeAdjacente(new Adjacente(mafra, 99));
        tijucas.addCidadeAdjacente(new Adjacente(saoJose, 49));

        lapa.addCidadeAdjacente(new Adjacente(contenda, 26));
        lapa.addCidadeAdjacente(new Adjacente(saoMateus, 60));
        lapa.addCidadeAdjacente(new Adjacente(mafra, 57));

        saoMateus.addCidadeAdjacente(new Adjacente(palmeira, 77));
        saoMateus.addCidadeAdjacente(new Adjacente(irati, 57));
        saoMateus.addCidadeAdjacente(new Adjacente(lapa, 60));
        saoMateus.addCidadeAdjacente(new Adjacente(tresBarras, 43));
        saoMateus.addCidadeAdjacente(new Adjacente(portoUniao, 87));

        tresBarras.addCidadeAdjacente(new Adjacente(saoMateus, 43));
        tresBarras.addCidadeAdjacente(new Adjacente(canoinhas, 12));
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

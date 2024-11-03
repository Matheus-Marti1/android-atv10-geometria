/*
*@author:<Matheus Augusto Marti>
*/

package br.edu.fateczl.atv10geometria.controller;

import br.edu.fateczl.atv10geometria.model.Circulo;

public class CirculoController implements IGeometriaController<Circulo> {
    @Override
    public float calcularArea(Circulo circulo) {
        return (float) (Math.PI * Math.pow(circulo.getRaio(), 2));
    }

    @Override
    public float calcularPerimetro(Circulo circulo) {
        return (float) (2 * Math.PI * circulo.getRaio());
    }
}

/*
*@author:<Matheus Augusto Marti>
*/

package br.edu.fateczl.atv10geometria.controller;

import br.edu.fateczl.atv10geometria.model.Retangulo;

public class RetanguloController implements IGeometriaController<Retangulo> {
    @Override
    public float calcularArea(Retangulo retangulo) {
        return (retangulo.getBase() * retangulo.getAltura());
    }

    @Override
    public float calcularPerimetro(Retangulo retangulo) {
        return (retangulo.getBase() * 2) + (retangulo.getAltura() * 2);
    }
}

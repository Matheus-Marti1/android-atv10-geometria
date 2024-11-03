/*
*@author:<Matheus Augusto Marti>
*/

package br.edu.fateczl.atv10geometria.controller;

public interface IGeometriaController<T> {
    public float calcularArea(T t);
    public float calcularPerimetro(T t);
}

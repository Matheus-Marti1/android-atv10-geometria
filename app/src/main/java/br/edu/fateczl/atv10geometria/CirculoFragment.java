/*
*@author:<Matheus Augusto Marti>
*/

package br.edu.fateczl.atv10geometria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.edu.fateczl.atv10geometria.controller.CirculoController;
import br.edu.fateczl.atv10geometria.controller.IGeometriaController;
import br.edu.fateczl.atv10geometria.model.Circulo;

public class CirculoFragment extends Fragment {

    private View view;
    private EditText etRaio;
    private Button btnCalcularAreaCirculo;
    private Button btnCalcularPerimetroCirculo;
    private TextView tvResCirculo;

    public CirculoFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_circulo, container, false);
        etRaio = view.findViewById(R.id.etRaio);
        tvResCirculo = view.findViewById(R.id.tvResCirculo);
        btnCalcularAreaCirculo = view.findViewById(R.id.btnCalcularAreaCirculo);
        btnCalcularPerimetroCirculo = view.findViewById(R.id.btnCalcularPerimetroCirculo);
        btnCalcularAreaCirculo.setOnClickListener(op -> calcularAreaCirculo());
        btnCalcularPerimetroCirculo.setOnClickListener(op -> calcularPerimetroCirculo());
        return view;
    }

    private void calcularPerimetroCirculo() {
        Circulo circulo = new Circulo();
        circulo.setRaio(Float.parseFloat(etRaio.getText().toString()));
        IGeometriaController<Circulo> op = new CirculoController();
        float perimetro = op.calcularPerimetro(circulo);
        String res = getResources().getString(R.string.resultado) + " " + perimetro;
        tvResCirculo.setText(res);
        etRaio.setText("");
    }

    private void calcularAreaCirculo() {
        Circulo circulo = new Circulo();
        circulo.setRaio(Float.parseFloat(etRaio.getText().toString()));
        IGeometriaController<Circulo> op = new CirculoController();
        float area = op.calcularArea(circulo);
        String res = getResources().getString(R.string.resultado) + " " + area;
        tvResCirculo.setText(res);
        etRaio.setText("");
    }

}
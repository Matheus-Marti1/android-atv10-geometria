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

import br.edu.fateczl.atv10geometria.controller.IGeometriaController;
import br.edu.fateczl.atv10geometria.controller.RetanguloController;
import br.edu.fateczl.atv10geometria.model.Retangulo;


public class RetanguloFragment extends Fragment {

    private View view;
    private EditText etBase;
    private EditText etAltura;
    private Button btnCalcularAreaRet;
    private Button btnCalcularPerimetroRet;
    private TextView tvResRet;

    public RetanguloFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_retangulo, container, false);
        etBase = view.findViewById(R.id.etBase);
        etAltura = view.findViewById(R.id.etAltura);
        tvResRet = view.findViewById(R.id.tvResRet);
        btnCalcularAreaRet = view.findViewById(R.id.btnCalcularAreaRet);
        btnCalcularPerimetroRet = view.findViewById(R.id.btnCalcularPerimetroRet);
        btnCalcularAreaRet.setOnClickListener(op -> calcularAreaRet());
        btnCalcularPerimetroRet.setOnClickListener(op -> calcularPerimetroRet());
        return view;
    }

    private void calcularPerimetroRet() {
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(Float.parseFloat(etBase.getText().toString()));
        retangulo.setAltura(Float.parseFloat(etAltura.getText().toString()));
        IGeometriaController<Retangulo> op = new RetanguloController();
        float perimetro = op.calcularPerimetro(retangulo);
        String res = getResources().getString(R.string.resultado) + " " + perimetro;
        tvResRet.setText(res);
        limparCampos();
    }

    private void calcularAreaRet() {
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(Float.parseFloat(etBase.getText().toString()));
        retangulo.setAltura(Float.parseFloat(etAltura.getText().toString()));
        IGeometriaController<Retangulo> op = new RetanguloController();
        float area = op.calcularArea(retangulo);
        String res = getResources().getString(R.string.resultado) + " " + area;
        tvResRet.setText(res);
        limparCampos();
    }

    private void limparCampos() {
        etBase.setText("");
        etAltura.setText("");
    }
}
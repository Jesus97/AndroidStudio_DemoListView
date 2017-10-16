package com.iesvirgendelcarmen.dam.demolistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PersonaAdapter extends ArrayAdapter<Persona>{

    public PersonaAdapter(@NonNull Context context, @NonNull ArrayList<Persona> lista) {
        super(context, 0, lista);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Persona p = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.persona_item, parent, false);
        }
        TextView personaNombre = (TextView) convertView.findViewById(R.id.personaNombre);
        TextView personaApellidos = (TextView) convertView.findViewById(R.id.personaApellidos);

        personaNombre.setText(p.getNombre());
        personaApellidos.setText(p.getApellidos());

        return convertView;
    }

}

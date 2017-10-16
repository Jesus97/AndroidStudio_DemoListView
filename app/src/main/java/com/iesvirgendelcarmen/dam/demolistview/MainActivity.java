package com.iesvirgendelcarmen.dam.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ListView lista;
    private ArrayList<Persona> listaMock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //String Valores[] = {"Juan","Maria","Pepe","David","Kalista","Gnar"};

        listaMock = mock();

        lista= (ListView) findViewById(R.id.Lista);

        PersonaAdapter adaptador = new PersonaAdapter(this, listaMock);

        lista.setAdapter(adaptador);

//        ArrayAdapter<Persona>  adaptador = new ArrayAdapter<Persona>(this, android.R.layout.simple_list_item_1, listaMock);
//
//        lista.setAdapter(adaptador);

//        lista = (ListView)findViewById(R.id.Lista);
//
//        ArrayAdapter<String> adaptadorArray = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Valores);
//
//        lista.setAdapter(adaptadorArray);
    }
    private ArrayList<Persona> mock(){
        ArrayList<Persona> lista = new ArrayList<Persona>();

        Persona p1 = new Persona("Jesus","Escabias");
        lista.add(p1);

        p1 = new Persona("Maria","Morillo");
        lista.add(p1);

        p1 = new Persona("David","Moral");
        lista.add(p1);

        p1 = new Persona("Antonio","Molina");
        lista.add(p1);

        p1 = new Persona("Jose","Lopez");
        lista.add(p1);

        p1 = new Persona("Juana","Rivas");
        lista.add(p1);

        p1 = new Persona("Amancio","Ortega");
        lista.add(p1);

        p1 = new Persona("Jo","Pe");
        lista.add(p1);

        p1 = new Persona("Pene","Lope");
        lista.add(p1);

        p1 = new Persona("Hola","Adios");
        lista.add(p1);

        p1 = new Persona("Aiiiiiii","Manolo");
        lista.add(p1);

        p1 = new Persona("Aiiiiiii","Manolo");
        lista.add(p1);

        p1 = new Persona("Aiiiiiii","Manolo");
        lista.add(p1);

        p1 = new Persona("Aiiiiiii","Manolo");
        lista.add(p1);

        p1 = new Persona("Aiiiiiii","Manolo");
        lista.add(p1);

        p1 = new Persona("Aiiiiiii","Manolo");
        lista.add(p1);

        p1 = new Persona("Aiiiiiii","Manolo");
        lista.add(p1);

        p1 = new Persona("Aiiiiiii","Manolo");
        lista.add(p1);

        p1 = new Persona("Aiiiiiii","Manolo");
        lista.add(p1);

        return lista;

    }
}

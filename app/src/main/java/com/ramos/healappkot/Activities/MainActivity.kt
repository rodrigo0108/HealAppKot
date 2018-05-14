package com.ramos.healappkot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.*
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //App bar
        val toolbar = findViewById<View>(R.id.appbar) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("Mi Aplicación")

        //RecyclerView
        val lstLista = findViewById<RecyclerView>(R.id.lstLista)

        val datos = ArrayList<String>()

        for (i in 0..49)
            datos.add(Titular("Título $i", "Subtítulo item $i"))

        val adaptador = AdaptadorTitulares(datos)
        lstLista.adapter = adaptador

        lstLista.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        lstLista.addItemDecoration(
                DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST))
        lstLista.itemAnimator = DefaultItemAnimator()
    }
}

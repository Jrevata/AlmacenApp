package com.jrevata.almacenapp.app.almacenapp.services;

import com.jrevata.almacenapp.app.almacenapp.models.Producto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Alumno on 4/05/2018.
 */

public interface ApiService {

    String API_BASE_URL = "https://almacen-api-jrevata.c9users.io";

    @GET("api/v1/productos")
    Call<List<Producto>> getProductos();


}

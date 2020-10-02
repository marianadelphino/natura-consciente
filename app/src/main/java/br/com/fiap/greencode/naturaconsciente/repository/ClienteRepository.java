package br.com.fiap.greencode.naturaconsciente.repository;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


import org.glassfish.jersey.*;

import br.com.fiap.greencode.naturaconsciente.entity.Cliente;

/**
 * Created by leand on 02/10/2017.
 */

public class ClienteRepository {

    private static final String URL = "http://localhost:8081/NaturaConsciente/rest/cliente";

    private Client client = Client.create();


    //Login
    public void login(Cliente cliente) throws Exception{
        WebResource resource = client.resource(URL);
        /*ClientResponse response = resource.type(
                MediaType).post(ClientResponse.class,perfume);
        if (response.getStatus() != 201){
            throw new WebServiceException("HTTP Status: " +
                    response.getStatus());
        }*/
    }

}

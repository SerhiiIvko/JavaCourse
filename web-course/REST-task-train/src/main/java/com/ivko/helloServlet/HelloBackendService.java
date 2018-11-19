package com.ivko.helloServlet;

import java.net.HttpURLConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("contacts")
public class HelloBackendService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Contact> firstMessage(@QueryParam("nameFilter") String val) {
        if (val == null) {
            throw new WebApplicationException(
                    Response.status(HttpURLConnection.HTTP_BAD_REQUEST).entity("name parameter is mandatory").build());
        }
        List<Contact> contacts = new ArrayList<Contact>();
        try {
            contacts = ManagementSystem.getInstance().getFilteredContacts(val, null);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contacts;
    }
}
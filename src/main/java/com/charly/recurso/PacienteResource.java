package com.charly.recurso;

import com.charly.modelo.Paciente;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/pacientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PacienteResource {

    @GET
    public List<Paciente> listar() {
        return Paciente.listAll();
    }

    @POST
    @Transactional
    public Response crear(Paciente paciente) {
        paciente.persist();
        return Response.status(Response.Status.CREATED).entity(paciente).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response actualizar(@PathParam("id") Long id, Paciente datos) {
        Paciente paciente = Paciente.findById(id);
        if (paciente == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        paciente.nombre = datos.nombre;
        paciente.apellido = datos.apellido;
        paciente.dni = datos.dni;
        paciente.edad = datos.edad;
        return Response.ok(paciente).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response eliminar(@PathParam("id") Long id) {
        boolean eliminado = Paciente.deleteById(id);
        if (!eliminado) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.noContent().build();
    }
}
}

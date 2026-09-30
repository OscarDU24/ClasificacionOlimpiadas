package org.example.clasifolimpyc;

import java.util.List;
import org.example.clasifolimpyc.model.participante;

public class validator {

    public static String validar(
            participante participante,
            List<participante> participantes) {

        if (participante == null) {
            return "Los datos del participante son obligatorios.";
        }

        if (participante.getNombreCompleto() == null ||
                participante.getNombreCompleto().trim().isEmpty()) {

            return "El nombre completo es obligatorio.";
        }

        if (participante.getNombreCompleto().trim().length() < 5) {

            return "El nombre completo debe tener mínimo 5 caracteres.";
        }

        if (participante.getEdad() == null) {

            return "La edad es obligatoria.";
        }

        if (participante.getEdad() < 15 ||
                participante.getEdad() > 60) {

            return "La edad debe estar entre 15 y 60 años.";
        }

        if (participante.getCorreo() == null ||
                participante.getCorreo().trim().isEmpty()) {

            return "El correo es obligatorio.";
        }

        if (!participante.getCorreo().matches(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

            return "El correo no tiene un formato válido.";
        }

        if (participante.getGrupo() == null ||
                participante.getGrupo().trim().isEmpty()) {

            return "Debe seleccionar un grupo.";
        }

        if (participantes != null) {

            for (participante registrado : participantes) {

                if (registrado.getCorreo() != null &&
                        registrado.getCorreo().equalsIgnoreCase(
                                participante.getCorreo().trim())) {

                    return "Ya existe un participante registrado con ese correo.";
                }
            }
        }

        return null;
    }
}

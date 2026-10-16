package com.edumaster.actividades;

public record Actividad(String titulo, String metodologia, int puntos) {

    public Actividad {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("El título es obligatorio");
        }
        if (puntos < 0) {
            throw new IllegalArgumentException("Los puntos no pueden ser negativos");
        }
    }
}

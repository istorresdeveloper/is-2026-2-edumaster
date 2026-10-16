package com.edumaster.gamificacion;

public class PuntosService {

    public int sumarPuntos(int actuales, int ganados) {
        if (ganados < 0) {
            throw new IllegalArgumentException("Los puntos ganados no pueden ser negativos");
        }
        return actuales + ganados;
    }

    public String insigniaPara(int puntos) {
        if (puntos >= 500) return "Maestro";
        if (puntos >= 200) return "Explorador";
        if (puntos >= 50) return "Aprendiz";
        return "Sin insignia";
    }
}

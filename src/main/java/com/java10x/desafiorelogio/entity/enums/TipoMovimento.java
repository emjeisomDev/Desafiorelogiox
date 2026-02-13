package com.java10x.desafiorelogio.entity.enums;

public enum TipoMovimento {
    QUARTZ, AUTOMATICO, MANUAL;

    public static TipoMovimento fromApi(String valor){
        if (valor == null || valor.isBlank()) return null;

        return switch (valor)
        {
            case "quartz" -> QUARTZ;
            case "automatic" -> QUARTZ;
            case "manual" -> QUARTZ;
            default -> throw new IllegalArgumentException("Tipo de Movimento Invalido: " + valor + ".");
        };
    }

    public String toApi(){
        return switch (this)
        {
            case QUARTZ -> "quartz";
            case AUTOMATICO -> "automatic";
            case MANUAL -> "manual";
        };
    }



}

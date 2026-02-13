package com.java10x.desafiorelogio.entity.enums;

public enum TipoVidro {
    MINERAL, SAFIRA, ACRILICRO;

    public static TipoVidro fromApi(String valor){
        if (valor == null || valor.isBlank()) return null;

        return switch (valor)
        {
            case "mineral" -> MINERAL;
            case "sapphire" -> SAFIRA;
            case "acrylic" -> ACRILICRO;
            default -> throw new IllegalArgumentException("Tipo de Vidro Invalido: " + valor + ".");
        };
    }

    public String toApi(){
        return switch (this)
        {
            case MINERAL -> "mineral";
            case SAFIRA -> "sapphire";
            case ACRILICRO -> "acrylic";
        };
    }



}

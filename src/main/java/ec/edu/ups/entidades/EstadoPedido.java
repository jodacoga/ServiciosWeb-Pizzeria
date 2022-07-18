package ec.edu.ups.entidades;

public enum EstadoPedido {
    ENVIADO("Enviado"),
    RECEPTADO("Receptado"),
    CANCELADO("Cancelado"),
    EN_PROCESO("En proceso"),
    EN_CAMINO("En caminado"),
    FINALIZADO("Finalizado");

    private String etiqueta;

    private EstadoPedido(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    @Override
    public String toString() {
        return "EstadoPedido{" +
                "etiqueta='" + etiqueta + '\'' +
                '}';
    }
}

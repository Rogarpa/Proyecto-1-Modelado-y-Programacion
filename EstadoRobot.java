public interface public EstadoRobot{
    
    /**Realiza la acción de activarse
     * @throws UnsupportedOperationException cuando la accion no está disponible.
    */
    void activarse();
    /**Realiza la acción de suspenderse
     * @throws UnsupportedOperationException cuando la accion no está disponible.
    */
    void suspenderse();
    /**Realiza la acción de recibir orden
     * @throws UnsupportedOperationException cuando la accion no está disponible.
    */
    void recibirOrden();
    /**Realiza la acción de entregar el platillo
     * @throws UnsupportedOperationException cuando la accion no está disponible.
    */
    void entregarPlatillo();
    /**Realiza la acción de ir a la barra
     * @throws UnsupportedOperationException cuando la accion no está disponible.
    */
    void irALaBarra();
    /**Realiza la acción de caminar
     * @throws UnsupportedOperationException cuando la accion no está disponible.
    */
    void caminar();
    /**Realiza la acción de ir a la cocina
     * @throws UnsupportedOperationException cuando la accion no está disponible.
    */
    void irALaCocina();
    /**Realiza la acción de cocinar
     * @throws UnsupportedOperationException cuando la accion no está disponible.
    */
    void cocinar();
    
} 
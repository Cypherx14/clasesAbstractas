package org.alexc.pooclasesabstractas.form.elementos;

abstract public class ElementoForm {

    protected String valor;  //protected para no hacer los get y set
    protected String nombre;

    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    abstract public String dibujarHtml();

    public void setValor(String valor) {
        this.valor = valor;
    }

}

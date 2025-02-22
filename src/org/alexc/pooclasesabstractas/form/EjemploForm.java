package org.alexc.pooclasesabstractas.form;

import org.alexc.pooclasesabstractas.form.elementos.ElementoForm;
import org.alexc.pooclasesabstractas.form.elementos.InputForm;
import org.alexc.pooclasesabstractas.form.elementos.SelectForm;
import org.alexc.pooclasesabstractas.form.elementos.TextAreaForm;
import org.alexc.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("password", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");
        username.setValor("jhon.doe");
        password.setValor("a1b2c3");
        email.setValor("jhondoe@gmail.com");
        edad.setValor("28");

        TextAreaForm experiencia = new TextAreaForm("exp",5,9);
        experiencia.setValor("...mas de 10 anios de experiencia ...");

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java).addOpcion(new Opcion("2","Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "Typescript"))
                .addOpcion(new Opcion("5", "PHP"));
        java.setSelected(true);



//        List<ElementoForm> elementos = new ArrayList<>();
        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,lenguaje);
//        elementos.add(username);
//        elementos.add(password);
//        elementos.add(email);
//        elementos.add(edad);
//        elementos.add(experiencia);
//        elementos.add(lenguaje);
//        for (ElementoForm elm : elementos){
//            System.out.println(elm.dibujarHtml());
//        }

        elementos.forEach(elm -> {
            System.out.println(elm.dibujarHtml());
        });


    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buttons;
/**
 * A classe WindowsButton é uma implementação concreta da interface Button.
 * Ela representa um botão específico do sistema operacional Windows.
 * Essa classe deve ser criada por uma fábrica concreta responsável por produzir
 * botões no estilo Windows, no contexto do padrão Abstract Factory.
 * 
 * O comportamento do método paint() pode variar de acordo com o sistema operacional
 * ou tema. Neste caso, ele exibe uma mensagem indicando que um botão do Windows foi criado.
 *  */
/**
 *
 * @author FATEC ZONA LESTE
 */
public class WindowsButton implements Button {
/**
     * Construtor da classe WindowsButton.
     * A exceção UnsupportedOperationException foi gerada automaticamente,
     * mas o construtor não realiza nenhuma ação nesse momento. 
     * Em uma implementação real, o construtor poderia inicializar recursos necessários
     * para o botão, mas, neste caso, ele não está implementado e lança uma exceção.
     */
    public WindowsButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
     * Implementação do método paint() da interface Button.
     * Este método exibe uma mensagem indicando que um botão Windows foi criado.
     * 
     * No contexto do padrão Abstract Factory, a implementação do método paint()
     * pode ser diferente dependendo da plataforma (por exemplo, no MacOS, o método paint
     * criaria um botão com o estilo característico do MacOS).
     * 
     * Essa implementação concreta mostra um exemplo básico de como um botão Windows seria "pintado"
     * ou representado graficamente.
     */
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}


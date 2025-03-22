/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * A classe MacOSButton é uma implementação concreta da interface Button.
 * Ela representa um botão específico do sistema operacional MacOS.
 * Essa classe deve ser criada por uma fábrica concreta responsável por produzir
 * botões no estilo MacOS, no contexto do padrão Abstract Factory.
 *
 * O comportamento do método paint() pode variar de acordo com o sistema operacional
 * ou tema, e neste caso, ele gera uma mensagem indicando que um botão MacOS foi criado.
 **/
package Buttons;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class MacOSButton implements Button{
    /**
     * Construtor da classe MacOSButton.
     * A exceção UnsupportedOperationException foi gerada automaticamente,
     * mas o construtor não realiza nenhuma ação nesse momento. 
     * Em uma implementação real, o construtor poderia inicializar recursos necessários
     * para o botão, mas, neste caso, ele não está implementado e lança uma exceção.
     */
    public MacOSButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Implementação do método paint() da interface Button.
     * Este método exibe uma mensagem indicando que um botão MacOS foi criado.
     * 
     * No contexto do padrão Abstract Factory, a implementação do método paint()
     * pode ser diferente dependendo da plataforma (por exemplo, no Windows, o método paint
     * criaria um botão com o estilo característico do Windows).
     * 
     * Essa implementação concreta mostra um exemplo básico de como um botão MacOS seria "pintado"
     * ou representado graficamente.
     */

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }

}

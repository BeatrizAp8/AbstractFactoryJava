/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Checkboxes;
/**
 * A classe WindowsCheckbox é uma implementação concreta da interface Checkbox.
 * Ela representa uma caixa de seleção (checkbox) específica para o sistema operacional Windows.
 * Essa classe é parte do padrão **Abstract Factory**, que permite a criação de objetos relacionados (como botões, checkboxes, etc.)
 * sem especificar suas classes concretas. 
 * 
 * A ideia do padrão **Abstract Factory** é criar famílias de objetos que compartilham um tema ou estilo,
 * de forma que a plataforma ou o estilo (neste caso, Windows) seja ocultado do código de alto nível. 
 * 
 * Esta classe fornece uma implementação concreta para o Windows, onde o comportamento de um checkbox será diferente
 * das implementações para outras plataformas, como o MacOS.
 *  */
/**
 *
 * @author FATEC ZONA LESTE
 */
public class WindowsCheckbox implements Checkbox {
      /**
     * Implementação do método paint() da interface Checkbox.
     * Este método exibe uma mensagem indicando que uma caixa de seleção (checkbox) do Windows foi criada.
     * 
     * No contexto do padrão Abstract Factory, a implementação do método paint() é feita para refletir o estilo visual
     * e comportamento da caixa de seleção no sistema operacional Windows.
     * 
     * Em uma implementação real, o método "pintaria" a caixa de seleção na interface gráfica com o estilo característico do Windows,
     * seja com cores, formas ou outros detalhes específicos da plataforma.
     */
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}

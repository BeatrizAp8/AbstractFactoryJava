/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Buttons.Button;
import Buttons.MacOSButton;
import Checkboxes.Checkbox;
import Checkboxes.MacOSCheckbox;
/**
 * A classe MacOSFactory é uma implementação concreta da interface GUIFactory.
 * Ela é responsável pela criação de componentes de interface gráfica (botões e caixas de seleção)
 * que seguem o estilo visual do sistema operacional MacOS.
 * 
 * A MacOSFactory faz parte do padrão **Abstract Factory**, que busca garantir a criação de famílias de objetos
 * (botões e caixas de seleção) com uma aparência consistente para uma plataforma ou tema específico.
 * 
 * No caso da MacOSFactory, ela cria objetos que são próprios para o sistema operacional MacOS, 
 * como o MacOSButton (botão do estilo MacOS) e o MacOSCheckbox (caixa de seleção do estilo MacOS).
 * 
 * O objetivo dessa classe é fornecer uma forma de abstração para criar componentes que são compatíveis entre si,
 * ou seja, um botão e uma caixa de seleção do MacOS.
 * */
/**
 *
 * @author FATEC ZONA LESTE
 */
public class MacOSFactory implements GUIFactory {
  /**
     * Método para criar um botão (Button) no estilo MacOS.
     * Este método retorna uma instância da classe MacOSButton, que é uma implementação concreta 
     * de um botão com o estilo visual do MacOS.
     * 
     * A fábrica concreta (neste caso, a MacOSFactory) decide qual tipo de objeto será criado.
     * No padrão **Abstract Factory**, o código cliente não precisa saber qual classe concreta 
     * está sendo usada para criar o botão, apenas que ele segue o estilo da plataforma MacOS.
     * */
 
    @Override
    public Button createButton() {
        return new MacOSButton(); // Retorna um botão do macOS
    }
 /**
     * Método para criar uma caixa de seleção (Checkbox) no estilo MacOS.
     * Este método retorna uma instância da classe MacOSCheckbox, que é uma implementação concreta 
     * de uma caixa de seleção com o estilo visual do MacOS.
     * 
     * Assim como o método createButton(), o padrão **Abstract Factory** permite que o código cliente
     * crie caixas de seleção de forma consistente, sem se preocupar com a implementação específica.
     * */
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox(); // Retorna uma caixa de seleção do macOS
    }
}

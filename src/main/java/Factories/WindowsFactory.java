/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Buttons.Button;
import Buttons.WindowsButton;
import Checkboxes.Checkbox;
import Checkboxes.WindowsCheckbox;

/**
 * A classe WindowsFactory é uma implementação concreta da interface GUIFactory.
 * Ela é responsável pela criação de componentes de interface gráfica (botões e caixas de seleção)
 * que seguem o estilo visual do sistema operacional Windows.
 * 
 * A WindowsFactory faz parte do padrão **Abstract Factory**, que visa criar famílias de objetos
 * (botões e caixas de seleção) com uma aparência consistente para uma plataforma específica, 
 * neste caso, o Windows.
 * 
 * Ao usar o padrão Abstract Factory, a aplicação pode criar componentes de forma abstrata, ou seja,
 * sem saber os detalhes da implementação específica, mas apenas que esses componentes pertencem 
 * ao estilo visual do Windows.
 * */
/**
 *
 * @author FATEC ZONA LESTE
 */
public class WindowsFactory implements GUIFactory {
 /**
     * Método para criar um botão (Button) no estilo Windows.
     * Este método retorna uma instância da classe WindowsButton, que é uma implementação concreta
     * de um botão com o estilo visual do Windows.
     * 
     * O padrão **Abstract Factory** abstrai a criação do botão para que o código cliente não precise
     * saber qual classe concreta está sendo utilizada. Ele apenas sabe que o botão segue o estilo 
     * do Windows.
     * */
    @Override
    public Button createButton() {
        return new WindowsButton();// Retorna um botão do Windows
    }
 /**
     * Método para criar uma caixa de seleção (Checkbox) no estilo Windows.
     * Este método retorna uma instância da classe WindowsCheckbox, que é uma implementação concreta
     * de uma caixa de seleção com o estilo visual do Windows.
     * 
     * Assim como no método createButton(), a fábrica concreta decide qual classe será instanciada.
     * O código cliente pode criar caixas de seleção do estilo Windows sem se preocupar com a implementação concreta.
     * */
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox(); // Retorna uma caixa de seleção do Windows
    }
}


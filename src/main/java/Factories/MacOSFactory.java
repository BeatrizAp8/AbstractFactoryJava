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
 *
 * @author FATEC ZONA LESTE
 */
public class MacOSFactory implements GUIFactory {
 
    @Override
    public Button createButton() {
        return new MacOSButton(); // Retorna um botão do macOS
    }
 
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox(); // Retorna uma caixa de seleção do macOS
    }
}

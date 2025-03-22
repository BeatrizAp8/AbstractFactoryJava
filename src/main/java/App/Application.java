/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Buttons.Button;
import Checkboxes.Checkbox;
import Factories.GUIFactory;

/**
 *
 * @author FATEC ZONA LESTE
 */
// A classe Application depende de uma abstração (GUIFactory) para criar seus componentes gráficos
public class Application {
// Atributos para os componentes gráficos da aplicação (Button e Checkbox)
    private Button button;
    private Checkbox checkbox;
// Construtor que recebe uma fábrica (factory) do tipo GUIFactory, que cria os componentes gráficos
// A dependência dos componentes (Button e Checkbox) é invertida, ou seja, a criação dos mesmos 
// é delegada para o parâmetro da fábrica que implementa a interface GUIFactory.
    public Application(GUIFactory factory) {
// Usando a fábrica para criar os componentes necessários para a interface
        button = factory.createButton(); // Fábrica cria o botão
        checkbox = factory.createCheckbox();  // Fábrica cria a caixa de seleção
    }
// Método responsável por pintar/mostrar os componentes criados pela fábrica
    public void paint() {
        button.paint(); // Chama o método paint do botão
        checkbox.paint(); // Chama o método paint da caixa de seleção
    }
}


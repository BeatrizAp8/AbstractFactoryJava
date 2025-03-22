/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Buttons.Button;
import Checkboxes.Checkbox;
/**
 * A interface GUIFactory define a fábrica abstrata que será responsável pela criação de
 * objetos relacionados: botões (Button) e caixas de seleção (Checkbox). 
 * 
 * No contexto do padrão **Abstract Factory**, a interface GUIFactory fornece um contrato para fábricas concretas 
 * que irão criar esses objetos (botões e caixas de seleção) de acordo com a plataforma ou o tema desejado.
 * 
 * Por exemplo, a fábrica para o Windows pode criar um botão do estilo Windows e uma caixa de seleção 
 * do estilo Windows, enquanto uma fábrica para o MacOS pode criar um botão do estilo MacOS e uma caixa de seleção 
 * com o estilo MacOS. A ideia principal é garantir que os objetos criados sejam compatíveis entre si, respeitando 
 * a mesma plataforma ou tema.
 * */
/**
 *
 * @author FATEC ZONA LESTE
 */
public interface GUIFactory {
     /**
     * Método para criar um botão (Button).
     * Este método será implementado pelas fábricas concretas para criar botões específicos
     * para uma plataforma ou estilo. A fábrica concreta decidirá qual implementação de botão
     * (como WindowsButton, MacOSButton, etc.) será criada.
     * 
     * O padrão **Abstract Factory** permite que diferentes plataformas (Windows, MacOS, etc.) 
     * tenham suas próprias implementações de botões sem que o código cliente precise saber
     * de qual classe concreta ele está lidando.
     * */
    Button createButton(); // Método para criar um botão
    Checkbox createCheckbox(); // Método para criar uma caixa de seleção
     /**
     * Método para criar uma caixa de seleção (Checkbox).
     * Semelhante ao método createButton(), este método será implementado pelas fábricas concretas
     * para criar caixas de seleção específicas para a plataforma ou estilo desejado.
     * 
     * As fábricas concretas podem criar instâncias de `WindowsCheckbox`, `MacOSCheckbox`, etc., 
     * dependendo da plataforma escolhida. Isso mantém a consistência visual entre os componentes 
     * da interface gráfica do usuário (GUI).
     * */
     
}
 
 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * A interface Button representa um contrato para os diferentes tipos de botões
 * que podem ser criados por uma fábrica abstrata, seguindo o padrão Abstract Factory.
 * Ela define um único método que deve ser implementado pelas classes concretas de botões.
 * 
 * No padrão Abstract Factory, as fábricas concretas criam instâncias dessas implementações de 
 * botões, dependendo da plataforma ou do estilo desejado.
 * */ 

package Buttons;

/**
 *
 * @author FATEC ZONA LESTE
 */

/**
     * O método paint() é responsável por desenhar o botão na interface do usuário.
     * A implementação deste método pode variar dependendo do sistema operacional ou tema,
     * por exemplo, desenhando botões com estilos específicos para o Windows, MacOS, etc.
     * 
     * Cada tipo de botão (como o botão do Windows ou o botão do MacOS) terá uma 
     * implementação específica para esse método.
     */
public interface Button {
    void paint();

}

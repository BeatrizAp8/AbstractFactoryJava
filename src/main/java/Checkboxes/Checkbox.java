/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Checkboxes;
/**
 * A interface Checkbox define o contrato para as implementações concretas de caixas de seleção (checkboxes).
 * Essa interface faz parte do padrão Abstract Factory, onde diferentes tipos de caixas de seleção podem ser criadas
 * para diferentes plataformas ou estilos.
 * 
 * O padrão Abstract Factory permite que, através de uma fábrica abstrata, diferentes tipos de checkboxes
 * (por exemplo, checkboxes do estilo Windows ou do estilo MacOS) sejam criados sem a necessidade de depender de
 * implementações específicas.
 *  */

/**
 *
 * @author FATEC ZONA LESTE
 */
public interface Checkbox {
      /**
     * O método paint() será responsável por desenhar a caixa de seleção na interface do usuário.
     * A implementação concreta deste método pode variar dependendo da plataforma (por exemplo, Windows, MacOS, etc).
     * 
     * No contexto do padrão Abstract Factory, a ideia é que a fábrica concreta decida qual tipo de caixa de seleção
     * (checkbox) será criada, e o método paint() da implementação concreta será responsável por "pintar" o checkbox
     * de forma apropriada para o sistema operacional ou tema escolhido.
     */
     void paint();
}

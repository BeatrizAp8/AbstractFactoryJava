/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Factories.GUIFactory;
import Factories.MacOSFactory;
import Factories.WindowsFactory;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
// Método de configuração da aplicação que cria uma instância de Application
// com a fábrica apropriada com base no sistema operacional.
    private static Application configureApplication() {
        Application app; // Variável para armazenar a aplicação configurada
        GUIFactory factory; // Fábrica que criará os componentes gráficos (botões, checkboxes)
// Obtém o nome do sistema operacional onde a aplicação está sendo executada
        String osName = System.getProperty("os.name").toLowerCase();
// Verifica se o sistema operacional é MacOS. Caso seja, cria uma fábrica específica para MacOS.
        if (osName.contains("mac")) {
            factory = new MacOSFactory();  // Cria uma fábrica para o MacOS
        } else {
            factory = new WindowsFactory();  // Caso contrário, cria uma fábrica para o Windows
        }
     // Cria a aplicação, passando a fábrica concreta (MacOSFactory ou WindowsFactory)
    // para que a aplicação tenha acesso aos componentes gráficos corretos para o sistema operacional.
        app = new Application(factory);
    // Retorna a aplicação configurada com a fábrica escolhida
        return app;
    }

    public static void main(String[] args) {
// Configura a aplicação com a fábrica apropriada dependendo do sistema operacional
        Application app = configureApplication();
 
// Chama o método 'paint' para desenhar ou exibir os componentes gráficos da aplicação
        app.paint();
    }
}


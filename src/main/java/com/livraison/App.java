package com.livraison;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.livraison.config.AppConfig;

/**
 * Classe principale de l'application de livraison
 */
public class App extends AbstractAnnotationConfigDispatcherServletInitializer {

    public static void main(String[] args) {
        // Chargement du contexte Spring à partir d'un fichier XML
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println("Contexte d'application Spring initialisé");

        // Vous pouvez maintenant récupérer des beans définis dans le fichier spring-config.xml
        // Exemple : UtilisateurService utilisateurService = context.getBean(UtilisateurService.class);
    }

    // Configuration du contexte racine
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class };  // Configuration de base pour l'application
    }

    // Configuration spécifique pour les servlets (Web MVC, etc.)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { AppConfig.class };  // Configuration des servlets
    }

    // Définition des mappings des servlets
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };  // Tout le trafic est mappé à la racine
    }
}

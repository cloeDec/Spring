package com.livraison.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.livraison.model.Utilisateur;
import com.livraison.wrapper.UtilisateurWrapper;

@Service
public class UtilisateurService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Récupérer tous les utilisateurs
    public List<Utilisateur> getAll() {
        String sql = "SELECT * FROM Utilisateur;";
        return this.jdbcTemplate.query(sql, new UtilisateurWrapper());
    }

    // Récupérer un utilisateur par ID
    public Utilisateur getByID(int id) {
        String sql = "SELECT * FROM Utilisateur WHERE id_utilisateur = ?";
        return this.jdbcTemplate.queryForObject(sql, new UtilisateurWrapper(), id);
    }

    // Insérer un nouvel utilisateur
    public int insert(Utilisateur utilisateur) {
        String sql = "INSERT INTO Utilisateur(id_utilisateur, nom, prenom, email, mot_de_passe) VALUES (?, ?, ?, ?, ?, ?)";
        return this.jdbcTemplate.update(sql, utilisateur.getIdUtilisateur(), utilisateur.getNom(), utilisateur.getPrenom(), utilisateur.getEmail(), utilisateur.getMotDePasse());
    }

    // Mettre à jour un utilisateur existant
    public int update(Utilisateur utilisateur) {
        String sql = "UPDATE Utilisateur SET nom = ?, prenom = ?, email = ?, mot_de_passe = ? WHERE id_utilisateur = ?";
        return this.jdbcTemplate.update(sql, utilisateur.getNom(), utilisateur.getPrenom(), utilisateur.getEmail(), utilisateur.getMotDePasse(), utilisateur.getIdUtilisateur(),utilisateur.getIdUtilisateur());
    }

    // Supprimer un utilisateur par ID
    public int delete(int id) {
        String sql = "DELETE FROM Utilisateur WHERE id_utilisateur = ?";
        return this.jdbcTemplate.update(sql, id);
    }
}

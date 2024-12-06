package com.livraison.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.livraison.model.Livreur;
import com.livraison.wrapper.LivreurWrapper;

@Service
public class LivreurService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Récupérer tous les utilisateurs
    public List<Livreur> getAll() {
        String sql = "SELECT * FROM Livreur;";
        return this.jdbcTemplate.query(sql, new LivreurWrapper());
    }

    // Récupérer un utilisateur par ID
    public Livreur getByID(int id) {
        String sql = "SELECT * FROM Livreur WHERE id_livreur = ?";
        return this.jdbcTemplate.queryForObject(sql, new LivreurWrapper(), id);
    }

    // Insérer un nouvel utilisateur
    public int insert(Livreur livreur) {
        String sql = "INSERT INTO Livreur(id_livreur, nom, prenom, email, telephone, statut) VALUES (?, ?, ?, ?, ?, ?)";
        return this.jdbcTemplate.update(sql,livreur.getIdLivreur(), livreur.getNom(), livreur.getPrenom(), livreur.getEmail(), livreur.getTelephone(), livreur.getStatut());
    }

    // Mettre à jour un utilisateur existant
    public int update(Livreur livreur) {
        String sql = "UPDATE Livreur SET nom = ?, prenom = ?, email = ?, telephone = ?, statut = ? WHERE id_livreur = ?";
        return this.jdbcTemplate.update(sql, livreur.getNom(), livreur.getPrenom(), livreur.getEmail(), livreur.getTelephone(), livreur.getStatut(), livreur.getIdLivreur());
    }

    // Supprimer un utilisateur par ID
    public int delete(int id) {
        String sql = "DELETE FROM Livreur WHERE id_livreur = ?";
        return this.jdbcTemplate.update(sql, id);
    }
}

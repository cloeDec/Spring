package com.livraison.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.livraison.model.Adresse;
import com.livraison.wrapper.AdresseWrapper;

@Service
public class AdresseService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Récupérer tous les utilisateurs
    public List<Adresse> getAll() {
        String sql = "SELECT * FROM Adresse;";
        return this.jdbcTemplate.query(sql, new AdresseWrapper());
    }

    // Récupérer un utilisateur par ID
    public Adresse getByID(int id) {
        String sql = "SELECT * FROM Adresse WHERE id_adresse = ?";
        return this.jdbcTemplate.queryForObject(sql, new AdresseWrapper(), id);
    }

    // Insérer un nouvel utilisateur
    public int insert(Adresse adresse) {
        String sql = "INSERT INTO Adresse(id_adresse,rue, ville, code_postal, pays) VALUES (?, ?, ?, ?, ?)";
        return this.jdbcTemplate.update(sql, adresse.getIdAdresse(),adresse.getRue(), adresse.getVille(), adresse.getCodePostal(), adresse.getPays());
    }

    // Mettre à jour un utilisateur existant
    public int update(Adresse adresse) {
        String sql = "UPDATE Adresse SET rue = ?, ville = ?, email = ?, code_postal = ?, ville = ? WHERE id_adresse = ?";
        return this.jdbcTemplate.update(sql, adresse.getRue(), adresse.getVille(), adresse.getCodePostal(), adresse.getPays(), adresse.getIdAdresse());
    }

    // Supprimer un utilisateur par ID
    public int delete(int id) {
        String sql = "DELETE FROM Livreur WHERE id_adresse = ?";
        return this.jdbcTemplate.update(sql, id);
    }
}

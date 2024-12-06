package com.livraison.wrapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.livraison.model.Utilisateur;

public class UtilisateurWrapper implements RowMapper<Utilisateur> {

    @Override
    public Utilisateur mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Utilisateur(
            rs.getInt("id_utilisateur"),      // Mapping de l'ID de l'utilisateur
            rs.getString("nom"),              // Mapping du nom
            rs.getString("prenom"),           // Mapping du prénom
            rs.getString("email"),            // Mapping de l'email
            rs.getString("mot_de_passe")      // Mapping du mot de passe
        );
    }
}
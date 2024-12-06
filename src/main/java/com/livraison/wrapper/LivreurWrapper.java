package com.livraison.wrapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.livraison.model.Livreur;

public class LivreurWrapper implements RowMapper<Livreur> {

    @Override
    public Livreur mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Livreur(
            rs.getInt("id_livreur"),      // Mapping de l'ID de l'utilisateur
            rs.getString("nom"),              // Mapping du nom
            rs.getString("prenom"),           // Mapping du prénom
            rs.getString("email"),            // Mapping de l'email
            rs.getString("telephone"), 
            rs.getString("statut")     // Mapping du mot de passe
        );
    }
}

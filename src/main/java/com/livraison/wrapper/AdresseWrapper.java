package com.livraison.wrapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.livraison.model.Adresse;

public class AdresseWrapper implements RowMapper<Adresse> {

    @Override
    public Adresse mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Adresse(
            rs.getInt("id_adresse"),      // Mapping de l'ID de l'utilisateur
            rs.getString("rue"),              // Mapping du nom
            rs.getString("ville"),           // Mapping du prénom
            rs.getString("code_postal"),            // Mapping de l'email
            rs.getString("pays")    // Mapping du mot de passe
        );
    }
}

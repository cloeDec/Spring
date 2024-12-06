package com.livraison.model;

public class Utilisateur {
private int idUtilisateur;
private String nom;
private String prenom;
private String email;
private String motDePasse;
public Utilisateur(int idUtilisateur, String nom, String prenom, String email, String motDePasse) {
this.idUtilisateur = idUtilisateur;
this.nom = nom;
this.prenom = prenom;
this.email = email;
this.motDePasse = motDePasse;
}
public Utilisateur() {
}
public int getIdUtilisateur() {
return idUtilisateur;
}
public void setIdUtilisateur(int idUtilisateur) {
this.idUtilisateur = idUtilisateur;
}
public String getNom() {
return nom;
}
public void setNom(String nom) {
this.nom = nom;
}
public String getPrenom() {
return prenom;
}
public void setPrenom(String prenom) {
this.prenom = prenom;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String getMotDePasse() {
return motDePasse;
}
public void setMotDePasse(String motDePasse) {
this.motDePasse = motDePasse;
}
}
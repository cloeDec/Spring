package com.livraison.model;

public class Livreur {
private int idLivreur;
private String nom;
private String prenom;
private String email;
private String telephone;
private String statut;
public Livreur(int idLivreur, String nom, String prenom, String email, String telephone, String statut) {
this.idLivreur = idLivreur;
this.nom = nom;
this.prenom = prenom;
this.email = email;
this.telephone = telephone;
this.statut = statut;
}
public Livreur() {
}
public int getIdLivreur() {
return idLivreur;
}
public void setIdLivreur(int idLivreur) {
this.idLivreur = idLivreur;
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
public String getTelephone() {
return telephone;
}
public void setTelephone(String telephone) {
this.telephone = telephone;
}
public String getStatut() {
return statut;
}
public void setStatut(String statut) {
this.statut = statut;
}
}
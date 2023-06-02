package sdv.mq.manager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "client")
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String prenom;
    private Date dateNaissance;
    private int cp;
    private String ville;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public int getCp() {
        return cp;
    }

    public String getVille() {
        return ville;
    }

    @Column(nullable = false)
    private String nom;

    public Client(String nom, String prenom, Date dateNaissance, int cp, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.cp = cp;
        this.ville = ville;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", cp=" + cp +
                ", ville='" + ville + '\'' +
                '}';
    }
}
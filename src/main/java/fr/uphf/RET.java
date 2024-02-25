package fr.uphf;
public class RET {
    private int nombreTerminals;
    private int dureeEnDemiJournees; // Nombre de demi-journées dans une journée

    // Matrice représentant le réseau espace-temps
    private Service[][] matrice;

    public RET(int nombreTerminals, int dureeEnDemiJournees) {
        this.nombreTerminals = nombreTerminals;
        this.dureeEnDemiJournees = dureeEnDemiJournees;
        matrice = new Service[dureeEnDemiJournees][nombreTerminals];
    }

    // Méthode pour ajouter un service à une position donnée dans la matrice
    public void ajouterService(Service service, int temps, int terminal) {
        matrice[temps][terminal] = service;
    }

    // Méthode pour afficher le réseau espace-temps
    public void afficherReseau() {
        for (int temps = 0; temps < dureeEnDemiJournees; temps++) {
            for (int terminal = 0; terminal < nombreTerminals; terminal++) {
                if (matrice[temps][terminal] != null) {
                    System.out.print(matrice[temps][terminal].getId() + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(); // Aller à la ligne pour chaque temps
        }
    }
}
package labJunit.app;

public class CompteBancaire {
    private double solde;

    public CompteBancaire() {
        this.solde = 0.0;
    }
    
    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void crediterSolde(double montant) {
		if(montant < 0) {
			return;
		}
        this.solde += montant; 
    }

    public void debiterSolde(double montant) {
		if(montant < 0 || montant > this.solde){
			return;
		}
        this.solde -= montant; 
    }

    public double getSolde() {
        return this.solde;
    }
}


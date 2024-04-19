package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCompteBancaire {

    private CompteBancaire compte;

    @BeforeEach
    void setUp() {
        compte = new CompteBancaire(100.0);
    }

    @Test
    void testCrediterSoldePositif() {
        compte.crediterSolde(50.0);
        assertEquals(150.0, compte.getSolde(), 0.001);
    }

    @Test
    void testCrediterSoldeNegatif() {
        compte.crediterSolde(-30.0);
        assertEquals(100.0, compte.getSolde(), 0.001);
    }

    @Test
    void testDebiterSoldeNormal() {
        compte.debiterSolde(30.0);
        assertEquals(70.0, compte.getSolde(), 0.001);
    }

    @Test
    void testDebiterSoldeExcessif() {
        compte.debiterSolde(150.0);
        assertEquals(100.0, compte.getSolde(), 0.001);
    }

    @Test
    void testSoldeInitial() {
        assertEquals(100.0, compte.getSolde(), 0.001);
    }

    @Test
    void testDebiterSoldeZero() {
        compte.debiterSolde(0.0);
        assertEquals(100.0, compte.getSolde(), 0.001);
	}
}

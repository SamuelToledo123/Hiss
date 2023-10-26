
public class Elevator {
    private int level;

    public Elevator(int startLevel) {
        if (startLevel >= -2 && startLevel <= 10) {
            this.level = startLevel;
        } else {
            System.out.println("Ogiltig våning");
            this.level = 0;
        }
    }
    public void goTo(int changeLevel) {
        if (changeLevel >= -2 && changeLevel <= 10) {
            if (changeLevel > this.level) {
                System.out.println("Hiss på g upp " + changeLevel);
            } else if (changeLevel < this.level) {
                System.out.println("Hiss på g ner " + changeLevel);

            } else {
                System.out.println("Hiss står redan på " + changeLevel);
                return;
            }
            this.level = changeLevel;
        } else {
            System.out.println("Ogiltig våning");
        }
    }

    public int where() {
        return this.level;

    }
}

























//* A) Konstruera en klass som beskriver en hiss.
//Ange klassnamnet Elevator
//En hiss har en instansvariabel av typen int som heter level
//level lagrar aktuell plan (våning).
//Antal plan är begränsade från -2 till 10.
//Implementera nödvändiga felkontroller.
//Skapa en konstruktor som har en parameter som bestämmer aktuell plan.
//Man ska t.ex. kunna skapa en ny hiss som befinner sig på våning 5.
//En hiss har följande instansmetoder
//1) goTo är instansmetod som flyttar hissen.
//Exempel på användning (anrop) av metoden:
//goTo(5) ändrar våning (level) till 5 och visar meddelandet (i terminalen):
//”Hissen åker upp till våning 5” om hissen befinner sig på våning -2 till 4,
//och ”Hissen åker ner till våning 5” om hissen befinner sig på en övre våning,
//samt ”Hissen står redan på våning 5” om hissen befinner sig på våning 5.
//2) where() är instansmetod som returnerar ett heltal med våningsnumret (level).
//Exempel på metodanrop.
//System.out.println("Hissen står nu på våning " + hiss01.where());
//B) Skapa ett testprogram (klass som innehåller en main-metod).
//I programmet skall du skapa två olika objekt (instanser) av klassen Elevator.
//Testa alla instansmetoder.
//Redovisning/Inlämning *//
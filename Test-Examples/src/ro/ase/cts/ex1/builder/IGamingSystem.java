package ro.ase.cts.ex1.builder;

/* Se dezvoltă o aplicație software pentru o companie care asamblează și
comercializează sisteme complete de gaming.

Aplicația implementată trebuie să permită crearea diferitelor configurații ale sistemelor de
gaming, în funcție de cerințele clienților. Pe lângă elementele care nu pot lipsi dintr-un astfel de
sistem: placă de bază, memorie RAM, stocare ssd și placă video speciale pentru gaming,
sistemele pot conține și multe alte echipamente periferice și accesorii, cum ar fi: mouse,
tastatură, cameră web, căști, scaun de gaming etc.. O configurație creată este finală și nu mai
poate fi modificată. Implementarea se va efectua plecând de la interfața IGamingSystem.
*/
public interface IGamingSystem {
    public void printConfiguration();
    public void setPlacaBaza(String placaBaza);

    public void setMemorieRAM(int memorieRAM);

    public void setSdd(int sdd);

    public void setPlacaVideo(String placaVideo);
}

package ro.ase.cts.ex1.singleton;

/*După asamblare, sistemele trebuie testate pentru a verifica eventualele probleme de
compatibilitate, instalare, defecte etc.. Compania a achiziționat un sistem hardware specializat
pentru testare, pe care un modul de testare ce va fi implementat în aplicația curentă îl va folosi
în procesul de testare.

Se va crea în cadrul aplicației implementate un modul de testare. Din motive de licențiere, odată
creată o componentă de testare, aceasta va fi utilizată pentru testarea tuturor sistemelor
configurate. Nu va putea fi creată o altă entitate de testare. Implementarea va fi realizată prin
implementarea interfeței ITesingModule.
*/
public interface ITesingModule {
    public String test();

}


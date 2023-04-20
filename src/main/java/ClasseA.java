
public class ClasseA {

    private ClasseB aClasseB[]; //Nome Link
    private int n; //Variável não atributo

    public ClasseA() {
        aClasseB = new ClasseB[100];
        n = 0;
    }
    //Ativa o link 

    public void setAClasseB(ClasseB b) {
        aClasseB[n] = b;
        n = n + 1;
    }
}

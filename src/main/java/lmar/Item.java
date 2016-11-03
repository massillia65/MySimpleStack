package lmar;

/**
 * Created by 21204603 on 20/10/2016.
 */
public class Item {

    private Object valeur;

    public Item(Object valeur)
    {
        setValeur(valeur);
    }

    public Object getValeur()
    {
        return valeur;
    }

    public void setValeur(Object valeur) {
        this.valeur = valeur;
    }
}

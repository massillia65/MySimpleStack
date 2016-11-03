package lmar;

/**
 * Created by 21204603 on 03/11/2016.
 */
public class ItemPerso extends Item {

    public ItemPerso(Object valeur)
    {
        super(valeur);
        System.out.println("Nouvelle Item créé");
    }

    public Object getValeur()
    {
        System.out.println("voilà ta valeur");
        return valeur;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class OneItemBox extends Box {

    private Item contents;

    public OneItemBox() {
        this.contents = null;
    }

    @Override
    public void add(Item item) {
        if (contents == null) {
            contents = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (contents == null) {
            return false;
        }

        return contents.equals(item);
    }

    public Item getContents() {
        return contents;
    }

}

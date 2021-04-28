import java.util.LinkedList;
class List implements ISet {
    LinkedList<String> guests;

    List() {
        this.guests = new LinkedList<String>();
    }

    List(LinkedList<String> guests) {
        this.guests = guests;
    }

    @Override
    public ISet addElt(String elt) {
        this.guests.add(elt);
        return this;
    }

    @Override
    public boolean hasElt(String elt) {
        return this.guests.contains(elt);
    }

    @Override
    public int size() {
        return this.guests.size();
    }
}
public interface IList extends ISet{
}

class EmptyList implements IList {

    @Override
    public ISet addElt(String elt) {
        return new NonEmptyList(elt, new EmptyList());
    }

    @Override
    public boolean hasElt(String elt) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}

class NonEmptyList implements IList {
    String guest;
    IList restOfGuests;

    NonEmptyList(String guest, IList restOfGuests) {
        this.guest = guest;
        this.restOfGuests = restOfGuests;
    }

    @Override
    public ISet addElt(String elt) {
        return new NonEmptyList(elt, this.restOfGuests.addElt(this.guest));
    }

    @Override
    public boolean hasElt(String elt) {
        return false;
    }

    @Override
    public int size() {
        return 1 + this.restOfGuests.size();
    }
}

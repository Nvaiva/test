public class FiltruojantisIteratorius implements Iterator {
    Filtras flt;
    Iterator itr;
    private int position = -1;
    Perkamas p;
    FiltruojantisIteratorius(Filtras flt, Iterator itr){
        this.flt = flt;
        this.itr = itr;
    }
    @Override
    public boolean hasNext() {
        return next() != null;
    }

    @Override
    public Object next() {
        position++;
        return position < itr.size() : itr.get(position) ? null;
    }
    public void filtravimas(Iterator it, BrangusStalas stal){
        while(it.hasNext()){
            if(stal.delsStalo(p))
                System.out.println(itr.next());
            }
        }
    }
}

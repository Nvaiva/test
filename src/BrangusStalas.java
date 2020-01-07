public class BrangusStalas extends BrangiuPrekiuFiltras {
    BrangusStalas(int kaina){
        super(kaina);
    }
    public boolean delsStalo(Perkamas p){
        if(tinka(p) == true && p.getPavadinimas() == "Stalas"){
            return true;
        }
        else{
            return false;
        }
    }
}

public class BrangiuPrekiuFiltras implements Filtras{

    private int duotaKaina;
    BrangiuPrekiuFiltras(int kaina){
        duotaKaina = kaina;
    }
    @Override
    public boolean tinka(Perkamas p) {
        if(p.getKaina()>duotaKaina)
            return true;
        else
            return false;
    }
}

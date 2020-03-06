package DnDpak;

public class WizardSubClass extends Wizard {

    private Wizard wiz;
    private String displaySubClassFeatures;

    public WizardSubClass(Wizard wiz) {
        this.wiz = wiz;
    }

    @Override
    public void SplitDisplayString() {
        super.SplitDisplayString();
        String[] dispArch = getSubClassFeatures().split(",");

        switch (GetLevel()) {
            case 2:
                displaySubClassFeatures = dispArch[0];
                break;
            case 6:
                displaySubClassFeatures = dispArch[0] + dispArch[1];
                break;
            case 10:
                displaySubClassFeatures= dispArch[0] + dispArch[1] + dispArch[2] + dispArch[3];
                break;
            case 14:
                displaySubClassFeatures = dispArch[0] + dispArch[1] + dispArch[2] + dispArch[3] + dispArch[4];
                break;
        }//switch
    }
    @Override
    public String getSubClassFeatures(){
        if(wiz != null) {
            return wiz.getSubClassFeatures();
        }
        return null;
    }
    public String getDisplaySubClassFeatures() {
        return displaySubClassFeatures;
    }
}

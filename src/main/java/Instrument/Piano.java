package Instrument;

public class Piano {
    //Octaves : 2-6
    private PianoKeys[] keyC;
    private PianoKeys[] keyDb;
    private PianoKeys[] keyD;
    private PianoKeys[] keyEb;
    private PianoKeys[] keyE;

    //Octaves : 2-5
    private PianoKeys[] keyF;
    private PianoKeys[] keyGb;

    //Octaves : 1-5
    private PianoKeys[] keyG;
    private PianoKeys[] keyAb;
    private PianoKeys[] keyA;
    private PianoKeys[] keyBb;
    private PianoKeys[] keyB;

    public Piano(){
        keyC = new PianoKeys[5];
        keyDb = new PianoKeys[5];
        keyD = new PianoKeys[5];
        keyEb = new PianoKeys[5];
        keyE = new PianoKeys[5];
        keyF = new PianoKeys[4];
        keyGb = new PianoKeys[4];
        keyG = new PianoKeys[5];
        keyAb = new PianoKeys[5];
        keyA = new PianoKeys[5];
        keyBb = new PianoKeys[5];
        keyB = new PianoKeys[5];

        //C - E
        for(int i = 0; i < 5; i++){
            keyC[i] = new PianoKeys(keyName.C, i+2);
            keyDb[i] = new PianoKeys(keyName.DFLAT, i+2);
            keyD[i] = new PianoKeys(keyName.D, i+2);
            keyEb[i] = new PianoKeys(keyName.EFLAT, i+2);
            keyE[i] = new PianoKeys(keyName.E, i+2);

            if(i < 4){
                keyF[i] = new PianoKeys(keyName.F, i+2);
                keyGb[i] = new PianoKeys(keyName.GFLAT, i+2);
            }

            keyG[i] = new PianoKeys(keyName.G, i+1);
            keyAb[i] = new PianoKeys(keyName.AFLAT, i+1);
            keyA[i] = new PianoKeys(keyName.A, i+1);
            keyBb[i] = new PianoKeys(keyName.BFLAT, i+1);
            keyB[i] = new PianoKeys(keyName.B, i+1);
        }
    }

    public PianoKeys getKey(keyName k, int Octave){
        try{
            if(k == keyName.C){
                return keyC[Octave-2];
            }
            else if(k == keyName.DFLAT){
                return keyDb[Octave-2];
            }
            else if(k == keyName.D){
                return keyD[Octave-2];
            }
            else if(k == keyName.EFLAT){
                return keyEb[Octave-2];
            }
            else if(k == keyName.E){
                return keyE[Octave-2];
            }
            else if(k == keyName.F){
                return keyF[Octave-2];
            }
            else if(k == keyName.GFLAT){
                return keyGb[Octave-2];
            }
            else if(k == keyName.G){
                return keyG[Octave-1];
            }
            else if(k == keyName.AFLAT){
                return keyAb[Octave-1];
            }
            else if(k == keyName.A){
                return keyA[Octave-1];
            }
            else if(k == keyName.BFLAT){
                return keyBb[Octave-1];
            }
            else if(k == keyName.B){
                return keyB[Octave-1];
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public PianoKeys getKey(String k, int Octave){
        try{
            if(k.equals(keyName.C.getName())){
                return keyC[Octave-2];
            }
            else if(k.equals(keyName.DFLAT.getName())){
                return keyDb[Octave-2];
            }
            else if(k.equals(keyName.D.getName())){
                return keyD[Octave-2];
            }
            else if(k.equals(keyName.EFLAT.getName())){
                return keyEb[Octave-2];
            }
            else if(k.equals(keyName.E.getName())){
                return keyE[Octave-2];
            }
            else if(k.equals(keyName.F.getName())){
                return keyF[Octave-2];
            }
            else if(k.equals(keyName.GFLAT.getName())){
                return keyGb[Octave-2];
            }
            else if(k.equals(keyName.G.getName())){
                return keyG[Octave-1];
            }
            else if(k.equals(keyName.AFLAT.getName())){
                return keyAb[Octave-1];
            }
            else if(k.equals(keyName.A.getName())){
                return keyA[Octave-1];
            }
            else if(k.equals(keyName.BFLAT.getName())){
                return keyBb[Octave-1];
            }
            else if(k.equals(keyName.B.getName())){
                return keyB[Octave-1];
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}

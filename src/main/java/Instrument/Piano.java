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

            }
            else if(k == keyName.DFLAT){

            }
            else if(k == keyName.D){

            }
            else if(k == keyName.EFLAT){

            }
            else if(k == keyName.E){

            }
            else if(k == keyName.F){

            }
            else if(k == keyName.GFLAT){

            }
            else if(k == keyName.G){

            }
            else if(k == keyName.AFLAT){

            }
            else if(k == keyName.A){

            }
            else if(k == keyName.BFLAT){

            }
            else if(k == keyName.B){

            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}

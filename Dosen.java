public class Dosen {
    String nama;
    int umur;
    String nomorDosen;

    public Dosen(String nama, int umur, String nomorDosen) {
        this.nama = nama;
        this.umur = umur;
        this.nomorDosen = nomorDosen;
    }

    public void setUmur( int umur ) {
        this.umur = umur;
    }

    public int getUmur( ) {
        return this.umur;
    }

}
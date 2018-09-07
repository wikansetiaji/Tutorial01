public class Mahasiswa {
    String nama;
    int umur;
    String npm;

    public Mahasiswa(String nama, int umur, String npm) {
        this.nama = nama;
        this.umur = umur;
        this.npm = npm;
    }

    public void setUmur( int umur ) {
        this.umur = umur;
    }

    public int getUmur( ) {
        return this.umur;
    }

}
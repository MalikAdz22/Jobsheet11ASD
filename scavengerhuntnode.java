public class scavengerhuntnode {
    String soal, kunci;
    scavengerhuntnode next;

    scavengerhuntnode() {}

    scavengerhuntnode(String soal, String kunci, scavengerhuntnode next) {
        this.soal = soal;
        this.kunci = kunci;
        this.next = next;
    }
}
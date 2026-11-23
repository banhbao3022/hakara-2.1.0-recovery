package p007c.p190n.p438f.p448n.p449b;

/* JADX INFO: renamed from: c.n.f.n.b.b, reason: use source file name */
/* JADX INFO: compiled from: Mode.java */
/* JADX INFO: loaded from: classes.dex */
public enum Mode {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: q */
    public final int[] f27787q;

    /* JADX INFO: renamed from: r */
    public final int f27788r;

    Mode(int[] iArr, int i) {
        this.f27787q = iArr;
        this.f27788r = i;
    }

    /* JADX INFO: renamed from: f */
    public int m12411f(Version version) {
        char c2;
        int i = version.f27790b;
        if (i <= 9) {
            c2 = 0;
        } else {
            c2 = i <= 26 ? (char) 1 : (char) 2;
        }
        return this.f27787q[c2];
    }
}

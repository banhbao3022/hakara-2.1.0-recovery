package p477d1.p481d0;

/* JADX INFO: renamed from: d1.d0.g, reason: use source file name */
/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes.dex */
public enum Regex3 implements Regex {
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_CASE(2, 0, 2),
    /* JADX INFO: Fake field, exist only in values array */
    MULTILINE(8, 0, 2),
    /* JADX INFO: Fake field, exist only in values array */
    LITERAL(16, 0, 2),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1, 0, 2),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4, 0, 2),
    /* JADX INFO: Fake field, exist only in values array */
    DOT_MATCHES_ALL(32, 0, 2),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(128, 0, 2);


    /* JADX INFO: renamed from: g */
    public final int f29471g;

    Regex3(int i, int i2, int i3) {
        this.f29471g = i;
    }

    @Override // p477d1.p481d0.Regex
    public int getValue() {
        return this.f29471g;
    }
}

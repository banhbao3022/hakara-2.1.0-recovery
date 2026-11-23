package p007c.p154j;

import java.io.Serializable;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.j.e, reason: use source file name */
/* JADX INFO: compiled from: Progress.java */
/* JADX INFO: loaded from: classes.dex */
public class Progress implements Serializable {

    /* JADX INFO: renamed from: f */
    public long f4409f;

    /* JADX INFO: renamed from: g */
    public long f4410g;

    public Progress(long j2, long j3) {
        this.f4409f = j2;
        this.f4410g = j3;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Progress{currentBytes=");
        sbM1556G.append(this.f4409f);
        sbM1556G.append(", totalBytes=");
        sbM1556G.append(this.f4410g);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}

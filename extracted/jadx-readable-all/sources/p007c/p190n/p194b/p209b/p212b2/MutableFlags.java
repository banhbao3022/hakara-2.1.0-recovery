package p007c.p190n.p194b.p209b.p212b2;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: c.n.b.b.b2.t, reason: use source file name */
/* JADX INFO: compiled from: MutableFlags.java */
/* JADX INFO: loaded from: classes.dex */
public class MutableFlags {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f6367a = new SparseBooleanArray();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MutableFlags) {
            return this.f6367a.equals(((MutableFlags) obj).f6367a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6367a.hashCode();
    }
}

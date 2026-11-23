package p007c.p190n.p194b.p209b;

import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.t0, reason: use source file name */
/* JADX INFO: compiled from: MediaMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadata {

    /* JADX INFO: renamed from: a */
    public final String f8537a = null;

    /* JADX INFO: renamed from: c.n.b.b.t0$b */
    /* JADX INFO: compiled from: MediaMetadata.java */
    public static final class b {
    }

    public MediaMetadata(String str, a aVar) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaMetadata.class != obj.getClass()) {
            return false;
        }
        return Util6.m3113a(this.f8537a, ((MediaMetadata) obj).f8537a);
    }

    public int hashCode() {
        String str = this.f8537a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}

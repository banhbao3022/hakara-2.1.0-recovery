package p007c.p008a.p009a.p029b.p038c;

import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.b.c.d, reason: use source file name */
/* JADX INFO: compiled from: PlaylistItemChange.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PlaylistItemChange<T extends PlaylistItem> {

    /* JADX INFO: renamed from: a */
    public final T f1757a;

    /* JADX INFO: renamed from: b */
    public final boolean f1758b;

    /* JADX INFO: renamed from: c */
    public final boolean f1759c;

    public PlaylistItemChange(T t, boolean z, boolean z2) {
        this.f1757a = t;
        this.f1758b = z;
        this.f1759c = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlaylistItemChange) {
                PlaylistItemChange playlistItemChange = (PlaylistItemChange) obj;
                if (Intrinsics2.m13085a(this.f1757a, playlistItemChange.f1757a)) {
                    if (this.f1758b == playlistItemChange.f1758b) {
                        if (this.f1759c == playlistItemChange.f1759c) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        T t = this.f1757a;
        int iHashCode = (t != null ? t.hashCode() : 0) * 31;
        boolean z = this.f1758b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.f1759c;
        return i + (z2 ? 1 : z2);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("PlaylistItemChange(currentItem=");
        sbM1556G.append(this.f1757a);
        sbM1556G.append(", hasPrevious=");
        sbM1556G.append(this.f1758b);
        sbM1556G.append(", hasNext=");
        sbM1556G.append(this.f1759c);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }
}

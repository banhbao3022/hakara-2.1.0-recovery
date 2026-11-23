package p007c.p190n.p194b.p209b.p262y1;

import java.util.Arrays;

/* JADX INFO: renamed from: c.n.b.b.y1.l, reason: use source file name */
/* JADX INFO: compiled from: TrackSelectionArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionArray {

    /* JADX INFO: renamed from: a */
    public final int f10347a;

    /* JADX INFO: renamed from: b */
    public final TrackSelection[] f10348b;

    /* JADX INFO: renamed from: c */
    public int f10349c;

    public TrackSelectionArray(TrackSelection... trackSelectionArr) {
        this.f10348b = trackSelectionArr;
        this.f10347a = trackSelectionArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackSelectionArray.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10348b, ((TrackSelectionArray) obj).f10348b);
    }

    public int hashCode() {
        if (this.f10349c == 0) {
            this.f10349c = 527 + Arrays.hashCode(this.f10348b);
        }
        return this.f10349c;
    }
}

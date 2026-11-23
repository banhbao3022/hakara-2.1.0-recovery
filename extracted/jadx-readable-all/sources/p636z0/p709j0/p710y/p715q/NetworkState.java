package p636z0.p709j0.p710y.p715q;

/* JADX INFO: renamed from: z0.j0.y.q.b, reason: use source file name */
/* JADX INFO: compiled from: NetworkState.java */
/* JADX INFO: loaded from: classes.dex */
public class NetworkState {

    /* JADX INFO: renamed from: a */
    public boolean f37443a;

    /* JADX INFO: renamed from: b */
    public boolean f37444b;

    /* JADX INFO: renamed from: c */
    public boolean f37445c;

    /* JADX INFO: renamed from: d */
    public boolean f37446d;

    public NetworkState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f37443a = z;
        this.f37444b = z2;
        this.f37445c = z3;
        this.f37446d = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.f37443a == networkState.f37443a && this.f37444b == networkState.f37444b && this.f37445c == networkState.f37445c && this.f37446d == networkState.f37446d;
    }

    public int hashCode() {
        int i = this.f37443a ? 1 : 0;
        if (this.f37444b) {
            i += 16;
        }
        if (this.f37445c) {
            i += 256;
        }
        return this.f37446d ? i + 4096 : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f37443a), Boolean.valueOf(this.f37444b), Boolean.valueOf(this.f37445c), Boolean.valueOf(this.f37446d));
    }
}

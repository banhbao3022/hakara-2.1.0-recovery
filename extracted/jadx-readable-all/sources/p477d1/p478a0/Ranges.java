package p477d1.p478a0;

import p477d1.p493x.p495c.DefaultConstructorMarker;

/* JADX INFO: renamed from: d1.a0.c, reason: use source file name */
/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Ranges extends Progressions {

    /* JADX INFO: renamed from: k */
    public static final a f29439k = new a(null);

    /* JADX INFO: renamed from: j */
    public static final Ranges f29438j = new Ranges(1, 0);

    /* JADX INFO: renamed from: d1.a0.c$a */
    /* JADX INFO: compiled from: Ranges.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Ranges(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // p477d1.p478a0.Progressions
    public boolean equals(Object obj) {
        if (obj instanceof Ranges) {
            if (!isEmpty() || !((Ranges) obj).isEmpty()) {
                Ranges ranges = (Ranges) obj;
                if (this.f29431g != ranges.f29431g || this.f29432h != ranges.f29432h) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p477d1.p478a0.Progressions
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f29431g * 31) + this.f29432h;
    }

    @Override // p477d1.p478a0.Progressions
    public boolean isEmpty() {
        return this.f29431g > this.f29432h;
    }

    @Override // p477d1.p478a0.Progressions
    public String toString() {
        return this.f29431g + ".." + this.f29432h;
    }
}

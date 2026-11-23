package p007c.p190n.p438f.p439i.p440b;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.f.i.b.g, reason: use source file name */
/* JADX INFO: compiled from: State.java */
/* JADX INFO: loaded from: classes.dex */
public final class State {

    /* JADX INFO: renamed from: a */
    public static final State f27634a = new State(Token2.f27639a, 0, 0, 0);

    /* JADX INFO: renamed from: b */
    public final int f27635b;

    /* JADX INFO: renamed from: c */
    public final Token2 f27636c;

    /* JADX INFO: renamed from: d */
    public final int f27637d;

    /* JADX INFO: renamed from: e */
    public final int f27638e;

    public State(Token2 token2, int i, int i2, int i3) {
        this.f27636c = token2;
        this.f27635b = i;
        this.f27637d = i2;
        this.f27638e = i3;
    }

    /* JADX INFO: renamed from: a */
    public State m12337a(int i) {
        int i2;
        Token2 simpleToken = this.f27636c;
        int i3 = this.f27635b;
        int i4 = this.f27638e;
        if (i3 == 4 || i3 == 2) {
            int i5 = HighLevelEncoder2.f27628b[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            Objects.requireNonNull(simpleToken);
            i4 += i7;
            simpleToken = new SimpleToken(simpleToken, i6, i7);
            i3 = 0;
        }
        int i8 = this.f27637d;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        int i9 = i8 + 1;
        State state = new State(simpleToken, i3, i9, i4 + i2);
        return i9 == 2078 ? state.m12338b(i + 1) : state;
    }

    /* JADX INFO: renamed from: b */
    public State m12338b(int i) {
        int i2 = this.f27637d;
        if (i2 == 0) {
            return this;
        }
        Token2 token2 = this.f27636c;
        Objects.requireNonNull(token2);
        return new State(new BinaryShiftToken(token2, i - i2, i2), this.f27635b, 0, this.f27638e);
    }

    /* JADX INFO: renamed from: c */
    public boolean m12339c(State state) {
        int i;
        int i2 = this.f27638e + (HighLevelEncoder2.f27628b[this.f27635b][state.f27635b] >> 16);
        int i3 = state.f27637d;
        if (i3 > 0 && ((i = this.f27637d) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= state.f27638e;
    }

    /* JADX INFO: renamed from: d */
    public State m12340d(int i, int i2) {
        int i3 = this.f27638e;
        Token2 simpleToken = this.f27636c;
        int i4 = this.f27635b;
        if (i != i4) {
            int i5 = HighLevelEncoder2.f27628b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            Objects.requireNonNull(simpleToken);
            i3 += i7;
            simpleToken = new SimpleToken(simpleToken, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        Objects.requireNonNull(simpleToken);
        return new State(new SimpleToken(simpleToken, i2, i8), i, 0, i3 + i8);
    }

    /* JADX INFO: renamed from: e */
    public State m12341e(int i, int i2) {
        Token2 token2 = this.f27636c;
        int i3 = this.f27635b;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = HighLevelEncoder2.f27630d[i3][i];
        Objects.requireNonNull(token2);
        return new State(new SimpleToken(new SimpleToken(token2, i5, i4), i2, 5), this.f27635b, 0, this.f27638e + i4 + 5);
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder2.f27627a[this.f27635b], Integer.valueOf(this.f27638e), Integer.valueOf(this.f27637d));
    }
}

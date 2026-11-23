package p007c.p190n.p438f.p439i.p440b;

import java.util.Comparator;

/* JADX INFO: renamed from: c.n.f.i.b.d, reason: use source file name */
/* JADX INFO: compiled from: HighLevelEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class HighLevelEncoder implements Comparator<State> {
    public HighLevelEncoder(HighLevelEncoder2 highLevelEncoder2) {
    }

    @Override // java.util.Comparator
    public int compare(State state, State state2) {
        return state.f27638e - state2.f27638e;
    }
}

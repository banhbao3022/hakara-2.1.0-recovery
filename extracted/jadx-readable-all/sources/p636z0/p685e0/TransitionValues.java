package p636z0.p685e0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.e0.q, reason: use source file name */
/* JADX INFO: compiled from: TransitionValues.java */
/* JADX INFO: loaded from: classes.dex */
public class TransitionValues {

    /* JADX INFO: renamed from: b */
    public View f36493b;

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f36492a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList<Transition3> f36494c = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.f36493b == transitionValues.f36493b && this.f36492a.equals(transitionValues.f36492a);
    }

    public int hashCode() {
        return this.f36492a.hashCode() + (this.f36493b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("TransitionValues@");
        sbM1556G.append(Integer.toHexString(hashCode()));
        sbM1556G.append(":\n");
        StringBuilder sbM1561L = outline.m1561L(sbM1556G.toString(), "    view = ");
        sbM1561L.append(this.f36493b);
        sbM1561L.append("\n");
        String strM1599u = outline.m1599u(sbM1561L.toString(), "    values:");
        for (String str : this.f36492a.keySet()) {
            strM1599u = strM1599u + "    " + str + ": " + this.f36492a.get(str) + "\n";
        }
        return strM1599u;
    }

    public TransitionValues(View view) {
        this.f36493b = view;
    }
}

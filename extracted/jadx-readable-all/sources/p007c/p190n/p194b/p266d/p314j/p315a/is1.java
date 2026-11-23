package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class is1 implements Iterable<String> {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CharSequence f15374f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ks1 f15375g;

    public is1(ks1 ks1Var, CharSequence charSequence) {
        this.f15375g = ks1Var;
        this.f15374f = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        ks1 ks1Var = this.f15375g;
        return new gs1(ks1Var.f16030a, ks1Var, this.f15374f);
    }

    public final String toString() {
        StringBuilder sbM1555F = outline.m1555F('[');
        try {
            js1 js1Var = (js1) iterator();
            if (js1Var.hasNext()) {
                Object next = js1Var.next();
                Objects.requireNonNull(next);
                sbM1555F.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (js1Var.hasNext()) {
                    sbM1555F.append((CharSequence) ", ");
                    Object next2 = js1Var.next();
                    Objects.requireNonNull(next2);
                    sbM1555F.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            sbM1555F.append(']');
            return sbM1555F.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}

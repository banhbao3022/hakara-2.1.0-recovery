package p636z0.p774z.p775b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: z0.z.b.w, reason: use source file name */
/* JADX INFO: compiled from: OrientationHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class OrientationHelper extends OrientationHelper3 {
    public OrientationHelper(RecyclerView.AbstractC0160m abstractC0160m) {
        super(abstractC0160m, null);
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: b */
    public int mo17063b(View view) {
        return this.f39343a.m716G(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0161n) view.getLayoutParams())).rightMargin;
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: c */
    public int mo17064c(View view) {
        RecyclerView.C0161n c0161n = (RecyclerView.C0161n) view.getLayoutParams();
        return this.f39343a.m714F(view) + ((ViewGroup.MarginLayoutParams) c0161n).leftMargin + ((ViewGroup.MarginLayoutParams) c0161n).rightMargin;
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: d */
    public int mo17065d(View view) {
        RecyclerView.C0161n c0161n = (RecyclerView.C0161n) view.getLayoutParams();
        return this.f39343a.m712E(view) + ((ViewGroup.MarginLayoutParams) c0161n).topMargin + ((ViewGroup.MarginLayoutParams) c0161n).bottomMargin;
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: e */
    public int mo17066e(View view) {
        return this.f39343a.m710D(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0161n) view.getLayoutParams())).leftMargin;
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: f */
    public int mo17067f() {
        return this.f39343a.f1050p;
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: g */
    public int mo17068g() {
        RecyclerView.AbstractC0160m abstractC0160m = this.f39343a;
        return abstractC0160m.f1050p - abstractC0160m.m731P();
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: h */
    public int mo17069h() {
        return this.f39343a.m731P();
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: i */
    public int mo17070i() {
        return this.f39343a.f1048n;
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: j */
    public int mo17071j() {
        return this.f39343a.f1049o;
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: k */
    public int mo17072k() {
        return this.f39343a.m730O();
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: l */
    public int mo17073l() {
        RecyclerView.AbstractC0160m abstractC0160m = this.f39343a;
        return (abstractC0160m.f1050p - abstractC0160m.m730O()) - this.f39343a.m731P();
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: n */
    public int mo17074n(View view) {
        this.f39343a.m740V(view, true, this.f39345c);
        return this.f39345c.right;
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: o */
    public int mo17075o(View view) {
        this.f39343a.m740V(view, true, this.f39345c);
        return this.f39345c.left;
    }

    @Override // p636z0.p774z.p775b.OrientationHelper3
    /* JADX INFO: renamed from: p */
    public void mo17076p(int i) {
        this.f39343a.mo747b0(i);
    }
}

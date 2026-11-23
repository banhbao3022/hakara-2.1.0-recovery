package p007c.p190n.p194b.p266d.p314j.p315a;

import android.widget.RelativeLayout;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2236s;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.ViewOnClickListenerC2237t;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yc1 implements w41<C3788zz> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zc1 f21851a;

    public yc1(zc1 zc1Var) {
        this.f21851a = zc1Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0064  */
    /* JADX WARN: Code duplicated, block: B:12:0x0066  */
    /* JADX WARN: Code duplicated, block: B:15:0x006b  */
    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    /* JADX WARN: Code duplicated, block: B:19:0x008a  */
    /* JADX WARN: Code duplicated, block: B:20:0x008d  */
    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0041, please report this as an issue */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w41
    /* JADX INFO: renamed from: b */
    public final void mo5986b(C3788zz c3788zz) {
        boolean zM8914c;
        int iIntValue;
        int i;
        int i2;
        ViewOnClickListenerC2237t viewOnClickListenerC2237t;
        int i3;
        C3788zz c3788zz2 = c3788zz;
        C3788zz c3788zz3 = this.f21851a.f22242p;
        if (c3788zz3 != null) {
            c3788zz3.mo7041b();
        }
        zc1 zc1Var = this.f21851a;
        zc1Var.f22242p = c3788zz2;
        zc1Var.f22234h.removeAllViews();
        this.f21851a.f22234h.addView(c3788zz2.f22448i, C2330u.f10884a.f10891f.mo4721j());
        if (c3788zz2.f22452m) {
            zc1 zc1Var2 = this.f21851a;
            zM8914c = c3788zz2.m8914c();
            iIntValue = ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14217K2)).intValue();
            C2236s c2236s = new C2236s();
            c2236s.f10680d = 50;
            if (true != zM8914c) {
                i = 0;
            } else {
                i = iIntValue;
            }
            c2236s.f10677a = i;
            if (true != zM8914c) {
                i2 = iIntValue;
            } else {
                i2 = 0;
            }
            c2236s.f10678b = i2;
            c2236s.f10679c = iIntValue;
            viewOnClickListenerC2237t = new ViewOnClickListenerC2237t(zc1Var2.f22233g, c2236s, zc1Var2);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            if (true != c3788zz2.m8914c()) {
                i3 = 9;
            } else {
                i3 = 11;
            }
            layoutParams.addRule(i3);
            if ((c3788zz2.f22449j.mo6513x0() || c3788zz2.f22453n) ? false : true) {
                viewOnClickListenerC2237t.f10681f.setVisibility(8);
            } else {
                viewOnClickListenerC2237t.f10681f.setVisibility(0);
            }
            this.f21851a.f22234h.addView(viewOnClickListenerC2237t, layoutParams);
        } else {
            if (this.f21851a.f22239m.f21617h < ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14307Z2)).intValue()) {
                zc1 zc1Var3 = this.f21851a;
                zM8914c = c3788zz2.m8914c();
                iIntValue = ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14217K2)).intValue();
                C2236s c2236s2 = new C2236s();
                c2236s2.f10680d = 50;
                if (true != zM8914c) {
                    i = 0;
                } else {
                    i = iIntValue;
                }
                c2236s2.f10677a = i;
                if (true != zM8914c) {
                    i2 = iIntValue;
                } else {
                    i2 = 0;
                }
                c2236s2.f10678b = i2;
                c2236s2.f10679c = iIntValue;
                viewOnClickListenerC2237t = new ViewOnClickListenerC2237t(zc1Var3.f22233g, c2236s2, zc1Var3);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(10);
                if (true != c3788zz2.m8914c()) {
                    i3 = 9;
                } else {
                    i3 = 11;
                }
                layoutParams2.addRule(i3);
                if ((c3788zz2.f22449j.mo6513x0() || c3788zz2.f22453n) ? false : true) {
                    viewOnClickListenerC2237t.f10681f.setVisibility(8);
                } else {
                    viewOnClickListenerC2237t.f10681f.setVisibility(0);
                }
                this.f21851a.f22234h.addView(viewOnClickListenerC2237t, layoutParams2);
            }
        }
        c3788zz2.f22449j.mo6517z0(this.f21851a);
        zc1 zc1Var4 = this.f21851a;
        zc1Var4.f22234h.setMinimumHeight(zc1.m8880F6(zc1Var4).f15837h);
        zc1 zc1Var5 = this.f21851a;
        zc1Var5.f22234h.setMinimumWidth(zc1.m8880F6(zc1Var5).f15840k);
        this.f21851a.f22238l.m8483b(new j00(c3788zz2, this.f21851a));
        c3788zz2.mo7653a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w41
    public final void zza() {
        this.f21851a.f22242p = null;
    }
}

package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class s51 implements ia1<t51> {

    /* JADX INFO: renamed from: a */
    public final ia1<oa1> f19471a;

    /* JADX INFO: renamed from: b */
    public final ii1 f19472b;

    /* JADX INFO: renamed from: c */
    public final Context f19473c;

    /* JADX INFO: renamed from: d */
    public final C2998en f19474d;

    public s51(d71<oa1> d71Var, ii1 ii1Var, Context context, C2998en c2998en) {
        this.f19471a = d71Var;
        this.f19472b = ii1Var;
        this.f19473c = context;
        this.f19474d = c2998en;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<t51> zza() {
        return cw0.m6250t(this.f19471a.zza(), new cs1(this) { // from class: c.n.b.d.j.a.r51

            /* JADX INFO: renamed from: a */
            public final s51 f18708a;

            {
                this.f18708a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
            public final Object apply(Object obj) {
                String str;
                boolean z;
                String strM4840k;
                float f;
                int i;
                int i2;
                int i3;
                DisplayMetrics displayMetrics;
                s51 s51Var = this.f18708a;
                jw2 jw2Var = s51Var.f19472b.f15192e;
                jw2[] jw2VarArr = jw2Var.f15841l;
                if (jw2VarArr != null) {
                    str = null;
                    boolean z2 = false;
                    boolean z3 = false;
                    z = false;
                    for (jw2 jw2Var2 : jw2VarArr) {
                        boolean z4 = jw2Var2.f15843n;
                        if (!z4 && !z2) {
                            str = jw2Var2.f15835f;
                            z2 = true;
                        }
                        if (z4) {
                            if (z3) {
                                z3 = true;
                            } else {
                                z3 = true;
                                z = true;
                            }
                        }
                        if (z2 && z3) {
                            break;
                        }
                    }
                } else {
                    str = jw2Var.f15835f;
                    z = jw2Var.f15843n;
                }
                Resources resources = s51Var.f19473c.getResources();
                if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                    strM4840k = null;
                    f = 0.0f;
                    i = 0;
                    i2 = 0;
                } else {
                    float f2 = displayMetrics.density;
                    int i4 = displayMetrics.widthPixels;
                    i2 = displayMetrics.heightPixels;
                    strM4840k = ((C2311z0) s51Var.f19474d.m6649f()).m4840k();
                    i = i4;
                    f = f2;
                }
                StringBuilder sb = new StringBuilder();
                jw2[] jw2VarArr2 = jw2Var.f15841l;
                if (jw2VarArr2 != null) {
                    boolean z5 = false;
                    for (jw2 jw2Var3 : jw2VarArr2) {
                        if (jw2Var3.f15843n) {
                            z5 = true;
                        } else {
                            if (sb.length() != 0) {
                                sb.append("|");
                            }
                            int i5 = jw2Var3.f15839j;
                            if (i5 == -1) {
                                i5 = f != 0.0f ? (int) (jw2Var3.f15840k / f) : -1;
                            }
                            sb.append(i5);
                            sb.append("x");
                            int i6 = jw2Var3.f15836g;
                            if (i6 == -2) {
                                i6 = f != 0.0f ? (int) (jw2Var3.f15837h / f) : -2;
                            }
                            sb.append(i6);
                        }
                    }
                    if (z5) {
                        if (sb.length() != 0) {
                            i3 = 0;
                            sb.insert(0, "|");
                        } else {
                            i3 = 0;
                        }
                        sb.insert(i3, "320x50");
                    }
                }
                return new t51(jw2Var, str, z, sb.toString(), f, i, i2, strM4840k, s51Var.f19472b.f15203p);
            }
        }, C2962do.f13335f);
    }
}

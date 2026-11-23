package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pc2 implements tb2 {

    /* JADX INFO: renamed from: f */
    public static volatile pe2 f17907f;

    /* JADX INFO: renamed from: g */
    public MotionEvent f17908g;

    /* JADX INFO: renamed from: p */
    public double f17917p;

    /* JADX INFO: renamed from: q */
    public double f17918q;

    /* JADX INFO: renamed from: r */
    public double f17919r;

    /* JADX INFO: renamed from: s */
    public float f17920s;

    /* JADX INFO: renamed from: t */
    public float f17921t;

    /* JADX INFO: renamed from: u */
    public float f17922u;

    /* JADX INFO: renamed from: v */
    public float f17923v;

    /* JADX INFO: renamed from: y */
    public DisplayMetrics f17926y;

    /* JADX INFO: renamed from: h */
    public final LinkedList<MotionEvent> f17909h = new LinkedList<>();

    /* JADX INFO: renamed from: i */
    public long f17910i = 0;

    /* JADX INFO: renamed from: j */
    public long f17911j = 0;

    /* JADX INFO: renamed from: k */
    public long f17912k = 0;

    /* JADX INFO: renamed from: l */
    public long f17913l = 0;

    /* JADX INFO: renamed from: m */
    public long f17914m = 0;

    /* JADX INFO: renamed from: n */
    public long f17915n = 0;

    /* JADX INFO: renamed from: o */
    public long f17916o = 0;

    /* JADX INFO: renamed from: w */
    public boolean f17924w = false;

    /* JADX INFO: renamed from: x */
    public boolean f17925x = false;

    public pc2(Context context) {
        try {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14158B1)).booleanValue()) {
                kr1.m7538a();
            } else {
                cw0.m6235e(f17907f);
            }
            this.f17926y = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: c */
    public abstract String mo4854c(Context context, String str, View view, Activity activity);

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: e */
    public final String mo4856e(Context context, String str, View view) {
        return mo4854c(context, str, view, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m8096h() {
        this.f17914m = 0L;
        this.f17910i = 0L;
        this.f17911j = 0L;
        this.f17912k = 0L;
        this.f17913l = 0L;
        this.f17915n = 0L;
        this.f17916o = 0L;
        if (this.f17909h.size() > 0) {
            Iterator<MotionEvent> it = this.f17909h.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.f17909h.clear();
        } else {
            MotionEvent motionEvent = this.f17908g;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f17908g = null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127 A[Catch: Exception -> 0x015f, TryCatch #0 {Exception -> 0x015f, blocks: (B:57:0x011a, B:60:0x0127, B:69:0x014a, B:70:0x0159), top: B:85:0x011a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0141  */
    /* JADX WARN: Code duplicated, block: B:68:0x0146  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159 A[Catch: Exception -> 0x015f, TRY_LEAVE, TryCatch #0 {Exception -> 0x015f, blocks: (B:57:0x011a, B:60:0x0127, B:69:0x014a, B:70:0x0159), top: B:85:0x011a }] */
    /* JADX WARN: Code duplicated, block: B:85:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public final String m8097i(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        String str2;
        va2 va2Var;
        int i2;
        Exception exc;
        go0 go0Var;
        int i3;
        long jCurrentTimeMillis;
        String strM7539b;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14438s1;
        C2862b c2862b = C2862b.f12493a;
        boolean zBooleanValue = ((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue();
        go0 go0Var2 = null;
        if (zBooleanValue) {
            va2Var = f17907f != null ? f17907f.f17958m : null;
            str2 = true != ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14158B1)).booleanValue() ? "te" : "be";
        } else {
            str2 = null;
            va2Var = null;
        }
        try {
            if (i7 == 3) {
                pd2 pd2Var = (pd2) this;
                go0 go0VarM6750r0 = f31.m6750r0();
                if (!TextUtils.isEmpty(pd2Var.f17938H)) {
                    go0VarM6750r0.m7009t(pd2Var.f17938H);
                }
                pd2Var.m8105o(pd2.m8098l(context, pd2Var.f17937G), go0VarM6750r0, view, activity, true);
                try {
                    this.f17924w = true;
                    go0Var2 = go0VarM6750r0;
                    i6 = CloseCodes.PROTOCOL_ERROR;
                } catch (Exception e) {
                    exc = e;
                    go0Var = go0VarM6750r0;
                    i2 = 3;
                    if (zBooleanValue) {
                    }
                    go0Var2 = go0Var;
                }
            } else if (i7 == 2) {
                pd2 pd2Var2 = (pd2) this;
                go0 go0VarM6750r1 = f31.m6750r0();
                go0VarM6750r1.m7009t(pd2Var2.f17938H);
                pd2Var2.m8105o(pd2.m8098l(context, pd2Var2.f17937G), go0VarM6750r1, view, activity, false);
                go0Var2 = go0VarM6750r1;
                i6 = 1008;
            } else {
                pd2 pd2Var3 = (pd2) this;
                go0 go0VarM6750r2 = f31.m6750r0();
                if (!TextUtils.isEmpty(pd2Var3.f17938H)) {
                    go0VarM6750r2.m7009t(pd2Var3.f17938H);
                }
                pe2 pe2VarM8098l = pd2.m8098l(context, pd2Var3.f17937G);
                if (pe2VarM8098l.f17948c != null) {
                    pd2.m8100p(pd2Var3.mo8104n(pe2VarM8098l, context, go0VarM6750r2, null));
                }
                go0Var2 = go0VarM6750r2;
                i6 = CloseCodes.NORMAL_CLOSURE;
            }
            if (!zBooleanValue || va2Var == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    va2Var.m8542a(i6, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    go0Var = go0Var2;
                    if (zBooleanValue || va2Var == null) {
                        go0Var2 = go0Var;
                    } else {
                        if (i7 == i2) {
                            i3 = 1003;
                        } else if (i7 == 2) {
                            i3 = 1009;
                        } else {
                            i7 = 1;
                            i3 = 1001;
                        }
                        va2Var.m8542a(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (go0Var == null) {
                        try {
                            if (((f31) go0Var.m6300o()).mo6961e() == 0) {
                                strM7539b = Integer.toString(5);
                            } else {
                                strM7539b = kr1.m7539b((f31) go0Var.m6300o(), str);
                                if (zBooleanValue) {
                                    if (i7 == i2) {
                                        i4 = CloseCodes.CLOSED_ABNORMALLY;
                                    } else if (i7 == 2) {
                                        i4 = 1010;
                                    } else {
                                        i4 = 1004;
                                    }
                                    va2Var.m8542a(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                                }
                            }
                        } catch (Exception e3) {
                            strM7539b = Integer.toString(7);
                            if (zBooleanValue && va2Var != null) {
                                if (i7 == i2) {
                                    i5 = 1007;
                                } else {
                                    i5 = i7 == 2 ? CloseCodes.UNEXPECTED_CONDITION : 1005;
                                }
                                va2Var.m8542a(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e3);
                            }
                        }
                    } else {
                        strM7539b = Integer.toString(5);
                    }
                    return strM7539b;
                }
            }
        } catch (Exception e4) {
            e = e4;
            i2 = 3;
        }
        go0Var = go0Var2;
        jCurrentTimeMillis = System.currentTimeMillis();
        if (go0Var == null) {
            strM7539b = Integer.toString(5);
        } else if (((f31) go0Var.m6300o()).mo6961e() == 0) {
            strM7539b = Integer.toString(5);
        } else {
            strM7539b = kr1.m7539b((f31) go0Var.m6300o(), str);
            if (zBooleanValue && va2Var != null) {
                if (i7 == i2) {
                    i4 = CloseCodes.CLOSED_ABNORMALLY;
                } else if (i7 == 2) {
                    i4 = 1010;
                } else {
                    i4 = 1004;
                }
                va2Var.m8542a(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        }
        return strM7539b;
    }
}

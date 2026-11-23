package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import p007c.p190n.p194b.p266d.p298f.p307u.C2787g;

/* JADX INFO: renamed from: c.n.b.d.k.b.v3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4695v3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f24491f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24492g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f24493h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f24494i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f24495j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4662s3 f24496k;

    public RunnableC4695v3(C4662s3 c4662s3, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f24496k = c4662s3;
        this.f24491f = i;
        this.f24492g = str;
        this.f24493h = obj;
        this.f24494i = obj2;
        this.f24495j = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4510f4 c4510f4M10834k = this.f24496k.f24476a.m10834k();
        if (!c4510f4M10834k.m10762i()) {
            this.f24496k.m10748v(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        C4662s3 c4662s3 = this.f24496k;
        if (c4662s3.f24415c == 0) {
            C4469c c4469c = c4662s3.f24476a.f24534h;
            if (c4469c.f23744d == null) {
                synchronized (c4469c) {
                    if (c4469c.f23744d == null) {
                        ApplicationInfo applicationInfo = c4469c.f24476a.f24528b.getApplicationInfo();
                        String strM5629a = C2787g.m5629a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            c4469c.f23744d = Boolean.valueOf(str != null && str.equals(strM5629a));
                        }
                        if (c4469c.f23744d == null) {
                            c4469c.f23744d = Boolean.TRUE;
                            c4469c.mo10684l().f24418f.m10811a("My process not in the list of running processes");
                        }
                    }
                }
            }
            if (c4469c.f23744d.booleanValue()) {
                this.f24496k.f24415c = 'C';
            } else {
                this.f24496k.f24415c = 'c';
            }
        }
        C4662s3 c4662s4 = this.f24496k;
        if (c4662s4.f24416d < 0) {
            c4662s4.f24416d = 33025L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f24491f);
        C4662s3 c4662s5 = this.f24496k;
        char c2 = c4662s5.f24415c;
        long j2 = c4662s5.f24416d;
        String strM10740u = C4662s3.m10740u(true, this.f24492g, this.f24493h, this.f24494i, this.f24495j);
        StringBuilder sb = new StringBuilder(String.valueOf(strM10740u).length() + 24);
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c2);
        sb.append(j2);
        sb.append(":");
        sb.append(strM10740u);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = this.f24492g.substring(0, 1024);
        }
        C4594m4 c4594m4 = c4510f4M10834k.f23890e;
        c4594m4.f24147e.mo10381b();
        if (c4594m4.f24147e.m10538w().getLong(c4594m4.f24143a, 0L) == 0) {
            c4594m4.m10648a();
        }
        if (string == null) {
            string = "";
        }
        long j3 = c4594m4.f24147e.m10538w().getLong(c4594m4.f24144b, 0L);
        if (j3 <= 0) {
            SharedPreferences.Editor editorEdit = c4594m4.f24147e.m10538w().edit();
            editorEdit.putString(c4594m4.f24145c, string);
            editorEdit.putLong(c4594m4.f24144b, 1L);
            editorEdit.apply();
            return;
        }
        long j4 = j3 + 1;
        boolean z = (c4594m4.f24147e.m10817f().m10904v0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j4;
        SharedPreferences.Editor editorEdit2 = c4594m4.f24147e.m10538w().edit();
        if (z) {
            editorEdit2.putString(c4594m4.f24145c, string);
        }
        editorEdit2.putLong(c4594m4.f24144b, j4);
        editorEdit2.apply();
    }
}

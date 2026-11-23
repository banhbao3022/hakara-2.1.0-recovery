package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.AsyncTask;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bp1 extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a */
    public cp1 f12766a;

    /* JADX INFO: renamed from: b */
    public final to1 f12767b;

    public bp1(to1 to1Var, byte[] bArr) {
        this.f12767b = to1Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        cp1 cp1Var = this.f12766a;
        if (cp1Var != null) {
            cp1Var.f13076d = null;
            cp1Var.m6220b();
        }
    }
}

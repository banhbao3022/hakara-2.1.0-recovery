package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tl2 {

    /* JADX INFO: renamed from: a */
    public final cj2[] f19908a;

    /* JADX INFO: renamed from: b */
    public final dj2 f19909b;

    /* JADX INFO: renamed from: c */
    public cj2 f19910c;

    public tl2(cj2[] cj2VarArr, dj2 dj2Var) {
        this.f19908a = cj2VarArr;
        this.f19909b = dj2Var;
    }

    /* JADX INFO: renamed from: a */
    public final cj2 m8427a(bj2 bj2Var, Uri uri) throws InterruptedException, IOException {
        cj2 cj2Var = this.f19910c;
        if (cj2Var != null) {
            return cj2Var;
        }
        int i = 0;
        for (cj2 cj2Var2 : this.f19908a) {
            try {
                if (cj2Var2.mo6194c(bj2Var)) {
                    this.f19910c = cj2Var2;
                    bj2Var.f12712f = 0;
                    break;
                }
                continue;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                bj2Var.f12712f = 0;
                throw th;
            }
            bj2Var.f12712f = 0;
        }
        cj2 cj2Var3 = this.f19910c;
        if (cj2Var3 != null) {
            cj2Var3.mo6195d(this.f19909b);
            return this.f19910c;
        }
        cj2[] cj2VarArr = this.f19908a;
        int i2 = jo2.f15673a;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int length = cj2VarArr.length;
            if (i >= length) {
                String string = sb.toString();
                throw new pm2(outline.m1552C(new StringBuilder(String.valueOf(string).length() + 58), "None of the available extractors (", string, ") could read the stream."), uri);
            }
            sb.append(cj2VarArr[i].getClass().getSimpleName());
            if (i < length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}

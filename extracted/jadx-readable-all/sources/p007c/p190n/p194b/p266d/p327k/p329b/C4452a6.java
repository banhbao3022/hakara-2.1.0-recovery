package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.Context;
import android.os.Bundle;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p314j.p325k.C4149f;

/* JADX INFO: renamed from: c.n.b.d.k.b.a6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4452a6 {

    /* JADX INFO: renamed from: a */
    public final Context f23706a;

    /* JADX INFO: renamed from: b */
    public String f23707b;

    /* JADX INFO: renamed from: c */
    public String f23708c;

    /* JADX INFO: renamed from: d */
    public String f23709d;

    /* JADX INFO: renamed from: e */
    public Boolean f23710e;

    /* JADX INFO: renamed from: f */
    public long f23711f;

    /* JADX INFO: renamed from: g */
    public C4149f f23712g;

    /* JADX INFO: renamed from: h */
    public boolean f23713h;

    /* JADX INFO: renamed from: i */
    public Long f23714i;

    public C4452a6(Context context, C4149f c4149f, Long l) {
        this.f23713h = true;
        Objects.requireNonNull(context, "null reference");
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null reference");
        this.f23706a = applicationContext;
        this.f23714i = l;
        if (c4149f != null) {
            this.f23712g = c4149f;
            this.f23707b = c4149f.f23142k;
            this.f23708c = c4149f.f23141j;
            this.f23709d = c4149f.f23140i;
            this.f23713h = c4149f.f23139h;
            this.f23711f = c4149f.f23138g;
            Bundle bundle = c4149f.f23143l;
            if (bundle != null) {
                this.f23710e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class z51 implements ia1<a61> {

    /* JADX INFO: renamed from: a */
    public final lv1 f22180a;

    /* JADX INFO: renamed from: b */
    public final mm0 f22181b;

    /* JADX INFO: renamed from: c */
    public final lq0 f22182c;

    /* JADX INFO: renamed from: d */
    public final b61 f22183d;

    public z51(lv1 lv1Var, mm0 mm0Var, lq0 lq0Var, b61 b61Var) {
        this.f22180a = lv1Var;
        this.f22181b = mm0Var;
        this.f22182c = lq0Var;
        this.f22183d = b61Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<a61> zza() {
        String str = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14251Q0);
        int i = fs1.f14109a;
        if ((str == null || str.isEmpty()) || this.f22183d.f12532a.get() || !this.f22182c.f16443b) {
            return cw0.m6231a(new a61(new Bundle()));
        }
        this.f22183d.f12532a.set(true);
        return this.f22180a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.y51

            /* JADX INFO: renamed from: a */
            public final z51 f21744a;

            {
                this.f21744a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                z51 z51Var = this.f21744a;
                Objects.requireNonNull(z51Var);
                List<String> listAsList = Arrays.asList(((String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14251Q0)).split(";"));
                Bundle bundle = new Bundle();
                for (String str2 : listAsList) {
                    try {
                        vi1 vi1VarM7719a = z51Var.f22181b.m7719a(str2, new JSONObject());
                        vi1VarM7719a.m8559a();
                        Bundle bundle2 = new Bundle();
                        try {
                            C3694xf c3694xfMo7824H0 = vi1VarM7719a.f20804a.mo7824H0();
                            if (c3694xfMo7824H0 != null) {
                                try {
                                    bundle2.putString("sdk_version", c3694xfMo7824H0.toString());
                                } catch (mi1 unused) {
                                }
                            }
                            try {
                                C3694xf c3694xfMo7833X = vi1VarM7719a.f20804a.mo7833X();
                                if (c3694xfMo7833X != null) {
                                    try {
                                        bundle2.putString("adapter_version", c3694xfMo7833X.toString());
                                    } catch (mi1 unused2) {
                                    }
                                }
                                bundle.putBundle(str2, bundle2);
                            } catch (Throwable th) {
                                throw new mi1(th);
                            }
                        } catch (Throwable th2) {
                            throw new mi1(th2);
                        }
                    } catch (mi1 unused3) {
                    }
                }
                return new a61(bundle);
            }
        });
    }
}
